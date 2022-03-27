package app;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundWeight(double value) {
        DecimalFormat df = new DecimalFormat("0.000");
        return df.format(value);
    }
}
