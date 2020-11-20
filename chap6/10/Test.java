//抽象クラス
abstract class X {
	//抽象メソッド
	protected abstract void methodA();
}

//抽象クラス
abstract class Y {}

//具象クラス
class Z extends Y {
	//具象メソッド　オーバーライド
	protected void methodA(){}
}