package ������ģʽ;

public class Test {

	public static void main(String[] args) {
		Collection collection = new CollectionImp();
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
