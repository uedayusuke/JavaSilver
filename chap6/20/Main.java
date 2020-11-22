//パッケージ下の全てのクラスをインポート　オンデマンドインポート
import java.util.*;

public class Main {
	public static void main(String[] args) {
		/*
		HashMap：
		一意のキーとそれに対応する値をペアに保存する
		キーは識別可能なように一意だが、値は重複してもOK
		*/
		HashMap<Integer, String> map = new HashMap<>();
		//HashMap<Integer, String> map = new HashMap<Integer, String>(); でもOK

		/*
		put(キー, 値)でキーと値を追加
		Mapにはputを使う。addだとコンパイルエラーになる
		*/
		map.put(0, "AAA");
		map.put(1, "BBB");
		map.put(2, "AAA");
		map.put(1, "CCC");

		//for文で要素を順番に出力
		for(int i = 0; i < map.size(); i++){
			System.out.println(map.get(i) + "");
		}
		System.out.println();

		/*
		keySet()：
		全てのキーを取得
		*/
		Set<Integer> keys = map.keySet();
		for(Integer key : keys){
			System.out.println(key + "");
		}
		System.out.println();

		/*
		values()：
		全ての値を取得
		*/
		Collection<String> values = map.values();
		for(String value : values){
			System.out.println(value + "");
		}
	}
}