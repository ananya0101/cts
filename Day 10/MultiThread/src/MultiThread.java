
public class MultiThread {
public static void main(String args[]) throws InterruptedException
{
	Thred t=new Thred();
	t.start();
	t.join();
	System.out.println(Thread.currentThread()+" ...."+"main");
	
}
}
class Thred extends Thread
{
	@Override
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread()+"......."+i);
	}
	}
}