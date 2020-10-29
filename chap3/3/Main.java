public class Main {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 10, d = 10;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--d);

		a = 10;
		b = 10;
		c = 10;
		d = 10;

		//aにインクリメントした後、bに代入　前置
		b = ++a;
		System.out.println("a = " + a + " b = " + b);
		//cをdに代入した後、cをインクリメント　後置
		d = c++;
		System.out.println("c = " + c + " d = " + d);
	}
}