public class Sample {
	public static void main(String[] args) {
		int num = 2;

		switch(num++){
			case 1:
				System.out.println("nの値は1です。");
				break;
			case 2:
				System.out.println("nの値は2です。");
				break;
			default:
				System.out.println("nの値は1でも2でもないです。");
		}

		System.out.println("switch文処理後のnの値は" + num+ "です。");
	}
}