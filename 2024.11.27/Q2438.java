import java.io.*;

public class Q2438 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A = Integer.parseInt(br.readLine());

    for (int i=1; i<=A; i++){
      String str = "";
      for (int j=1; j<=i; j++){
        str += "*";
      }
      System.out.println(str);
    }
  }
}
