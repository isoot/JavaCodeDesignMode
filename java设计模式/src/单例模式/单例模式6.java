package ����ģʽ;

import java.util.Vector;

public class ����ģʽ6 {

	private static ����ģʽ6 mInstance;

	private Vector<Object> properties;

	public Vector getPorperties() {
		return properties;
	}

	public void updataProperties() {
		����ģʽ6 dan = new ����ģʽ6();
		properties = dan.getPorperties();
	}

	// ˽�л����췽��
	private ����ģʽ6() {

	}

	public static ����ģʽ6 getInstance() {
		if (mInstance == null) {
			init5();
		}
		return mInstance;
	}

	private synchronized static void init5() {
		if (mInstance == null) {
			mInstance = new ����ģʽ6();
		}
	}

	public Object readResolve() {
		return getInstance();
	}
}
