package exam02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("두 수를 입력(형식: 숫자 숫자) -> ");
            String str = sc.nextLine();
            if (str.equals("q")) {
                break;
            }

            String[] nums = str.split("\\s+");
            int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            System.out.println(result);
        }
    }
}