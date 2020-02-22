package polymorph;

public class polymorph {
	public static void main(String args[])
	{
		SuperClass sup=new SuperClass();
		sup.print();
		SubClass sub=new SubClass();
		sub.print();
		SuperClass s=new SubClass();
		s.print();
	}
}
class SuperClass{
	void print()
	{
		System.out.println("Super");
	}
}
class SubClass extends SuperClass
{
	void print()
	{
		System.out.println("Subclass");
	}
}
