package ��̬��������ģʽ;

/**
 * 
 * ����
 */
public class SenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SenderFactory.produceMail().send();
		SenderFactory.produceSms().send();
	}

}
