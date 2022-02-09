/**
 * This Java Class is part of the Impro-Visor Application.
 *
 * Copyright (C) 2015-2017 Robert Keller and Harvey Mudd College
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

package imp.data.advice;

import imp.data.Key;
import imp.data.Note;
import polya.*;

/**
 *
 * @author keller
 */
public class AdviceForQuote
        extends AdviceForMelody
  {
//  public AdviceForQuote(String name, Polylist notes, String chordRoot, Key key,
//                        int[] metre, int profileNumber)
//    {
//    super(name, 0, notes, chordRoot, key, metre, null, profileNumber);
//    }
//
//  public AdviceForQuote(String name, int serial, Polylist notes,
//                        String chordRoot, Key key, int[] metre,
//                        int profileNumber)
//    {
//    super(name, serial, notes, chordRoot, key, metre, null, profileNumber);
//    }
//
  public AdviceForQuote(String name, int serial, Polylist notes,
                        String chordRoot, Key key, int[] metre,
                        Note firstNote, int profileNumber)
    {
    super(name, serial, notes, chordRoot, key, metre, firstNote, profileNumber);
    }

  }
