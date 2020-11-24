import java.io.*;

public class Main {
	public static void main(String[] args) {
		//例外処理は任意
		int i = Integer.parseInt("10");

		//例外処理は必須
		FileReader r = new FileReader("Test.txt");
	}
}