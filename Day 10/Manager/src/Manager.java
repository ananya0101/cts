import java.util.HashSet;
import java.util.Set;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(22,"Jerry");
		Student s2=new Student(28,"Tom");
		Set set=new HashSet();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
	}
}
class Student extends Object{
	int age;
	String name;
	public Student(int age,String name)
	{
		super();
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Student (age is " +age + ", Name is " +name+")";
	}
	@Override
	public int hashCode()
	{
		int h=0;
		h=31*h+age;
		h=31*h+name.hashCode();
		return h;
	}
	@Override
	public boolean equals(Object obj)
	{
		Student s=(Student) obj;
		if(this.age == s.age && this.name==s.name)
			return true;
		else 
			return false;
	}
}
