package exam03;

public class Ex02 {
    public static void main(String[] args) {

        Transportation trans = Transportation.TAXI;

        switch (trans) {
            case TAXI :
                System.out.println("택시!");
                break;
            case BUS :
                System.out.println("버스!");
                break;
            case SUBWAY:
                System.out.println("지하철!");
                break;
        }
    }
}
