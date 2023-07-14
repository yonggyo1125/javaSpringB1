package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws IOException  {
        //int ch = System.in.read();
        //System.out.println((char)ch);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str = br.readLine();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
