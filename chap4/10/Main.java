public class Main{
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++){
			if((i % 3) == 0){
				System.out.println("処理をスキップします");
				//continue文により、for文の式3にスキップ
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("for文後の処理");
	}
}