package exam02;

import java.io.File;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        File file = new File("/dir1/dir2/dir3/../../dir4/file.txt");
        String absPath = file.getAbsolutePath();
        System.out.println(absPath);

        String canPath = file.getCanonicalPath();
        System.out.println(canPath);

    }
}
