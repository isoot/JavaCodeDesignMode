package �Ž�ģʽ;

public class BridgeTest {

	public static void main(String[] args) {
		// ��һ���Ž�ģʽ
		Bridge bridge = new MyBridge();
		Sourceable sourceable = new SourceSub1();
		bridge.setSourceable(sourceable);
		bridge.method();

		// �ڶ����Ž�ģʽ
		Sourceable sourceable2 = new SourceSub2();
		bridge.setSourceable(sourceable2);
		bridge.method();
	}

}
