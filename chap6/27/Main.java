import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		/*
		ラムダ式：
		(実装するメソッドの引数) -> {処理};
		*/
		Function<String, String> obj = (String str) -> {
			return "Hello " + str;
		};

		String str = obj.apply("ueda");
		System.out.println(str);
	}
}