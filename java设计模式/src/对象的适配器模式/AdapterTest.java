package �����������ģʽ;

public class AdapterTest {

	public static void main(String[] args) {
		Targetable targetable = new Wrapper(new Source());
		targetable.method1();
		targetable.method2();
	}
}
