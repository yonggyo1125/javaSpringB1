package exam02;

public class Ex11 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Melon,Apple";
        int pos1 = fruits.indexOf("Apple");
        System.out.println("pos1 = " + pos1);

        int pos2 = fruits.lastIndexOf("Apple");
        System.out.println("pos2 = " + pos2);

        int pos3 = fruits.indexOf("Banana");
        System.out.println("pos3 = " + pos3);

        String fruit1 = fruits.substring(fruits.lastIndexOf("Apple"));
        System.out.println("last Apple : " + fruit1);

        String fruit2 = fruits.substring(1, 4); // 1,2,3
        System.out.println(fruit2);

        System.out.println("length() : " + fruits.length());
    }
}
