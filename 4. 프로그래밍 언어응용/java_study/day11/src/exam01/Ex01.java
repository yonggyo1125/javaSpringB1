package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Class cls = Book.class;
        Annotation anno = cls.getAnnotation(MyAnno.class);
        MyAnno myAnno = (MyAnno)anno;
        String[] value = myAnno.value();
        int min = myAnno.min();
        int max = myAnno.max();

        System.out.printf("value=%s,min=%d,max=%d%n", Arrays.toString(value), min, max);
    }
}
