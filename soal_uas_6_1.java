// java pattern program soal no.6
// membuat segitiga

public class Main {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
