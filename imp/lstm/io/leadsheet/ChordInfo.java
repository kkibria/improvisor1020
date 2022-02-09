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

import imp.data.Chord;

/**
 *
 * @author cssummer16
 */
public class ChordInfo {
    private int duration;
    private String root;
    private String type;
    private String bass;
    
    public ChordInfo(int duration, String root, String type, String bass) {
        this.duration = duration;
        this.root = root;
        this.type = type;
        this.bass = (bass == null) ? root : bass;
    }
    
    public ChordInfo(int duration, String root, String type) {
        this(duration, root, type, null);
    }

    ChordInfo(Chord chord) {
        this.duration = chord.getRhythmValue() / Constants.RESOLUTION_SCALAR;
        this.root = chord.getRoot().toUpperCase();
        this.bass = chord.getChordSymbol().getBass().toString().toUpperCase();
        this.type = chord.getQuality();
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public String getRoot()
    {
        return root;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getBass()
    {
        return bass;
    }
}
