package com.codecool;
import java.util.Random;
public class Truck extends Vehicle{

    int breakdownTurnsLeft = 0;
    Random rand = new Random();

    @Override
    public void moveForAnHour(Race race){
        if(rand.nextInt(100)>5){
            distanceTraveled += speed;
            if(breakdownTurnsLeft > 0){
                breakdownTurnsLeft -= 1;
            }
        }
        else{
            breakdownTurnsLeft += 2;
        }
    }


    public Truck() {
    speed = 100;
    name = Integer.toString(rand.nextInt(1000));
    }
}