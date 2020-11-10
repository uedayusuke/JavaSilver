public class Main{
	public static void main(String[] args) {
		//下記のfor文は式2が省略されているため無限ループが起きる
		for(int i = 0; ; i++){
			/*
			if文に"break"を設置しiが3になった時にbreak文で抜ける
			if文からではなく、for文事体から抜ける!!
			*/
			if(i == 3){
				break;
			}
		System.out.println("i = " + i);
		}
	System.out.println("for文の後の処理");
	}
}