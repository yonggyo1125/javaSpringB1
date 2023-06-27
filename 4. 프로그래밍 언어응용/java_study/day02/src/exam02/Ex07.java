package exam02;

public class Ex07 {
    public static void main(String[] args) {
        int total = 0, num = 1;

        do {
            total += num;
            num++;
        } while(num < 1);

        System.out.println(total);
    }
}
