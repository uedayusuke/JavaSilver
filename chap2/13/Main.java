public class Main{
	public static void main(String[] args) {
		/*
		要素数3の配列arrayを作成し、各要素にバラバラぼ要素数の配列をそれぞれ作成
		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[2];
		*/

		int[][] array = {
			{10, 20, 30},
			{50, 60, 70, 80, 90},
			{100, 200}
		};

		System.out.println("array[0][0]の値:	" + array[0][0]);
		System.out.println("array[1][4]の値:	" + array[1][4]);
		System.out.println("array[2][1]の値:	" + array[2][1]);
	}
}