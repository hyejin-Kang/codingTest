package algorithm_1DimentionalArray;
import java.io.*;
import java.util.Arrays;

public class OneDA_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String[] array = str.split(" ");

        int max = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[0]);

        for(int i=0; i<N; i++){
            int n = Integer.parseInt(array[i]);

            if(max<n) max=n;
            if(min>n) min=n;
        }

        Arrays.sort(array);

        bw.write(min+" "+max);

        bw.flush();
        br.close();
        bw.close();
    }
}


