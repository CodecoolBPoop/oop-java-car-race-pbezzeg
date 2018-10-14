package com.codecool;
import java.util.Random;
public class Motorcycle extends Vehicle{

    private static int counter;

    @Override
    public void moveForAnHour(Race race){
        if(Weather.isRaining()){
            Random rand = new Random();
            distanceTraveled += (speed - (rand.nextInt(45)+5));
        }
        distanceTraveled += speed;
    }

    public Motorcycle() {
        name ="Motorcycle " + counter;
        counter ++;
        speed = 100;
    }
}
