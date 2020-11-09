public class Sample {
	public static void main(String[] args) {
		int num = 2;

		//"num++"は式の評価後インクリメントされるため、この場合"case 2"が返る
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

		//switch文評価後にインクリメントされているため、numは"3"
		System.out.println("switch文処理後のnの値は" + num+ "です。");
	}
}