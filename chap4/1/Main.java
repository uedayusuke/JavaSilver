public class Main {
	public static void main(String[] args) {
		int num = 0;

		/*
		while(条件式){
			処理文; 条件式がtrueの間処理文が実行される
		}
		*/
		while(num < 5){
			System.out.println(num + " ");
			num++; //インクリメント。これがないと数値に変化がないため無限ループが起きる
		}
	}
}