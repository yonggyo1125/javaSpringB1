package exam02;

import java.io.File;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        File file0 = new File("D:" + File.separator + "fileex" + File.separator + "file1.txt");
        if (file0.exists()) {
            file0.delete();
        }

        File dir = file0.getParentFile();
        File subDir = new File(dir, "sub");
        File subFile = new File(subDir, "file2.txt");
        if (!subDir.exists()) { // sub 디렉토리가 없는 경우
            subDir.mkdir();
        }

        subFile.createNewFile();
    }
}
