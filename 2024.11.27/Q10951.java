import java.io.*;

public class Q10951 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line=br.readLine()) != null) {
      String[] str = line.split(" ");
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);

      System.out.println(A+B);
    }
  }
}
