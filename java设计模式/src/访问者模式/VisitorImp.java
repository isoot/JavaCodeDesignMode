package ������ģʽ;

public class VisitorImp implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject:" + sub.getSubject());
	}

}
