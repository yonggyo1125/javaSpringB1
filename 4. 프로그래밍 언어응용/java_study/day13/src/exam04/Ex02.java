package exam04;

public class Ex02 {
    public static void main(String[] args) {
        int aSpeed = 60;  // A 자동차 처음 속력
        int bSpeed = 40;  // B 자동차 처음 속력
        int aAcc = 10;  // A 자동차의 시간당 증가 시속
        int bAcc = 15;  ///A 자동차의 시간당 증가 시속

        int aDistance = aSpeed;
        int bDistance = bSpeed;

        int lapHours = 1; // 1시간 경과 후 부터 증감
        while(aDistance != bDistance) {
            if (aDistance <= 0 || bDistance <= 0) {
                System.out.println("두 자동차는 만나지 않습니다.");
                return;
            }

            aDistance += aSpeed + aAcc * lapHours;
            bDistance += bSpeed + bAcc * lapHours;
            lapHours++;
        }

        System.out.printf("%d시간 경과 후 %d km 지점에서 만납니다.", lapHours, aDistance);
    }
}
