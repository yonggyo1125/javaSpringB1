package exam01;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            if (num < 1) {
                return 1L;
            }

            return num * factorial(num - 1);
        } finally {
            long etime = System.nanoTime();
            System.out.println("걸린 시간 : " + (etime - stime));
        }
    }
}
