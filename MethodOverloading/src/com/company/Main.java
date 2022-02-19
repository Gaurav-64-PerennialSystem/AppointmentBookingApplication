package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeter(double feet,double inches ) {
        if ((feet < 0) || ((inches < 0) || (inches >  12))) {
            System.out.println("invalid parmeters for feet and centimeters");
            return -1;
        }

        double  centimeters =(feet * 12)*2.54;
        centimeters+=inches*2.54;
        System.out.println(feet+" feet, "+inches+" inches ,"+centimeters+" cm ");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeter(double inches){
      if(inches<0){
          return -1;
      }
      double feet=(int) inches/12;
      double remainingInches=(int) inches % 12 ;
        System.out.println(inches+"inches is equal to "+feet+" feet and "+remainingInches);
        return calcFeetAndInchesToCentimeter(feet,inches);
    }
    public static void main(String[] args) {
	calcFeetAndInchesToCentimeter(10,1);
    calcFeetAndInchesToCentimeter(12);
    }
}
