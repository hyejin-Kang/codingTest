package algorithm_for;

import java.util.Scanner;

public class For_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i =1 ; i<=9; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
}
