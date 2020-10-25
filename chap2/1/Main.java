public class Main {
	public static void main(String[] args) {
		System.out.println(255); // 10進数:0~9までの10個の数字を使用
		System.out.println(0b11111111); // 2進数:0.1の2つの数字を使用・頭に"0b"をつける
		System.out.println(0377); // 8進数:0~7までの8つの数字を使用・頭に"0"をつける
		System.out.println(0xff); // 16進数:0~9までの数字とA~Fまでのアルファベットを使用・頭に"0x"をつける
		System.out.println(12.33); // 浮動小数点数:小数部を持つ値
		System.out.println(4e6); // 指数:XeY = X × "Yの10乗" ・ "e"を用いて指数を表す
		System.out.println('A'); // 1文字
		System.out.println('\u3012'); // Unicode
		System.out.println("Hello"); // 文字列
		System.out.println(true); // 倫理値:true(真)かfalse(偽)の値を表す
	}
}