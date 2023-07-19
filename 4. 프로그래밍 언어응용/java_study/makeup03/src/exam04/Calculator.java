package exam04;

public interface Calculator {
     int num = 10; // public static final -> 정적 상수
     int add(int num1, int num2); // public abstract

     default int minus(int num1, int num2) {
          return num1 - num2;
     }
}
