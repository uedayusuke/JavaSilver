public class Main {
	public static void main(String[] args) {
		float x1 = 3_.1415F; // 小数点の前はだめ
		float x2 = 3._1415F; // 小数点の後もだめ
		long x3 = 999_99_9999_L; // long値を表すL(l)の前後はだめ
		int x4 = _52; // 先頭はだめ
		int x5 = 5_2;
		int x6 = 52_; // 末尾もだめ
		int x7 = 5_____2;
		int x8 = 0_x52; // 16進数を表す"0x"の途中はだめ
		int x9 = 0x_52; // 16進数を表す"0x"の前後もだめ
		int x10 = 0x5_2;
		int x11 = 0_52; // 8進数を表す"0"の直顔はオッケー
	}
}