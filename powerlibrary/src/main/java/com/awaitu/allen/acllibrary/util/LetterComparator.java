package com.awaitu.allen.acllibrary.util;




import com.awaitu.allen.acllibrary.bean.City;

import java.util.Comparator;

public class LetterComparator implements Comparator<City> {
    @Override
    public int compare(City l, City r) {
        if (l == null || r == null) {
            return 0;
        }
        String lhsSortLetters = l.pys.substring(0, 1).toUpperCase();
        String rhsSortLetters = r.pys.substring(0, 1).toUpperCase();
        if (lhsSortLetters == null || rhsSortLetters == null) {
            return 0;
        }
        return lhsSortLetters.compareTo(rhsSortLetters);
    }
}