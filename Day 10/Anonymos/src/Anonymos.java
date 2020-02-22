
public class Anonymos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A()
				{
			public void print()
			{
				System.out.println("Print of A");
			}
				};
				a.print();
	}

}
interface A
{
	void print();
}