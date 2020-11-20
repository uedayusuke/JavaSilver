interface MyInter {
	void methodA();
}

abstract class Super {
	abstract void methodB();
}

/*
実装と継承を同時に行う場合は、継承を先に記述する
*/
class MyClass extends Super implements MyInter {
	void methodB() {}
	public void methodA() {}
}