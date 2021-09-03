import java.util.GregorianCalendar;

public class Owner {
   //Instance variables
   String name;
   String pin;
   String address;
   String modelNo;
   GregorianCalendar dateOfBirth;
  
   public double getAge()
   {
       return 0;
      
   }
   @Override
   public String toString() {
       return " [name=" + name + ", pin=" + pin + ", address=" + address + ", modelNo=" + modelNo
               + ", dateOfBirth=" + dateOfBirth + "]";
   }
   /**
   * @return the name
   */
   public String getName() {
       return name;
   }
   /**
   * @param name the name to set
   */
   public void setName(String name) {
       this.name = name;
   }
   /**
   * @return the pin
   */
   public String getPin() {
       return pin;
   }
   /**
   * @param pin the pin to set
   */
   public void setPin(String pin) {
       this.pin = pin;
   }
   /**
   * @return the address
   */
   public String getAddress() {
       return address;
   }
   /**
   * @param address the address to set
   */
   public void setAddress(String address) {
       this.address = address;
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
   * @return the dateOfBirth
   */
   public GregorianCalendar getDateOfBirth() {
       return dateOfBirth;
   }
   /**
   * @param dateOfBirth the dateOfBirth to set
   */
   public void setDateOfBirth(GregorianCalendar dateOfBirth) {
       this.dateOfBirth = dateOfBirth;
   }
  
  

}
