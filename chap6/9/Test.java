abstract class SuperA {
	protected abstract void methodA();
	public void methodB(){}
}

class SubA extends SuperA {
	protected void methodA(){}
	//public void methoda(){}

	public void methodB(){}
}