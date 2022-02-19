package com.company;

public class Main {
    public static boolean isTeen(int numb1){
        if(numb1>= 13 && numb1<=19)
            return true;
        return false;
    }
    public static boolean hasTeen(int num1,int num2,int num3){
        if(num1>=13 && num1 <=19){
            return true;
        }else if(num2>=13 && num2<=19){
            return true;
        }else if(num3>=13 && num3<=19){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
	isTeen(15);
    hasTeen(13,16,17);
    }
}
