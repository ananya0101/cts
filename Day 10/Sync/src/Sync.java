
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
class Table
{
	synchronized void printTable(int n)
	{
		System.out.println("Before");
		for(int i=0;i<5;i++)
		{
			System.out.println(n*i);
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	System.out.println("After");
}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread 
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
