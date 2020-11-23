import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		//removeIf()メソッド
		List<Integer> date = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		date.removeIf((Integer i) -> {return i % 2 != 0;});
		//date.removeIf(i -> i % 2 != 0);
		System.out.println(date);

		//replaceAll()メソッド
		List<String> words = Arrays.asList("Tanaka", "Sato");
		words.replaceAll((String str) -> {return str.toUpperCase();});
		//words.replaceAll(str -> str.toUpperCase());
		System.out.println(words);

		//sort()メソッド
		List<Integer> list = Arrays.asList(20, 30, 10);
		list.sort((Integer o1, Integer o2) -> {return o2.compareTo(o1);});
		//list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);

		//forEach()メソッド
		List<Integer> lists = Arrays.asList(20, 30, 10);
		lists.forEach((Integer num) -> {System.out.println(num + " ");});
		//lists.forEach(num -> System.out.println(num + " "));
	}
}