public class Main {
	public static void main(String[] args) {
		/*
		null
		何も参照していないことを表す
		空文字とは別！
		*/
		String str1 = null;
		String str2 = "";
		int[] array1 = null;
		int[] array2 = new int[1];
		System.out.println(str1 == null);
		System.out.println(str2 == null);
		System.out.println(array1 != null);
		System.out.println(array2 != null);
	}
}