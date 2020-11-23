public class Main {
	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		for (int i = 0; i < 4; i++) {
			//try：例外が発生しそうな場所
			try{
				//8行目で例外が発生し、9行目はスキップされる
				System.out.println("num :" + num[i]);
				System.out.println(" : " + (i + 1) + "回目のループ");
			}
			//catch：例外が発生した時の処理を定義　catch (例外クラス名　変数名) {}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("例外が発生しました。");
			}
		}

		//強制終了することなく下記も処理される
		System.out.println("---- end ----");
	}
}