public class Main {
	public static void main(String[] args) {
		int[] a1 = {10};
		int[] a2 = {10};
		//見た目は同じであるが、別々に作られ、参照先も異なるため"false"
		System.out.println("a1 == a2	:" + (a1 == a2));

		int[] a3 = {10};
		int[] a4 = a3;
		//同一のデータを参照しているため"true"
		System.out.println("a3 == a4	:" + (a3 == a4));
 	}
}