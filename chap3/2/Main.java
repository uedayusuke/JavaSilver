public class Main{
	public static void main(String[] args) {
		String str = "Hello";
		int a = 10, b = 20;
		System.out.println(str + a);
		System.out.println(str + a + b);	//str+aが実行されたのち+bされるので、Hello30ではなくHello1020となる
		System.out.println(str + (a + b));
		System.out.println(a + b + str);
	}
}