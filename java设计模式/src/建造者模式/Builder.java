package ������ģʽ;

import java.util.ArrayList;

/**
 * ������ģʽ�ṩ���Ǵ����������ģʽ�� ��������ģʽ���ǽ����ֲ�Ʒ�����������й��� �����������϶��� ��ν���϶������ָĳ������в�ͬ������
 * ������ģʽ���ܶ๦�ܼ��ɵ�һ������
 * ���������Դ�����Ƚϸ��ӵĶ����������빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶������
 */
public class Builder {

	private ArrayList<Sender> mList = new ArrayList<Sender>();

	public void produceSmsSender() {
		mList.add(new SmsSender());
	}

	public void produceMailSender() {
		mList.add(new MailSender());
	}
}
