//HashSetをインポート
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		//String型の配列を宣言
		String[] ary = {"CCC", "AAA", "BBB"};

		/*
		HashSet：
		要素の重複を許さず、インデックスを付けず順序の指定もないクラス
		*/
		//HashSetをインスタンス化
		HashSet<String> hashSet = new HashSet<>();
		//HashSet<String> hashSet = new HashSet<String>　でもOK

		//要素を追加
		hashSet.add(ary[0]);
		hashSet.add(ary[1]);
		hashSet.add(ary[2]);
		hashSet.add(ary[0]);

		//要素数の出力
		System.out.println("HashSet size	:" + hashSet.size());

		//拡張for文で要素を全て出力
		for(String a : hashSet) {
			System.out.println(a);
		}
	}
}