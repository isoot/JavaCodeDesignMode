package ����ģʽ;

public class ProxyTest {

	public static void main(String[] args) {
		Sourceable sourceable = new Proxy(new Source());
		sourceable.method();
	}
}
