public class Main{
	public static void main(String[] args) {
		int count = 5;

		/*
		whileの場合
		条件式の"count != 5"でfalseが返るため一度も実行されない
		*/
		while(count != 5 && count > 0){
			System.out.println("while	: count = " + count);
			count--;
		}

		//変わっていないが明示的に再代入
		count = 5;

		/*
		do-while文
		最初に処理文が実行されるため、ディクリメントされ、5~1が出力される
		*/
		do{
			System.out.println("do-while	: count = " + count);
			count--;
		}while(count != 5 && count > 0);
	}
}