package game.vehicles;
import game.utils.vehicleException;

public class Train extends Vehicles{

    @Override
     public void accelerate(double amount) throws vehicleException{
         if(amount < 0){
             super.accelerateCurrentSpeed(amount/10);
         }else{
             super.accelerateCurrentSpeed(amount);
         }
     }
}