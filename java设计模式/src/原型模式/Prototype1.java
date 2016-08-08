package ԭ��ģʽ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype1 implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private String string;

	private SerializableObject serializableObject;

	// ǳ����
	public Object clone() throws CloneNotSupportedException {
		Prototype1 prototype = (Prototype1) super.clone();
		return prototype;
	}

	// ���
	public Object deepClone() throws CloneNotSupportedException {
		try {
			// д�뵱ǰ����Ķ�������
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			// �������������������¶���
			ByteArrayInputStream bis = new ByteArrayInputStream(
					bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public SerializableObject getSerializableObjcect() {
		return serializableObject;
	}

	public void setSerizlizableObject(SerializableObject serializableObject) {
		this.serializableObject = serializableObject;
	}

	class SerializableObject implements Serializable {

		private static final long serialVersionUID = 1L;

	}
}
