package inhrt;
class Employee{
int Employeeno;
String Empname;
public Employee(int employeeno, String empname) {
Employeeno = employeeno;
Empname = empname;
}
void display()
{
System.out.println(" Employee Number = "+Employeeno);
System.out.println(" Employee Name = "+Empname);
}
}
class Manager extends Employee{
String deptname;
Manager(int Employeeno, String name, String deptname ){
super(Employeeno, name);
this.deptname = deptname;
}
void display()
{
super.display();
System.out.println(" Deptname = "+deptname);
}
}
	public class Test{
	public static void main(String[] args) {
	Manager m1 = new Manager(0101, "Ananya", "CS");
	m1.display();
}
}