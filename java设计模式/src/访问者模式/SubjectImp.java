package ������ģʽ;

public class SubjectImp implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "i love you";
	}

}
