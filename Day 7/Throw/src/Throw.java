
public class Throw {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		throw new MyException("My First Exception");
	}
}
class MyException extends ClassNotFoundException
{
	String msg;
	MyException()
	{
		
	}
	MyException(String m)
	{
		this.msg=m;
	}
	@Override
	public String toString()
	{
		return this.msg;
	}
}