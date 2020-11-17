/*
クラスにfinal修飾子
→ [アクセス修飾子] final class クラス名 {}

final修飾子のついたクラスを元に継承できない
*/
class SuperA {}

final class SuperB {}

/*
メソッドにfinal修飾子
→ [アクセス修飾子] final 戻り値の型 メソッド名 (引数リスト) {}

final修飾子のついたメソッドはサブクラスでもオーバーライドできない
*/
class SuperC {
	void print() {}
}

class SuperD {
	final void print() {}
}

class SubA extends SuperA {}

//class SubB extends SuperB {}

class SubC extends SuperC {
	void print() {}
}

/*
class SubD extends SuperD {
	void print() {}
}
*/