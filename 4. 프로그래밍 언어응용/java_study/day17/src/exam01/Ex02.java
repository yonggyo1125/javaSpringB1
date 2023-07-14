package exam01;

import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        System.setErr(new PrintStream ("error.log"));

        String str = null;
        str.toUpperCase();
    }
}
