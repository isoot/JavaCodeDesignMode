package ����ģʽ;

public class ����ģʽ2 {

	private static ����ģʽ2 mInstance;

	// ˽�л����췽��
	private ����ģʽ2() {

	}

	public synchronized static ����ģʽ2 getInstance() {
		if (mInstance == null) {
			mInstance = new ����ģʽ2();
		}
		return mInstance;
	}

}
