package com.codecool;
import java.util.Random;


public class Weather {
    public static boolean setRaining() {
        Random rand = new Random();
        int  n = rand.nextInt(100);
        if(n> 30){
            return false;
        }
        return true;
    }

    static boolean isRaining(){
        return setRaining();
    }
}
