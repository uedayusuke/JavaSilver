import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] ary = {"A", "B", "C"};
    /*
    asList()メソッド：
    配列をリストに変換
    要素の上書きは可能だが、追加や削除はできない
    */
		List<String> list = Arrays.asList(ary);
		//list.add("D");
		list.set(2, "D");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "");
		}
		System.out.println();

		int[] nums1 = {1, 0, 3};
		int[] nums2 = {1, 2, 3};
    /*
    compare()メソッド：
    2つの配列を比較
    同じ場合は"0"、第一引数が大きい場合は"1"、第二引数が大きい場合は"-1"
    */
		System.out.println("compare	:" + Arrays.compare(nums1, nums2));

    /*
    mismatch()メソッド：
    2つの配列を比較し、最初の不一致のインデックスを返す
    */
		System.out.println("mismatch	:" + Arrays.mismatch(nums1, nums2));
	}
}