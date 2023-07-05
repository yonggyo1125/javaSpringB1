package exam02;

public class Ex09 {
    public static void main(String[] args) {
        String str = "ABC";
        str = str.concat("DEF");
        System.out.println(str);
        System.out.println(str.contains(new StringBuffer("BC")));
    }
}
