package com.company;

public class Main {
   public static void printMegaBytesAndKiloBytes(int kiloBytes){
       int MegaBytes=kiloBytes/1024;
       int remKiloBytes=kiloBytes % 1024;
       if(kiloBytes<0){
           System.out.println("invalid Value");
       }else{
           System.out.println(kiloBytes+" kb=" +MegaBytes+ " MB and " +remKiloBytes+ " KB");
       }

   }

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(8000);

    }
}
