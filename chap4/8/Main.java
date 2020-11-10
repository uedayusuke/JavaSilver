public class Main{
	public static void main(String[] args) {
		//親の制御文"for"
		for(int i = 1; i < 10; i++){
			//入れ子の制御文"if"
			if((i % 4) == 0){
				System.out.println(i + "は 4 の倍数です。");
			}
		}

		/*
		forでは1~9が繰り返し処理され、
		そのなかでifの条件に合うものが出力される
		*/
	}
}