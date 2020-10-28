public class Main {
	public static void main(String[] args) {
		int i;
		/*
		変数iは初期値が設定されていない為、下記を行うと"コンパイルエラー"が起こる
		System.out.println("iの値	:" + i);
		*/

		int[] array = new int[1];
		//配列を生成するとデータ型に合わせて初期値が自動的に作られる為、下記は出力される
		System.out.println("array[0]の値	:" + array[0]);

		/*
		下記は、要素数1の配列arrayに対して2番目の要素をしている為、実行時にエラーが起こる
		System.out.println("arrat[0]の値	:" + array[1]);
		*/
	}
}