package ��ͨ����ģʽ;

/**
 * 
 * ����
 */
public class SenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SenderFactory senderFactory = new SenderFactory();
		Sender produce = senderFactory.produce("mail");
		produce.send();
	}

}
