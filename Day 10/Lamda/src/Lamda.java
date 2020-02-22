
public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=() -> System.out.println("Heyyy");
		a.print();
	}
}
interface A
{
	void print();
}