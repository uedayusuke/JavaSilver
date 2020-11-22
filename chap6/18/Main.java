//ArrayListクラスをインポート
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		ArrayList：
		要素の重複OK、順序付けを行う、サイズ変更可能な配列のようなもの
		Listインターフェースを実装している
		→ ArrayList<保持するデータ型(参照型)>

		add()：要素を格納
		get()：要素を取得
		*/

		//ArrayList<>をインスタンス化
		ArrayList<Integer> list = new ArrayList<>();

		Integer i1 = 10;
		//intデータはBoxingされInteger型に変換される
		int i2 = 2;
		//重複
		Integer i3 = i1;

		//要素の追加
		list.add(i1);
		list.add(i2);
		list.add(i3);
		//インデックス1番目に5を追加
		list.add(1, 5);

		//size()：要素数を取得
		System.out.println("size	:" + list.size());

		//for文で要素を順に出力
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		//拡張for文で要素を順に出力
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}