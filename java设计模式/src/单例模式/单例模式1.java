package ����ģʽ;

public class ����ģʽ1 {

	private static ����ģʽ1 mInstance;

	// ˽�л����췽��
	private ����ģʽ1() {

	}

	public static ����ģʽ1 getInstance() {
		if (mInstance == null) {
			mInstance = new ����ģʽ1();
		}
		return mInstance;
	}

}
