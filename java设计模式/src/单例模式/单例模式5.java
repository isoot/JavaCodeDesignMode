package ����ģʽ;

public class ����ģʽ5 {

	private static ����ģʽ5 mInstance;

	// ˽�л����췽��
	private ����ģʽ5() {

	}

	public static ����ģʽ5 getInstance() {
		if (mInstance == null) {
			init5();
		}
		return mInstance;
	}

	private synchronized static void init5() {
		if (mInstance == null) {
			mInstance = new ����ģʽ5();
		}
	}

	public Object readResolve() {
		return getInstance();
	}
}
