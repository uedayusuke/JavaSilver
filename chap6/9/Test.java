/*
具象クラス：
処理内容を記述した具象メソッドを定義し、インスタンス化して使用できるクラス
抽象メソッドを持つことはできない

具象メソッド：
処理内容を記述したメソッド
*/

/*
抽象クラス（abstractクラス）：
処理内容を記述しない抽象メソッドを定義し、サブクラスが作成されることを前提に定義されるクラス
また、具象メソッド・抽象メソッドを両方持つことができる
複数のクラスで共通の名前や呼び出し方を持つべきメソッドは抽象クラスで宣言し、サブクラスで中身を実装するのがベター
→ [アクセス修飾子] abstract class クラス名 {}


抽象メソッド（abstractメソッド）：
処理内容を記述しないメソッド
→ [アクセス修飾子] abstract 戻り値 メソッド名 (引数リスト);
処理を持たないので{}を記述せず、;で終わる
*/

/*
抽象クラスの継承：
サブクラスが具象クラスの場合、元となる抽象クラスの抽象メソッドを全部オーバーライドする。
また、具象メソッドのオーバーライドは任意
*/

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