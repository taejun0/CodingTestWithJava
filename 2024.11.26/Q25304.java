import java.util.*;
import java.io.*;

public class Q25304 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int sum = 0;

    for (int i=0; i<N; i++ ){
      String[] str = br.readLine().split(" ");
      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);

      sum += a*b;
    }
    if (X == sum) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
    
  }
}
