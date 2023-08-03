package exam01;

public class ProxyCalculator implements Calculator {

    private Calculator cal;

    public ProxyCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 공통 추가 기능
        try {
            long result = cal.factorial(num); // 핵심 기능을 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 추가 기능
            System.out.println("걸린시간 : " + (etime - stime));
        }
    }
}
