interface A {}
class B {}
class C extends B {}
class D {}

public class Main {
	public static void main(String[] args) {
		C obj = new C();

		/*
		instanceof演算子
		特定のオブジェクトが特定の型を持つかどうか判定
		→ 参照変数名 instanceof クラス名またはインタフェース名
		左辺で指定した変数に右辺で指定した型を持つ　true
		右辺がスーパークラスやインタフェースで左辺がそのサブクラスや実装クラス　true
		両辺に継承関係がない場合はコンパイルエラー
		*/
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		//System.out.println(obj instanceof D);
	}
}