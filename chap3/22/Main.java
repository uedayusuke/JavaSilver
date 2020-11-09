public class Main {
	public static void main(String[] args) {
		int num = 14;

		switch(num){
			case 1:
			case 2:
				//numの値が1か2の時実行
				System.out.println("numの値は1または2");
				break;
			case 3:
			case 4:
				//numの値が3か4の時実行
				System.out.println("numの値は3または4");
				break;
			default:
				//numの値が1~4以外の時に実行
				System.out.println("numの値は1~4ではない");
		}
	}
}