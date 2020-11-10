public class Main{
	public static void main(String[] args) {
		int count = 5;

		while(count != 5 && count > 0){
			System.out.println("while	: count = " + count);
			count--;
		}

		count = 5;
		do{
			System.out.println("do-while	: count = " + count);
			count--;
		}while(count != 5 && count > 0);
	}
}