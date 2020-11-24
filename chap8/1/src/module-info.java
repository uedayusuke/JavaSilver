/*
モジュール：
関連するパッケージ、リソース。モジュール記述子の集まり
*/
/*
モジュール記述子：
モジュールの名前、依存性を指定したファイル
"module-info.java"で定義したモジュール宣言をコンパイルしたもの
→ つまり"module-info.class"
*/
/*
モジュール宣言：
moduke モジュール名（一意） {}
*/
module com.seshop.sample {
	/*
	java.baseは全てのモジュールに依存し、暗黙的に含まれる為省略可
	requires java.base;
	*/
}
