public class Main {
	public static void main(String[] args) {
		char[] c;
		c = new char[3];
		System.out.println("cのサイズ:	" + c.length);

		int[] i = new int[4];
		System.out.println("iのサイズ:	" + i.length);

		String[] str = {"welcome", "to", "Japan"};

		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';

		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;

		System.out.println("strのサイズ:	" + str.length);
		System.out.println("c[1]:	" + c[1]);
		System.out.println("i[2]:	" + i[2]);
	}
}
