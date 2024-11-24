import java.util.*;
import java.io.*;

public class Q2588 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    String[] str2 = br.readLine().split(" ");
    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str2[0]);
    int C = B/100;
    int D = (B%100)/10;
    int E = (B%10);

    System.out.println(A*E);
    System.out.println(A*D);
    System.out.println(A*C);
    System.out.println(A*B);
  }
}
