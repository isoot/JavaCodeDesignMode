package �۲���ģʽ;

public class MySubject extends AbstractSubject {
	@Override
	public void operation() {
		System.out.println("updata self!");
		notifyObserver();
	}
}
