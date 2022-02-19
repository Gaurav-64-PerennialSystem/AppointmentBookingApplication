package com.company;

public class Main {

public static String getDurationstring(long minutes,long seconds){
    if( (minutes < 0 )  || (seconds < 0) || (seconds > 59)){
        return "Invalid Value";
    }
    long hours= minutes / 60;
    long  remainingMinutes = minutes % 60;
    return hours+" HH "+remainingMinutes+" MM " +seconds+ "Sec" ;
}
public static String getDurationstring(long seconds){
    if(seconds < 0){
        return "Invalid Value";
    }
    long minutes= seconds / 60;
    long remainingseconds=seconds % 60;
    return getDurationstring(minutes,remainingseconds);
}



    public static void main(String[] args) {
        System.out.println(getDurationstring(120,30 ));
        System.out.println(getDurationstring(9876L));
    }
}
