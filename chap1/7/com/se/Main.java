package com.se;

// 利用したいクラス名をimport文を用いて、パッケージを含めて記述
import com.se.ren.Foo;

public class Main {
	public static void main(String[] args) {
		// Fooクラスを初期化し"f"に代入
		Foo f = new Foo();
		// f(Fooクラス)を出力
		f.print();
	}
}