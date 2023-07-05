package exam02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.print("두 수를 입력 (형식 : 숫자 숫자) -> ");
            String str = br.readLine();
            if (str.equals("q")) {
                break;
            }

            String[] nums = str.split("\\s+");
            int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            System.out.println(result);
        }
    }
}
