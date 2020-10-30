public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ab Cdefg");
		System.out.println(sb);

		//引数の文字列を追加
		StringBuilder sb1 = new StringBuilder("Ab Cdefg");
		System.out.println("append()	:" + sb1.append("XYZ"));

		//第一引数の前に第二引数を追加
		StringBuilder sb2 = new StringBuilder("Ab Cdefg");
		System.out.println("insert()	:" + sb2.insert(2, "ZZ"));

		//第一引数から第二引数の一つ前までを削除
		StringBuilder sb3 = new StringBuilder("Ab Cdefg");
		System.out.println("delete()	:" + sb3.delete(0, 5));

		//第一引数から第二引数の一つ前までを、第三引数と置き換え
		StringBuilder sb4 = new StringBuilder("Ab Cdefg");
		System.out.println("replace()	:" + sb.replace(3, sb4.length(), "YYY"));

		//引数で指定した箇所から最後までを出力
		StringBuilder sb5 = new StringBuilder("Ab Cdefg");
		System.out.println("substring()	:" + sb5.substring(5));
	}
}