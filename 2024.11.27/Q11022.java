import java.io.*;

public class Q11022 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine());

    for (int i=1; i<=X; i++) {
      String[] str = br.readLine().split(" ");

      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);

      System.out.println("Case #" + i +": " + A +" + "+ B + " = " + (A+B));
    }
  }
}
