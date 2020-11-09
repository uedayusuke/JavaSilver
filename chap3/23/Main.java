public class Main {
	public static void main(String[] args) {
		int num = 0;
		int a = 10;
		final int b = 20;

		switch(num){
			/*
			aは変数のためコンパイルエラー
			case a:
				System.out.println("case a :の実行");
			*/

			//bは変数だがfinalつまり"定数"のためok
			case b:
				System.out.println("case b :の実行");
			case 30:
				System.out.println("case c :の実行");
		}

	}
}