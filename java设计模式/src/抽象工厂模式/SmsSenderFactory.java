package ���󹤳�ģʽ;

/**
 * 
 * ���͹���
 */
public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
