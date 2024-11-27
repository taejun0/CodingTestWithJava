import java.util.*;
import java.io.*;

public class Q2525 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] str = br.readLine().split(" ");

    int H = Integer.parseInt(str[0]);
    int M = Integer.parseInt(str[1]);
    int Cooking = Integer.parseInt(br.readLine());

    M = M + Cooking;

    if (M>=60) {
      H = H + M/60;
      M = M%60;
    }
    if (H>=24){
      H = H%24;
    }

    System.out.println(H+" "+M);
  }
}
