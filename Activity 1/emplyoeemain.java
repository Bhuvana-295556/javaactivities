import java.util.*;
 class Employee
{	
String name;	
String address;	
String mobile;	
Scanner sc = new Scanner(System.in); 	
public String getName()
{	 	
return name;	
 }	
 public String getAddress()
{	
 return address;
 }	
 public String getMobile()
{	 	
return mobile;	
 }
 public void setName(String name) 
{ 	
this.name = name; 
}	
 public void setAddress(String address)
 { 	
this.address = address; 
} 
public void setMobile(String mobile) 
{ 	
this.mobile = mobile; 
} 
public String Display() 
{ 	
return "Employee details: \n name: " + getName() + "\n address: " + getAddress() + "\n mobile : "+ getMobile() ;
 } 
public void updateName()
 { 	
System.out.println("Current name is: "+ getName()); System.out.println("Enter new name: "); String newname = sc.nextLine(); setName(newname); 
} 
public void updateAddress() 
{ 
System.out.println("Current address is: "+ getAddress()); System.out.println("Enter new address"); String newaddress = sc.nextLine(); setAddress(newaddress);
 } 
public void updateMobile() 
{
 System.out.println("Current mobile number is: "+ getMobile()); System.out.println("Enter new number"); String newnum = sc.nextLine(); setMobile(newnum); 
}
} 
class EmployeeMain{ public static void main(String[] args) 
{	
Employee emp = new Employee();	
Scanner sc = new Scanner(System.in); 
System.out.println("Enter name");	
String name = sc.nextLine(); 
System.out.println("Enter address");	
String address = sc.nextLine(); 
System.out.println("Enter mobile");	
String num = sc.nextLine(); 	
emp.setName(name);	
emp.setAddress(address);	
emp.setMobile(num); 
System.out.println("\n\nVerify and update details:\n Menu"); 
while(true)
{ 
System.out.println(" 1. Update Employee name\n 2. Update Employee address\n 3. Update Employee number\n 4. All information correct/Exit"); 
int op = sc.nextInt(); 
switch(op)
 { 	
case 1: emp.updateName(); 	
 break; 	 	
case 2: emp.updateAddress(); 	
 break; 
case 3: emp.updateMobile(); 	
 break; 	
case 4: System.out.println(emp.Display()); 	
 return; 
default: System.out.println("Invalid input"); 
} 
} 
}
}

