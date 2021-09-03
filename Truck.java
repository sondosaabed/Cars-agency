 
public class Truck extends Vehicles{

   private boolean airConditionON;
   private int power;
   private int numberOfSeats;
  
   public void setAirConditionON_Off(boolean value)
   {
       airConditionON=value;
   }
   /**
   * @param numberOfSeats the numberOfSeats to set
   */
   public void setNumberOfSeats(int numberOfSeats) {
       this.numberOfSeats = numberOfSeats;
   }
  
   @Override
   public double costFor100km(PetroleumType type) {

       if(airConditionON)
           fuelConsumption=fuelConsumption+(fuelConsumption*0.2);
       return (100/fuelConsumption)*type.getDieselPrice();
   }
   /**
   * @param airConditionON the airConditionON to set
   */
   public void setAirConditionON(boolean airConditionON) {
       this.airConditionON = airConditionON;
   }
   /**
   * @param power the power to set
   */
   public void setPower(int power) {
       this.power = power;
   }
   @Override
   public String toString() {
       return super.toString()+": Truck [airConditionON=" + airConditionON + ", power=" + power + ", numberOfSeats=" + numberOfSeats
               + "]";
   }
   @Override
   public void setAirConditionOn() {
       // TODO Auto-generated method stub
      
   }
   @Override
   public void setAirConditionff() {
       // TODO Auto-generated method stub
      
   }
   @Override
   public int compareTo(Vehicles obj) {
       return this.getOwner().getName().compareTo(obj.getOwner().getName());
   }
  
  
}
