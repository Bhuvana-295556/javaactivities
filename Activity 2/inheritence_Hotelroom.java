import java.util *;
 class HotelRoom
{ 
String hotelName; 
int numOfSqFeet;
 String hasTv; 
hasWifi;
 public HotelRoom(String hname, int nosqft, String htv, String hwifi) 
{
 hotelName = hname; 
numOfSqFeet = nosqft;
 hasTv = htv;
 this.hasWifi = hwifi; 
} 
public void calculateTarriff(int rpsf) 
{ 
int res = this.numOfSqFeet*rpsf;
 System.out.println("Room Tariff per day:s);
}
} 
class DeluxeRoom extends HotelRoom
{
 int ratePerSqFeet; 
public DeluxeRoom(String hname, int nosqft, String htv, String hasWifi) 
{ 
super(hname,nosqft,htv,hasWifi); 
ratePerSqFeet = 1 0; 
} 
String cmp = "yes";
public int getRatePerSqFt() 
{
 if(super.hasWifi.equals(cmp))	
return this.ratePerSqFeet+2; 
else	
return this.ratePerSqFeet; 
}
}
 class DeluxeAcRoom extends DeluxeRoom
{ publicDeluxeAcRoom(String hname, int nosqft, String htv, String hasWifi) { 
super(hname,nosqft,htv,hasWifi); 
super.ratePerSqFeet = 12; 
} 
public int getRatePerSqFt()	
return super. ratePerSqFeet;	
}
 }
 class SuiteACroom extends HotelRoom
{ 
private int ratepersqfeet; 
public SuiteACroom(String hname, int nosqft, String htv, String hasWifi) 
{ 
super(hname, nosqft,htv,hasWifi);	
this.ratepersqfeet = 1 5; 
}
String cmp = "yes";
 public int getRatePerSqFt() 
{ 
if(super.hasWifi.equals(cmp)) 
return ratepersqfeet+2; 
else 
return ratepersqfeet; 
}
} 
class HotelMain
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("---Hotel Tariff Calculator----");
      System.out.println(" 1. Deluxe Room \n 2. DeluxeAC Room \n 3. Suite AC     Room\n");
 System.out.println("Select Room Type: int type = sc.nextlnt();
 if(type==l) 
{
sc.nextLine(); 
System.out.println("Hotel Name: String name = sc.nextLine(); System.out.println("Square feet Area: int sqft = sc.nextlnt(); sc.nextLine();
System.out.println("Room has TV(Yes/No):”);
String tv= sc.nextLine();
System.out.println("Room has Wifi(Yes/No)”);
String wifi = sc.nextLine();
DeluxeRoom dr = new
DeluxeRoom(name,sqft,tv,wifi);	int ret = dr.getRatePerSqFt();	dr.calculateTarriff(ret);
}
 if(type==2)
{	
sc.nextLine(); 
System.out.println("Hotel Name:	String name = sc.nextLine();
System.out.println("Square feet Area: int sqft = sc.nextlnt(); sc.nextLine();
System.out.println("Room has TV(Yes/No):”);
String tv= sc.nextLine();
System.out.println("Room has Wifi(Yes/No)”);
String wifi = sc.nextLine();
DeluxeRoom dr = new
DeluxeRoom(name,sqft,tv,wifi);	int ret = dr.getRatePerSqFt();	dr.calculateTarriff(ret);
}
}

