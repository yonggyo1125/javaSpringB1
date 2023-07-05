package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;
        String str = trans.name(); // trans.toString();
        System.out.println(str);

        int pos = trans.ordinal();
        System.out.println(pos);

        Transportation bus = Enum.valueOf(Transportation.class, "BUS");
        System.out.println(bus); // bus.toString();
    }
}
