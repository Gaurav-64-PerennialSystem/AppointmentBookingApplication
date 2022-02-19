package com.company;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {

        int myValue=10000;

        int  myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("myMinIntValue: "+myMinIntValue);
        System.out.println("myMaxIntValue: "+myMaxIntValue);
        System.out.println("Busted Min value="+(myMinIntValue+1));
        System.out.println("Busted Max value="+(myMaxIntValue-1));

        int myMaxIntTest=2_147_483_647;
        byte myMinbytevalue=Byte.MIN_VALUE;
        byte myMaxbytevalue=Byte.MAX_VALUE;
        System.out.println("myMinbytevalue:"+myMinbytevalue);
        System.out.println("myMaxbytevalue:"+myMaxbytevalue);
        System.out.println("Busted Min Value="+(myMinbytevalue+1));
        System.out.println("Busted Max Value="+(myMaxbytevalue+1));
        ///////////////
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("myMinShortvalue:"+myMinShortValue);
        System.out.println("myMaxShortvalue:"+myMaxShortValue);
        System.out.println("myMinShortvalue:"+(myMinShortValue-1));
        System.out.println("myMaxShortvalue:"+(myMaxShortValue-1));
        ////////////////
        long myMinLongvalue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("myMinlongValue:"+myMinLongvalue);
        System.out.println("myMaxlongValue:"+myMaxLongValue);
        System.out.println("myMinlongValue:"+(myMinLongvalue-1));
        System.out.println("myMaxlongValue:"+(myMaxLongValue+1));



        //////////////

            double numberOfPounds=200d;
            double convertedKilograms =numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms::"+convertedKilograms);


        /////////////
        double pi=3.1415927d;
        double anotherNumber =3_000_000.4_567_890d;
        System.out.println("anotherNumber::"+anotherNumber);
        System.out.println("anotherNumber::"+pi);
        double myFirstValue=20.00d;
        double mySecondValue=80.00d;
        double myValuesTotal=myFirstValue+mySecondValue*100.00d;
        System.out.println("MyValuesTotal: "+myValuesTotal);
        double theRemainder=myValuesTotal%40.00d; 




    }
}
