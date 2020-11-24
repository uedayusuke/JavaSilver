import java.io.*;

/*
throwsオーバーライドのルール：
・サブクラスのメソッドがスローする例外は、スーパークラスのメソッドがスローする例外クラスか、その例外クラスのサブクラス
・RuntimeException、またそのサブクラスの例外はスーパークラスのメソッドに関係なくスローできる
・スーパークラスのメソッドにthrowsがあっても、サブクラス側でthrowsを記述しなくてもいい
*/

class Super {
	void method() throws IOException {}
}

//何も指定していないのでok
class SubA extends Super {
	void method() {}
}

//IOExceptionのサブクラスFileNotFoundExceptionをスローしているのでok
class SubB extends Super {
	void method() throws FileNotFoundException {}
}

/*
//IoExceptionのスーパークラスExceptionをスローしているのでNG
class SubC extends Super {
	void method() throws Exception {}
}
*/

/*
//継承の関係ないClassNotFoundExceptionはNG
class SubD extends Super {
	void method() throws ClassNotFoundException {}
}
*/

//RuntimeExceptionまたそのサブクラスはいつでもOK
class SubE extends Super {
	void method() throws RuntimeException {}
}