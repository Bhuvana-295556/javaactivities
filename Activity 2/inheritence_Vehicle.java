import java.util *; 
class Vehicle
{ 
protected String make; 
protected String vehicleNumber; 
protected String fuel Type; 
protected int fuelCapacity;
protected int cc; 
public Vehicle(String make,String vehicleNumber,String fuel Type,int fuelCapacity,int cc)
 { 
this.make = make; 
this.vehicleNumber = vehicleNumber; 
this.fuelType = fuel Type;
this.fuelCapacity = fuelCapacity; 
this.cc = cc; 
} 
public String getMake()
{ 
return this.make;
 } 
public String getVN() 
{ 
return vehicleNumber;
 } 
public String getFT() 
{ 
return fuel Type; 
}
 public int getFC() 
{ 
return fuelCapacity; 
}
 public int getCC() 
{ 
return cc; 
} 
public void displayBasic()
 {
System.out.println("****"+getMake()+"****");
System.out.println("------Basic Information-------");
System.out.println("\/ehicle Number:"+getVN());	
System.out.println("Capacity:"+getFC());	
System.out.println("Fuel Type:"+getFT());	
System.out.println("CC: "+getCC());	
}
} 
class TwoWheeler extends Vehicle 
 { 
private String kickStart; 
public TwoWheeler(String make,String vehicleNumber,String fuel Type,int fuelCapacity,int cc,String kick)
{ 
super(make,vehicleNumber,fuelType,fuelCapacity,cc);	
this.kickStart = kick.toUpperCase();
 } 
public String getlnfo() 
{	
return this.kickStart; 
}
 public void displayDetaillnfo()
 { 	
   System.out.println("\n-------DetailInformation-------\n");    System.out.println("Kick start available : "+ getlnfo());
 }
} 
class FourWheeler extends Vehicle
{
 String audioSystem; 
int numberOfDoors;
 public FourWheeler(String make,String vehicleNumber,String fuel Type,int fuelCapacity,int cc,String audioSystem, int numberOfDoors)
{
 super(make,vehicleNumber,fuelType,fuelCapaci ty,cc); 
this.audioSystem = audioSystem; 
this.numberOfDoors = numberOfDoors; 
} 
public String getAudio()
 { 
return this.audioSystem;
 }
 public int getNod() 
{ 
return numberOfDoors; 
}

 public void displayDetaillnfo()
{ 
System.out.println("\n---Detail Information----\n"); 
System.out.println("Audio System: "+getAudio()); 
System.out.println("Number of Doors: " + getNod()); 
}
} 
class vehicleMain
{
 public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);
System.out.println("Type of vehicle: \n 1 . Four Wheeler \n 2. Two Wheeler\n"); 
int type = sc.nextlnt(); 
if(type ==1)
{
sc.nextLine(); 
System.out.println("Vehicle Make : String make = sc.nextLine()); System.out.println("vehicleNumber : String vehicleNumber = sc.nextLine()); sc.nextLine();
System.out.println("FuelType (Petrol/Desiel):”);
String fuelType = sc.nextLine();
System.out.println("Fuelcapacity : int fuelCapacity = sc.nextInt());
int fuelcapacity = sc.nextInt();
System.out.println("cc : int cc = sc.nextInt());
int cc = sc.nextInt();
System.out.println("KickStart Available(Yes/No)”);
String Kickstart = sc.nextLine();

}
	
