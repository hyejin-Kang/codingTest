package algorithm_for;

import java.io.*;

public class for_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        bf.close();

        for(int i=0; i<n; i++){
            bw.write(n-i+"\n");
        }
        bw.flush();
    }
}
