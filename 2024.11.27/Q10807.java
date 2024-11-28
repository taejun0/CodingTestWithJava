import java.io.*;

public class Q10807 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    int X = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i=0; i<N; i++) {
      if (Integer.parseInt(str[i]) == X) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}
