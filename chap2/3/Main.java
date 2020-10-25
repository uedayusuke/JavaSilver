public class Main {
	public static void main(String[] args) {
		// 変数を宣言し初期値を代入
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L; // long型の変数にlong値を代入するときは"L"もしくは"l"を付加
		float f = 1.15F; // float型の変数にfloat値を代入するときは"F"もしくは"f"を付加
		double d = 5.78;
		char c = 'A';
		boolean o = true;

		// 出力
		System.out.println("byte	:" + b);
		System.out.println("short	:" + s);
		System.out.println("int	:" + i);
		System.out.println("long	:" + l);
		System.out.println("float	:" + f);
		System.out.println("double	:" + d);
		System.out.println("char	:" + c);
		System.out.println("boolean	:" + o);
	}
}