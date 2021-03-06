/**
 * This Java Class is part of the Impro-Visor Application.
 *
 * Copyright (C) 2016-2017 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Impro-Visor is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Impro-Visor; if not, write to the Free Software Foundation, Inc., 51 Franklin
 * St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package imp.lstm.io.leadsheet;

import imp.lstm.architecture.DataStep;
import java.util.Queue;
import imp.lstm.io.DataSequence;
import java.util.LinkedList;


import mikera.vectorz.AVector;

/**
 *
 * @author cssummer16
 */
public class LeadSheetDataSequence implements DataSequence{
    private Queue<AVector> beats;
    private Queue<AVector> chords;
    private Queue<AVector> melody;
    
    private String style;
    private String tempo;
    
    private int entrySize;
    
    public LeadSheetDataSequence()
    {
        beats = new LinkedList<>();
        chords = new LinkedList<>();
        melody = new LinkedList<>();
        entrySize = 0;
        style = "swing";
        tempo = "160";
    }
    
    public String getStyle()
    {
        return style;
    }
    
    public String getTempo()
    {
        return tempo;
    }
    
    public void concat(LeadSheetDataSequence additional)
    {
        while(!additional.beats.isEmpty())
            beats.offer(additional.beats.poll());
        while(!additional.melody.isEmpty())
            melody.offer(additional.melody.poll());
        while(!additional.chords.isEmpty())
            chords.offer(additional.chords.poll());
    }
    
    /**
     * Copies this LeadSheetDataSequence by copying input LeadSheetDataSequence's beat, chord, and melody queues (It does duplicate AVector objects!)
     * @return A duplicate of this LeadSheetDataSequence 
     */
    @Override
    public LeadSheetDataSequence copy() {
        LeadSheetDataSequence duplicate = new LeadSheetDataSequence();
        beats.stream().forEach((beat) -> {duplicate.beats.offer(beat.copy());});
        chords.stream().forEach((chord) -> {duplicate.chords.offer(chord.copy());});
        melody.stream().forEach((noteStep) -> {duplicate.melody.offer(noteStep.copy());});
        duplicate.entrySize = entrySize;
        return duplicate;
    }
    
    public AVector pollMelody() {
        return melody.poll();
    }
    
    public boolean hasMelodyLeft(){
        return !melody.isEmpty();
    }
    
    public boolean hasChordsLeft(){
        return !chords.isEmpty();
    }
    
    public void clearMelody() {
        melody = new LinkedList<>();
    }
    
    public AVector pollChords() {
        return chords.poll();
    }
    
    public AVector pollBeats() {
        return beats.poll();
    }
    
    public void pushStep(AVector beat, AVector chord, AVector note) {
        if(beat != null) {
            this.beats.offer(beat);
        }
        if(chord != null) {
            this.chords.offer(chord);
        }
        if(note != null) {
            this.melody.offer(note);
        }
    }
    
    @Override
    public int entrySize() {
        if(entrySize == 0)
            entrySize = ((!beats.isEmpty()) ? beats.peek().length() : 0) +
                    ((!chords.isEmpty()) ? chords.peek().length() : 0) +
                    ((!melody.isEmpty()) ? melody.peek().length() : 0);
        return entrySize;
    }
    
    public boolean isBalanced() {
        return beats.size() == chords.size()  && beats.size() == melody.size();
    }
    
    @Override
    public DataStep retrieve() {
        DataStep currStep = new DataStep();
        currStep.addNames("beat","chord","melody");
        currStep.addComponents(beats.poll(),chords.poll(),melody.poll());
        return currStep;
    }
    
    @Override
    public boolean hasNext() {
        return !melody.isEmpty() && !beats.isEmpty() && !chords.isEmpty();
    }
}
