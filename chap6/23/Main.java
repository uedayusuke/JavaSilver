import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] ary1 = {3, 1, 2};
		print(ary1);
		System.out.println();

		//Arraysクラスのsortメソッドで昇順に並び替え
		Arrays.sort(ary1);
		print(ary1);
		System.out.println();

		Object[] ary2 = {"hello", 2};
		/*
		異なる型の要素を持つ配列にはsortメソッドは使えない
		実行時にエラーが起きる
		Arrays.sort(ary2);
		*/
	}

	public static void print(int[] ary) {
		for(int num : ary) {
			System.out.println(num + " ");
		}
	}
}