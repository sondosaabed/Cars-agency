 
public class MiniVan extends Vehicles{

   private int numberOfSeats;
   private boolean airConditionON;
   private boolean hasAutoDoors;
  
   public void setAirConditionON_Off(boolean value)
   {
       airConditionON=value;
   }

   @Override
   public String toString() {
       return super.toString()+": MiniVan [numberOfSeats=" + numberOfSeats + ", airConditionON=" + airConditionON + ", hasAutoDoors="
               + hasAutoDoors + "]";
   }

   /**
   * @param numberOfSeats the numberOfSeats to set
   */
   public void setNumberOfSeats(int numberOfSeats) {
       this.numberOfSeats = numberOfSeats;
   }

   /**
   * @param airConditionON the airConditionON to set
   */
   public void setAirConditionON(boolean airConditionON) {
       this.airConditionON = airConditionON;
   }

   /**
   * @param hasAutoDoors the hasAutoDoors to set
   */
   public void setHasAutoDoors(boolean hasAutoDoors) {
       this.hasAutoDoors = hasAutoDoors;
   }

   @Override
   public double costFor100km(PetroleumType type) {

       if(airConditionON)
           fuelConsumption=fuelConsumption+(fuelConsumption*0.2);
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

   @Override
   public int compareTo(Vehicles obj) {
       return this.getOwner().getName().compareTo(obj.getOwner().getName());
   }

}
