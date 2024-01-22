package game.vehicles;

public class Car extends Vehicles{
    private final int maxSpeed;
    private final int cost;
    private Player owner;

    public Car(int maxSpeed, int cost){
        thsi.maxSpeed = maxSpeed;
        this.cost = cost;
        thsi.owner = owner;
    }

    public int getCost(){
        return cost;
    }

    @Override
    public String toString(){
        return this.id + ": max spedd: " + this.maxSpeed + " cost:" + this.cost;
    }


    @Override
    public void accelerate(double amount) throws vehicleException{
        if(this.getCurrentSpeed() + amount <= this.maxSpeed){
            super.accelerateCurrentSpeed(amount);
        }
    }
}