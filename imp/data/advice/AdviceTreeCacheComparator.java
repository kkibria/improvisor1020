/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2005-2009 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Impro-Visor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * merchantability or fitness for a particular purpose.  See the
 * GNU General Public License for more details.
 *

 * You should have received a copy of the GNU General Public License
 * along with Impro-Visor; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package imp.data.advice;

import imp.data.advice.CacheComparator;

class AdviceTreeCacheComparator implements CacheComparator
  {
  public boolean compare(Object key, Object entryKey)
    {
    AdviceTreeCacheKey outsideKey = (AdviceTreeCacheKey)key;
    AdviceTreeCacheKey insideKey = (AdviceTreeCacheKey)entryKey;

    if( ! outsideKey.chordName.equals(insideKey.chordName) )
      {
      return false;
      }

    if( outsideKey.nextChordName == null && insideKey.nextChordName != null )
      {
      return false;
      }

    if( outsideKey.nextChordName != null && insideKey.nextChordName == null )
      {
      return false;
      }

    if( outsideKey.interChordHalfBeats != insideKey.interChordHalfBeats )
      {
      return false;
      }

    if( outsideKey.nextChordName != null && !outsideKey.nextChordName.equals(insideKey.nextChordName) )
      {
      return false;
      }

    if( outsideKey.notePitchClass != insideKey.notePitchClass )
      {
      return false;
      }

    // allow for asymmetric comparison
    // If the cache entry has subs, we'll use it, even
    // though subs might not be needed

    if( outsideKey.subs && !insideKey.subs )
      {
      return false;
      }

    return true;
    }
  }
