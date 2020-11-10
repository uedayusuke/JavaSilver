public class Main {
	public static void main(String[] args) {
		int num = 0;

		/*
		do-while文
		do{
			処理文;
		}while(条件式);

		while文とは異なりまず繰り返し処理が行われる
		→一回は必ず繰り返される
		*/

		do{
			System.out.println(num + " ");
			num++;
		}while(num < 5);
	}
}