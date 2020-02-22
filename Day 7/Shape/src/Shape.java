
abstract public class Shape {
	int a;
	int b;
	abstract void printArea(int a,int b);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape r=new Rectangle();
r.printArea(10,20);
Shape t=new Triangle();
t.printArea(10,20);
Shape c=new Circle();
c.printArea(10,20);
	}

}
