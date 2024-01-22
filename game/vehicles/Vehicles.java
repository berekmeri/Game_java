package game.vehicles;

import game.utils.vehicleException;

public abstract class Vehicles{

    private static int currentId = 0;
    protected final int id;
    private double currentSpeed;

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Vehicles(){
        this.id = currentId++;
    }

    protected final void accelerateCurrentSpeed(double amount) throws vehicleException{
        if(this.currentSpeed + amount < 0){
            throw new vehicleException("invalid amount");
        }
        this.currentSpeed += amount;
    }

    public abstract void accelerate(double amount) throws vehicleException;

}