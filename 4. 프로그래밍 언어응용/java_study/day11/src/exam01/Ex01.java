package exam01;

import java.lang.annotation.Annotation;

public class Ex01 {
    public static void main(String[] args) {
        Class cls = Book.class;
        Annotation anno = cls.getAnnotation(MyAnno.class);

        MyAnno myAnno = (MyAnno)anno;
        String value = myAnno.value();
        System.out.println(value);
    }
}
