/*
インタフェース：
公開すべき必要な操作をまとめたクラス、取り決め。
→ [アクセス修飾子] interface インタフェース名 {}

インスタンス化できないため、実装クラスを作成し、実装クラスでは抽象メソッドを全てオーバーライドする
extecdsでサブインタフェースを作ることができる
宣言できる変数は全て強制的に"public static final修飾子"が付与されるので初期化しておく。
*/

/*
インタフェース下の抽象メソッド：
処理なしのメソッドを定義するとコンパイル時に強制的に"public abstract修飾子"が付与される
*/

/*
デフォルトメソッド：
具象メソッド
→ [アクセス修飾子(publicのみ)] default 戻り値 メソッド名 (引数リスト) {処理}
指定できるアクセス修飾子は"public"のみで指定していない場合はコンパイル時に強制的に付与される
java.lang.Objectクラスの"equals()"、"hasCode()"、"toString()"は定義できない
*/
interface MyInter {
	public default boolean equals(Object obj) {
		return true;
	}

	public default int hashCode() {
		return 10;
	}

	public default String toString() {
		return "hello";
	}
}