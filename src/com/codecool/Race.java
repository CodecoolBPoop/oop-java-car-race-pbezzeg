package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {
   private List<Car> car = new ArrayList<>();
   private List<Truck> truck = new ArrayList<>();
   private List<Motorcycle> motor = new ArrayList<>();

    public boolean isThereABrokenTruck(){
        for (int i = 0; i < truck.size() ; i++) {
            if(truck.get(i).breakdownTurnsLeft > 0){
                return true;
            }
        }
        return false;
    }

    private void createVehicles(){
        for (int i = 0; i < 10; i++) {
            car.add(new Car());
            truck.add(new Truck());
            motor.add(new Motorcycle());
        }


    }

    private void simulateRace(){
            Weather.setRaining();
        for (int i = 0; i < 50; i++) {

            for (int j = 0; j < car.size(); j++) {
                car.get(j).moveForAnHour(this);
            }
            for (int k = 0; k < truck.size(); k++) {
                truck.get(k).moveForAnHour(this);
            }
            for (int l = 0; l < motor.size(); l++) {
                motor.get(l).moveForAnHour(this);
            }
        }
    }

    private void printRaceResult(){
        for (int i = 0; i < car.size() ; i++) {
            System.out.println("Car name: "+car.get(i).name );
            System.out.println("Car distance traveled: "+car.get(i).distanceTraveled );
        }
        for (int i = 0; i < truck.size() ; i++) {
            System.out.println("Truck name: "+truck.get(i).name );
            System.out.println("Truck distance traveled: "+truck.get(i).distanceTraveled );
        }
        for (int i = 0; i < motor.size() ; i++) {
            System.out.println("Motor name: "+motor.get(i).name );
            System.out.println("Motor distance traveled: "+motor.get(i).distanceTraveled );
        }
    }

    public static void main(String[] args) {
        Race r = new Race();
        r.createVehicles();
        r.simulateRace();
        r.printRaceResult();

    }
}
