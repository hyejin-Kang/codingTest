package algorithm_1DimentionalArray;
import java.io.*;

public class OneDA_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];     //원소 9개 들어가는 배열을 미리 만들어 놓음.

        for(int i=0; i<9 ; i++){
            arr[i] = Integer.parseInt(br.readLine()); // 입력되는 9개의 정수를 차례대로 배열에 삽입
        }

        //변수 초기화
        //생각 포인트 ! index는 0부터 시작한다! 그리고 모든 숫자가 몇 번째 index에 위치해 있는지 알 필요 없고, 최대 수가 있는 index만 알면 된다.
        int max = 0;
        int index = 0;

        int count = 0;

        for(int value : arr){
            count++; //배열 시작할 때 부터 해당 숫자가 몇 번째에 있는지 알아야 하기 때문에 count값을 무조건 1 늘리고 시작한다.

            if(value>max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);

        br.close();

    }
}
