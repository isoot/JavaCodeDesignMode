package ����ģʽ;

public class ����ģʽ4 {

	// ˽�л����췽��
	private ����ģʽ4() {

	}

	public static ����ģʽ4 getInstance() {
		return ����ģʽ4Factory.mInstance;
	}

	static private class ����ģʽ4Factory {
		private static ����ģʽ4 mInstance = new ����ģʽ4();
	}

	public Object readResolve() {
		return getInstance();
	}
}
