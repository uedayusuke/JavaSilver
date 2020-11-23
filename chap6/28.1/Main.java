import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		int i = 25;
		Supplier<Integer> s = () -> i;
		/*
		ラムダ式から参照されるローカル変数はfinal、
		または事実上のfinal変数である為値を変更することはできない
		i++
		コンパイルエラーになる
		*/
		System.out.println(s.get());
	}
}