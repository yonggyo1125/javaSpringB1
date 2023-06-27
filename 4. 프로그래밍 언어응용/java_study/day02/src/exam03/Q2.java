package exam03;

public class Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10;
            System.out.println("학생" + i +", 방번호" + roomNo);
        }
    }
}
