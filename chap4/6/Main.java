public class Main{
	public static void main(String[] args) {
		int count1 = 0;

		//式1を省略
		for(; count1 < 5; count1++){
			System.out.println(count1 + "");
		}

		//改行
		System.out.println();

		//式3を省略
		for(int count2 = 0; count2 < 5;){
			//式の評価後にcount2をインクリメント
			System.out.println(count2++ + "");
		}

		//式2の省略も可能だが、常にtrueが返るため無限ループとなる
	}
}