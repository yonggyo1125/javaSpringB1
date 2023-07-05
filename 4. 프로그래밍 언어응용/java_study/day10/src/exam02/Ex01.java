package exam02;

import static java.lang.Math.*;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("절대값(abs()) : " + abs(-10));
        System.out.println("반올림(round()) : " + round(10.678));
        System.out.println("반올림(round()) -  소수점 2번째 자리 반올림 : " + (round(10.678 * 10) / 10.0));
        System.out.println("올림(ceil()) :" + ceil(10.23));
        System.out.println("버림(floor()) :" + floor(10.6));
        System.out.println("2의 3승(pow()) : " + pow(2, 3));
    }
}
