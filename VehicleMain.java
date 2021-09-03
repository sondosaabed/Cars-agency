import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*This is a driver class for vehicles classes*/
public class VehicleMain {

   //List of vehicles
   static ArrayList<Vehicles> vehicleList=new ArrayList<Vehicles>();
  
   public static void main(String[] args) throws FileNotFoundException {
       //Read user input using scanner
       Scanner sc=new Scanner(System.in);
       PetroleumType petrol=new PetroleumType();
       int choice=0;
       //Loop until user quits
       while(choice!=9)
       {
           System.out.println("Menu");
           System.out.println("1.Read the data about objects from InputData.txt and store in arraylist.\n"
                   + "2.Set prices for Petroleum.\n"
                   + "4.Print sorted order vehicles in ascending order based on owner name\n"
                   + "9.Exit");
           choice=sc.nextInt();
           switch(choice)
           {
           case 1:
               //Read data from file
               readFromFile(sc);
               break;
           case 2:
               //Set petrol prices
               System.out.print("Enter price for Diesel: ");
               double dieselPrice=sc.nextDouble();
               petrol.setDieselPrice(dieselPrice);
               System.out.print("Enter price for Gasoline: ");
               double gas=sc.nextDouble();
               petrol.setGasolinePrice(gas);
               break;
           case 4:
               //Sorted List according to Owner name
               Collections.sort(vehicleList);
               System.out.println("Sorted List according to Owner name:");
               for(Vehicles obj:vehicleList)
               {
                   System.out.println(obj.toString());
               }
               break;
           case 9:
               //Quit
               System.out.println("Exiting..!");
               break;
           }
       }

   }
   //Read from file and store to arraylist
   private static void readFromFile(Scanner sc) throws FileNotFoundException
   {
       sc=new Scanner(new File("InputData.txt"));
       while(sc.hasNext())
       {
           String line=sc.nextLine();
           String[] lineArr=line.toString().split(",");
           if(lineArr[0].equalsIgnoreCase("Car"))
           {
               Car obj=new Car();
               obj.setModeName(lineArr[1]);
               obj.setModelNo(lineArr[2]);
               obj.setBrand(lineArr[3]);
               Owner owner=new Owner();
               owner.setName(lineArr[4]);
               obj.setOwner(owner);
               obj.setEngineType(lineArr[5]);
               obj.setTankSize(Double.parseDouble(lineArr[6]));
               obj.setFuelConsumption(Double.parseDouble(lineArr[7]));
               obj.setNumberOfSeats(Integer.parseInt(lineArr[8]));
               vehicleList.add(obj);
           }
           else if(lineArr[0].equalsIgnoreCase("MiniVan"))
           {
               MiniVan obj=new MiniVan();
               obj.setModeName(lineArr[1]);
               obj.setModelNo(lineArr[2]);
               obj.setBrand(lineArr[3]);
               Owner owner=new Owner();
               owner.setName(lineArr[4]);
               obj.setOwner(owner);
               obj.setEngineType(lineArr[5]);
               obj.setTankSize(Double.parseDouble(lineArr[6]));
               obj.setFuelConsumption(Double.parseDouble(lineArr[7]));
               obj.setNumberOfSeats(Integer.parseInt(lineArr[8]));
               obj.setHasAutoDoors(Boolean.valueOf(lineArr[9]));
               vehicleList.add(obj);
           }
           else if(lineArr[0].equalsIgnoreCase("Truck"))
           {
               Truck obj=new Truck();
               obj.setModeName(lineArr[1]);
               obj.setModelNo(lineArr[2]);
               obj.setBrand(lineArr[3]);
               Owner owner=new Owner();
               owner.setName(lineArr[4]);
               obj.setOwner(owner);
               obj.setEngineType(lineArr[5]);
               obj.setTankSize(Double.parseDouble(lineArr[6]));
               obj.setFuelConsumption(Double.parseDouble(lineArr[7]));
               obj.setNumberOfSeats(Integer.parseInt(lineArr[8]));
               obj.setPower(Integer.parseInt(lineArr[9]));
               vehicleList.add(obj);
           }

       }
      
      
   }

}
 