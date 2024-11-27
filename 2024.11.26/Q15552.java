import java.util.*;
import java.io.*;

public class Q15552 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int X = Integer.parseInt(br.readLine());

    for (int i=0; i<X; i++){
      String[] str = br.readLine().split(" ");
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);

      bw.write((A+B) + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
