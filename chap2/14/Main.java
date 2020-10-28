public class Main {
	public static void main(String[] args) {
		int[][] a1 = new int[2][];
		//int[][] a2 = new int[][2];	1次元目の要素数は省略できない
		//int[] a3 = new int[2]{};	要素数の指定と、初期化は同時にはできない
		//int[] a4 = new int[2]{10, 20};	要素数の指定と、初期化は同時にはできない
		int[] a5 = new int[]{10, 20};	//要素数の指定はなく、初期化のみのため有効
		int[] a6 = {};	//{}とある為、要素数は自動的に0の配列が生成される・有効
		int[][] a7 = {};
		int[][] a8 = new int[][]{};
		//var a9 = {10, 20};	varを使用した配列は明示的な型が必要な為エラー
		var a10 = new int[]{10, 20};	//varを使用し、型を明示しているので有効
 	}
}