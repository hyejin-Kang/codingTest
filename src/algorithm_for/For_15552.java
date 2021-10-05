package algorithm_for;

import java.io.*;

public class For_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            String s = bf.readLine(); //해당 줄 전체를 String으로 입력받아, 스페이스로 구분하여 형변환하여 덧셈을 수행한다.
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");//bufferedWriter에 써준다.
        }
        bw.flush(); // bw.flush()는 출력이 필요할 때 한 번만 수행해주면 된다.-> bw.flush()가 화면에 출력하는 역할을 하기 때문!
    }
}
/**
 * BufferedReader 주의점
 * 1. IOException의 예외처리가 필수적이다.
 * 2. 입력받은 모든 데이터가 String으로 반환된다.
 * 3. 줄마다 입력받아서, 따로 split하여 데이터를 처리해주어야 한다.
 * 4. 숫자형식으로 받기 위해서는 형변환이 필요하다.
 */