//抽象クラス
abstract class SuperA {
	//抽象メソッド
	protected abstract void methodA();

	//具象メソッド
	public void methodB(){}
}

//具象クラス
class SubA extends SuperA {
	//抽象メソッドをオーバーライド 必須!!
	protected void methodA(){}
	//public void methoda(){}

	//具象メソッドのオーバーライドは任意
	public void methodB(){}
}