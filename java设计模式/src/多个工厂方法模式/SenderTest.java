package �����������ģʽ;

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
		senderFactory.produceMail().send();
		senderFactory.produceSms().send();
	}

}
