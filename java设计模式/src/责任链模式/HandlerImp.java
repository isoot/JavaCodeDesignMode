package ������ģʽ;

public class HandlerImp extends AbstractHandler implements Handler {

	private String name;

	public HandlerImp(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + " deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
