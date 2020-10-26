public class Main {
  public static void main(String[] args) {
    int num1 = 10;
    long num2  = 30;
    /*
    以下の理由でコンパイルエラーを起こす
    ↓ 整数のリテラルはデフォルトでまずint型で認識されるため、桁数が大きい場合扱えない。その為、long型の変数に代入する前に末尾にL(もしくはl)をつける必要がある
    long num3 = 10000000000;

    ↓ 浮動小数点のリテラルはデフォルトでdouble型として認識される為、float型の変数に代入する前に末尾にF(もしくはf)をつける必要がある
    float num4 = 10.0;
    */
  }
}
