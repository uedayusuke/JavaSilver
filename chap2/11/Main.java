public class Main {
	public static void main(String[] args) {
		int[][] array;	//2次元配列"array"を宣言
		array = new int[3][4];	//arrayを生成・要素数は3×4
		//int[][] array = new int[3][4];	←省力したバージョン

		//各要素に数値を代入
		array[0][0] = 100;
		array[0][3] = 200;

		//出力
		System.out.println("array[0][0]の値:	" + array[0][0]);
		System.out.println("array[0][3]の値:	" + array[0][3]);
	}
}