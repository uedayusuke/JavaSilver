package com.seshop.sample.main;
//下記でFirstクラスをインポート
import com.seshop.sample.firstpkg.First;
import com.seshop.sample.secondpkg.Second;

public class Main {
	public static void main(String[] args) {
		System.out.println("Module System!");
		//Firstクラスのxメソッドを呼び出し
		First.x();
		Second.y();
	}
}