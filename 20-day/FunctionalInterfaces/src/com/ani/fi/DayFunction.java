package com.ani.fi;

import java.util.function.Function;

public class DayFunction implements Function<Integer, String> {
    @Override
    public String apply(Integer day) {

        if (day == 1)
            return "MON";
        if (day == 2)
            return "TUE";
        if (day == 3)
            return "WED";
        if (day == 4)
            return "THU";
        if (day == 5)
            return "FRI";
        if (day == 6)
            return "SAT";
        if (day == 7)
            return "SUN";
        return "Invalid Day";
    }
}
