public class Main {
	public static void main(String[] args) {
		char[] c;	//char型の配列"c"を宣言
		c = new char[3];	//配列cの作成、要素数3
		System.out.println("cのサイズ:	" + c.length);

		int[] i = new int[4];	// int型の配列"i"を宣言し、作成、要素数4
		System.out.println("iのサイズ:	" + i.length);

		String[] str = {"welcome", "to", "Japan"};	//Stirng型の配列"str"を宣言し、初期化

		//配列cの各要素に値を代入
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';

		//配列iの各要素に値を代入
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;

		System.out.println("strのサイズ:	" + str.length);
		System.out.println("c[1]:	" + c[1]);
		System.out.println("i[2]:	" + i[2]);
	}
}
