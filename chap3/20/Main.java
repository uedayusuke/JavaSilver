public class Main {
	public static void main(String[] args) {
		int a = 10;

		if(a > 0){
			System.out.println("aは生の値です。");

			//処理ブロックの中に別のif文を記述 → ネスト（入れ子）
			if(a % 2 == 0){
				System.out.println("aは偶数です。");
			}
		}else{
			if(a == 0){
				System.out.println("aは0です。");
			}else{
				System.out.println("aは負の値です。");
			}
		}
	}
}