public class Main {
	public static void main(String[] args) {
		/*
		配列の宣言・領域の確保・値の代入をまとめて行う
		*/
		int[][] array = {
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{100, 200, 300, 400}
		};

		System.out.println("array[0][0]の値:	" + array[0][0]);
		System.out.println("array[0][3]の値:	" + array[0][3]);
		System.out.println("array[2][3]の値:	" + array[2][3]);
	}
}