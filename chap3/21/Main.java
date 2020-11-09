public class Main {
	public static void main(String[] args) {
		int num = 2;

		/*
		switch(式){
			case 定数1:	//式の結果が定数1と一致した時、以下の処理文を実行。
				処理文;
			case 定数2:	//式の結果が定数2と一致した時、以下の処理文を実行。
				処理文;
				break;	//処理を実行したのち、switch文を抜ける。
			default:	//式の結果が、上記のどのcaseにも一致しない時、以下の処理文を実行。
				defaultの処理文;
		}
		*/
		switch(num){
			case 1:
				System.out.println("numの値は1です。");
				break;
			case 2:
				System.out.println("numの値は2です。");
			default:
				System.out.println("defaultです。");
		}
	}
}