package basic;

import java.util.Scanner;

/**
 * 입력에 따른 사각형 별 출력 기본문제
 */
public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =0; i < b; i++) {
            for(int j=0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
