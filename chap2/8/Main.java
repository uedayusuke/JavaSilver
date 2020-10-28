public class Main {
	// var a = 100; メンバ変数(インスタンス変数)にvarは使用不可
	// static var b = 100; メンバ変数(static変数)にvarは使用不可
	public static void main(String[] args) {
		var c = "hello!"; // "hello!"が代入され、String型
		var d = 100; // 100が代入され、int型
		// var e; 初期値を指定せずにvarは使えない
		// var f = null; nullは型が不明なので不可
		final var g = 100; // 定数は使用可能
		// var final h = 100;
	}
}