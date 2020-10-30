public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ab Cdefg");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("Ab Cdefg");
		System.out.println("append()	:" + sb1.append("XYZ"));

		StringBuilder sb2 = new StringBuilder("Ab Cdefg");
		System.out.println("insert()	:" + sb2.insert(2, "ZZ"));

		StringBuilder sb3 = new StringBuilder("Ab Cdefg");
		System.out.println("delete()	:" + sb3.delete(0, 5));

		StringBuilder sb4 = new StringBuilder("Ab Cdefg");
		System.out.println("replace()	:" + sb.replace(3, sb4.length(), "YYY"));

		StringBuilder sb5 = new StringBuilder("Ab Cdefg");
		System.out.println("substring()	:" + sb5.substring(5));
	}
}