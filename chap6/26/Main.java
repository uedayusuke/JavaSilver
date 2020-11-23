import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		//クラス名を指定せずに、クラスの定義、メソッドの実装、オブジェクト生成を一つの式として直接記述
		String str = new Function<String, String>() {
			public String apply(String str) {
				return "Hello " + str;
			}
		}.apply("yusuke");

		System.out.println(str);
	}
}