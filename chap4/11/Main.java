public class Main {
	public static void main(String[] args) {
		//ラベル"loop1"を設定
		loop1:
		for(int x = 0; x < 3; x++){

			for(int y = 0; y < 3; y++){
				System.out.println("x = " + x + " y = " + y);
				if(x == 1 && y == 1){
					System.out.println("break文の実行");
					/*
					ラベル"loop1"にbreak
					→外側のfor文処理が終了
					*/
					break loop1;
				}
			}
		}

		System.out.println("------------------------");

		//ラベル"loop2"を設定
		loop2:
		for(int x = 0; x < 3; x++){

			for(int y = 0; y < 3; y++){
				System.out.println("x = " + x + " y = " + y);
				if(x == 1 && y == 1){
					System.out.println("continue文の実行");
					/*
					ラベル"loop2"にcontinue
					→内側のfor文の処理をスキップし、外側のfor文に制御を移す
					*/
					continue loop2;
				}
			}
		}
	}
}