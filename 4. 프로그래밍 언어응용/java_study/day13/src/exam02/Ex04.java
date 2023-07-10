package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] fruits1 = { "Apple", "Orange", "Melon", "Mango"};
        String[] fruits2 = { "Apple", "Melon", "Orange", "Mango"};

        int pos = Arrays.mismatch(fruits1, fruits2);
        System.out.println(pos);
    }
}
