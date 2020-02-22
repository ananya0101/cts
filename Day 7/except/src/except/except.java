package except;

public class except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int ar[]= {1,2,3};
		try {
			System.out.println("In the Try");
			int res=x/0;
			System.out.println(res);
			int a=ar[3];
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divie by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException");
		}
	}

}
