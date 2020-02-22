import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ananya");
		list.add("Jerry");
		list.add("Tom");
		Iterator it = list.iterator();
		while (it.hasNext()) {
		String object = (String) it.next();
		System.out.println(object);
		if("Bell".equals(object)){
		 it.remove();
}
}
		System.out.println(list);
	}

}