package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String medal = "금메달";
        switch(medal) {
            case "금메달" :
                System.out.println("1등");
                break;
            case "은메달" :
                System.out.println("2등");
                break;
            case "동메달" :
                System.out.println("3등");
                break;
            default :
                System.out.println("입상");
        }
    }
}
