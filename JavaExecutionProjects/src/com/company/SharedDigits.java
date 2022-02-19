package com.company;

public class SharedDigits {

    public boolean shareDigit(int a, int b) {
        boolean answer = false;
        int lefta = a/10;
        int righta = a % 10;
        int leftb = b/10;
        int rightb = b % 10;
        if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){
            answer = true;
        }
        return answer;
    }
}
