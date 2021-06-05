Public class customer 
{
Private string name;
Private string address;
Private string mobile;
Public void getInput()
{
Scanner in = new Scanner (System.in);
System.out.print(“Enter the name:”);
name=in.next();
System.out.print(“Enter the address:”);
address=in.next();
System.out.print(“Enter the mobile:”);
Mobile=in.next();
}
Public void display()
{
System.out.println(“Enter the  Details”);
System.out.println(“Name: ” +name);
System.out.println(“Adress : ” +address);
System.out.println(“Mobile: ” +mobile);
}
Public static void main(String[]args)
{
Employee e[] = new Employee[5];
For(int i=0;i<5;i++)
{
e[i]=new employee();
e[i].getInput();
}
For(int i=0;i<5;i++)
{
e[i].display();
}
}
}

