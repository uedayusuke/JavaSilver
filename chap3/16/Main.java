public class Main {
	public static void main(String[] args) {
		int num = 5;

		/*
		if(条件式){
			処理文; 条件式の結果が"true"の時のみ実行される
		}

		結果の判定は必ず"boolean値"で行う!
		処理文が!一文!の時は{}は省略可能
		*/
		if(num < 10){
			System.out.println("numの値は10未満です。");
		}

		num = 100;
		if(num >= 100)
			//処理文が一文のため{}を省略
			System.out.println("numの値は100以上です。");

		System.out.println("2つ目のif文の後の処理");
	}
}