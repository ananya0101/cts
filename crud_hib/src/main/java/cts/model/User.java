package cts.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User 
{
	@Id
	private int sid;
    private String name;
    private int age;
	
    public int getSid() 
    {
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int sid, String name, int age) 
	{
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "User [sid=" + sid + ", name=" + name + ", age=" + age + ", getSid()=" + getSid() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}