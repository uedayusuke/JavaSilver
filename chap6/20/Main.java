import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(0, "AAA");
		map.put(1, "BBB");
		map.put(2, "AAA");
		map.put(1, "CCC");

		for(int i = 0; i < map.size(); i++){
			System.out.println(map.get(i) + "");
		}
		System.out.println();

		Set<Integer> keys = map.keySet();
		for(Integer key : keys){
			System.out.println(key + "");
		}
		System.out.println();

		Collection<String> values = map.values();
		for(String value : values){
			System.out.println(value + "");
		}
	}
}