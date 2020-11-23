import java.util.*;

public class Main {
	public static void main(String[] args) {
		/*
		HashSet：
		順不同で管理するため、規則性なく出力される
		*/
		HashSet<Integer> hSet = new HashSet<>();
		hSet.add(300);
		hSet.add(20);
		hSet.add(500);
		System.out.println("HashSet	:" + hSet);

		/*
		TreeSet：
		要素をソートして管理するため昇順で出力される
		自然順序づけ(文字列は辞書順、数値は昇順)される
		*/
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(300);
		tSet.add(20);
		tSet.add(500);
		System.out.println("TreeSet	:" + tSet);
	}
}