package exam02;

public class ProxyCalculator implements Calculator {

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); // 추가기능
        try {
            
            long result = calculator.factorial(num); // 핵심 기능

            return result;
            
        } finally {
            long etime = System.nanoTime(); // 추가기능
            System.out.println("걸린 시간 : " + (etime - stime));
        }
    }
}
