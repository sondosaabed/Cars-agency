public class Car extends Vehicles {
  
   private int numberOfSeats;
   private boolean airConditionON;
  
   public void setAirConditionON_Off(boolean value)
   {
       airConditionON=value;
   }

     
   @Override
   public double costFor100km(PetroleumType type) {

       if(airConditionON)
           fuelConsumption=fuelConsumption+(fuelConsumption*0.1);
       return (100/fuelConsumption)*type.getGasolinePrice();
   }

   @Override
   public void setAirConditionOn() {
       // TODO Auto-generated method stub
      
   }

   @Override
   public void setAirConditionff() {
       // TODO Auto-generated method stub
      
   }

   /**
   * @param numberOfSeats the numberOfSeats to set
   */
   public void setNumberOfSeats(int numberOfSeats) {
       this.numberOfSeats = numberOfSeats;
   }


   @Override
   public String toString() {
       return super.toString()+": Car [numberOfSeats=" + numberOfSeats + ", airConditionON=" + airConditionON + "]";
   }


   @Override
   public int compareTo(Vehicles obj) {
      
       return this.getOwner().getName().compareTo(obj.getOwner().getName());
   }

  
}
