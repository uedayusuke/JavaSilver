public class Main {
	public static void main(String[] args) {
		char c = 'p';

		/*
		if(条件式1){
			処理文; //条件式1が"true"の時に実行
		}else if(条件式2){
			処理文; //条件式1が"false"で条件式2が"true"の時に実行
		}else{
			条件式1.2共に"false"の時に実行
		}
		*/
		if(c == 'a'){
			System.out.println("c の値は a です。");
		}else if(c == 'b'){
			System.out.println("c の値は b です。");
		}else{
			System.out.println("c の値は a でも b でもありません。");
			System.out.println("c の値は " + c + " です。");
		}
	}
}