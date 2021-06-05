Public class company 
{
Private string name;
Private string employes;
Private string Teamlead;
Public void getInput()
{
Scanner in = new Scanner (System.in);
System.out.print(“Enter the name:”);
name=in.next();
System.out.print(“Enter the employes:”);
address=in.next();
System.out.print(“Enter the Teamlead:”);
Mobile=in.next();
}
Public void display()
{

System.out.println(“Name: ” +name);
System.out.println(“employes: ” +employes);
System.out.println(“Teamlead : ” +Teamlead);
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



