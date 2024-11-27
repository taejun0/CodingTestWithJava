import java.util.*;
import java.io.*;

public class Q2884 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    
    int H = Integer.parseInt(str[0]);
    int M = Integer.parseInt(str[1]);

    M = M - 45;

    if (M<0) {
      H = H - 1;
      M = M + 60;
    }
    if (H<0) {
      H = 23;
    }

    System.out.println(H +" " +M);
  }
}
