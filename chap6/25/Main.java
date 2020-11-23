//Functionインタフェースをインポート
import java.util.function.Function;

/*
Functionインタフェースを実装
→ Function<T, R>
引数としてTを受け取りRを返す
*/

/*
apply(T t)
*/
class MyFunc implements Function<String, String> {
	public String apply(String str) {
		return "Hello " + str;
	}
}

public class Main {
	public static void main(String[] args) {
		//MyFuncクラス（実装クラス）をインスタンス化
		MyFunc obj = new MyFunc();
		String str = obj.apply("yusuke");
		System.out.println(str);
	}
}