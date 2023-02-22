package com.company;
public class SpeedConverter {
        public static double PrintConversion(double KilometersPerHour) {
            if(KilometersPerHour<0) {
                System.out.println("Invalid Value");
            }
            else {
                long milesPerHour = Math.round(KilometersPerHour/1.609);
                System.out.println(KilometersPerHour+" km/h = "+milesPerHour+" mi/h");
            }
            return KilometersPerHour;
        }
}
