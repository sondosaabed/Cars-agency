public abstract class Vehicles implements Comparable<Vehicles>,Cloneable{
   //Instance variables
   String modeName;
   String modelNo;
   String brand;
   String engineType;
   double tankSize;
   double fuelConsumption;
   public Owner owner;

   public abstract double costFor100km(PetroleumType type);
   public double MovableDistance()
   {//capacity fuelConsumption*tankSize
       return fuelConsumption*tankSize;

   }

   public abstract void setAirConditionOn();
   public abstract void setAirConditionff();
   /**
   * @return the modeName
   */
   public String getModeName() {
       return modeName;
   }
   /**
   * @param modeName the modeName to set
   */
   public void setModeName(String modeName) {
       this.modeName = modeName;
   }
   /**
   * @return the modelNo
   */
   public String getModelNo() {
       return modelNo;
   }
   /**
   * @param modelNo the modelNo to set
   */
   public void setModelNo(String modelNo) {
       this.modelNo = modelNo;
   }
   /**
   * @return the brand
   */
   public String getBrand() {
       return brand;
   }
   /**
   * @param brand the brand to set
   */
   public void setBrand(String brand) {
       this.brand = brand;
   }
   /**
   * @return the engineType
   */
   public String getEngineType() {
       return engineType;
   }
   /**
   * @param engineType the engineType to set
   */
   public void setEngineType(String engineType) {
       this.engineType = engineType;
   }
   /**
   * @return the tankSize
   */
   public double getTankSize() {
       return tankSize;
   }
   /**
   * @param tankSize the tankSize to set
   */
   public void setTankSize(double tankSize) {
       this.tankSize = tankSize;
   }
   /**
   * @return the fuelConsumption
   */
   public double getFuelConsumption() {
       return fuelConsumption;
   }
   /**
   * @param fuelConsumption the fuelConsumption to set
   */
   public void setFuelConsumption(double fuelConsumption) {
       this.fuelConsumption = fuelConsumption;
   }
   /**
   * @return the owner
   */
   public Owner getOwner() {
       return owner;
   }
   /**
   * @param owner the owner to set
   */
   public void setOwner(Owner owner) {
       this.owner = owner;
   }

   @Override
   public String toString() {
       return "Vehicles [modeName=" + modeName + ", modelNo=" + modelNo + ", brand=" + brand + ", engineType="
               + engineType + ", tankSize=" + tankSize + ", fuelConsumption=" + fuelConsumption + ", owner=" + owner
               + "]";
   }

} 

 
 
