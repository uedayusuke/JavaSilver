public class Main{
	public static void main(String[] args) {
		char[] array = {'a', 'b', 'c', 'd', 'e'};

		/*
		拡張for文
		for(変数宣言 : 参照変数名){
			処理文;
		}

		変数宣言で宣言する型は、参照変数の型と合わせる
		*/

		//拡張for文
		for(char c : array){
			System.out.println(c + " ");
		}

		//for文
		System.out.println();

		for(int count = 0; count < array.length; count++){
			System.out.println(array[count] + " ");
		}
	}
}