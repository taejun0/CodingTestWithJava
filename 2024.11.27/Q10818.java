import java.io.*;
import java.util.Arrays;

public class Q10818 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    String[] str = br.readLine().split(" ");
    int[] arr = new int[N];

    for (int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    
    Arrays.sort(arr);

    System.out.println(arr[0]+ " " +arr[N-1]);
  }
}
