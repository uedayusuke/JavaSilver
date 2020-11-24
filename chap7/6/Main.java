//独自例外クラス
class MyException extends Exception {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			int age = -10;
			//check()メソッドを呼び出し
			checkAge(age);
		} catch (MyException e) {
			System.out.println("不正な値です。age :" + e.getAge());
		}
	}

	public static void checkAge(int age) throws MyException {
		if(age >= 0) {
			System.out.println("OK");
		} else {
			/*
			throw：
			例外クラスや独自例外クラスをインスタンス化した例外オブジェクトを、任意の場所で呼び出し元にスローできる
			*/
			MyException e = new MyException();
			e.setAge(age);
			throw e;
		}
	}
}