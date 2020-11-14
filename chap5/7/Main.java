import java.util.Arrays;

class Test {
	public void method(String... val) {
		String size = "";
		size += val == null ? "" : val.length;
		//Arrays.toString()を用いて配列の中身を表示する
		System.out.println(Arrays.toString(val) + " : " + size);
	}
}

public class Main {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.method("A", "B");
		obj.method(null);
		obj.method((String[])null);
		obj.method();
		obj.method((String)null);
	}
}