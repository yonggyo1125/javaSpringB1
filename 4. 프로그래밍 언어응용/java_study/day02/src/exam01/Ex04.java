package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num = 10; // num가 5 이상(>= 5) 이고(AND)  30 이하(<=30)인가?
        boolean result1 = num >= 5;
        boolean result2 = num <= 30;

       // boolean result3 = result1 && result2;
        boolean result3 = num >= 5 && num <= 30;
        System.out.println(result3);
    }
}
