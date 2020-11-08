public class Main {
	public static void main(String[] args) {
		int num = 20;

		/*
		if(条件式){
			処理文1; //条件式の結果が"true"の時実行される
		}else{
			処理文2; //条件式の結果が"false"の時に実行される
		}
		*/
		if(num < 10){
			System.out.println("numの値は10未満です。");
		}else{
			System.out.println("numの値は10以上です。");
		}

		System.out.println("if-else文の後の処理。");
	}
}