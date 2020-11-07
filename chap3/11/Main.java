public class Main {
	public static void main(String[] args) {
		String s1 = "Hello";

		//"new"を使うとStringクラスの管轄を外れ初期値となる個別の文字列が作られる
		String s2 = new String("Hello");
		String s3 = "Hello";

		/*
		"internメソッド"
		同一の文字列がある場合　→　それを参照する。使い回す
		同一の文字列がない場合　→　String型の持つ領域内に文字列を作成。返り値を返す
		*/
		String s4 = s2.intern();

		//s2は参照先が違うため"false"
		System.out.println("s1 == s2	:" + (s1 == s2));
		//Stringのプール（領域）上に同じ文字列が存在するため"true"
		System.out.println("s1 == s3	:" + (s1 == s3));

		//s4はs2の領域外の"Hello"をinternで領域内に作成するため"false"
		System.out.println("s1 == s4	:" + (s1 == s4));

		//s2は参照先が違うため"false"
		System.out.println("s2 == s4	:" + (s2 == s4));

		//equalsは中身を参照するため"true"!!
		System.out.println("s1.equals(s2)	:" + (s1.equals(s2)));

		/*
		→演算子は参照先の比較を行うため、中身がが同じであっても、参照先が異なれば"false"
		 "new"はStringクラスの管轄外のため参照先は別!!
		*/
	}
}