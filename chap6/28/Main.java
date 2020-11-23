import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		/*
		左辺
		型の省略：インタフェース宣言時に型は決まっている為、省略可
		{}の省略：引数が一つの場合は省略可

		右辺
		{}・returnの省略：処理が一文の場合は省略可
		*/
		Function<String, String> obj = str -> "Hello " + str;
		String str = obj.apply("yusuke");
		System.out.println(str);
	}
}