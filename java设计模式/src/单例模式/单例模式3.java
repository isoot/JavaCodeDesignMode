package ����ģʽ;

public class ����ģʽ3 {

	private static ����ģʽ3 mInstance;

	// ˽�л����췽��
	private ����ģʽ3() {

	}

	public static ����ģʽ3 getInstance() {
		if (mInstance == null) {
			synchronized (mInstance) {
				if (mInstance == null) {
					mInstance = new ����ģʽ3();
				}
			}
		}
		return mInstance;
	}
}
