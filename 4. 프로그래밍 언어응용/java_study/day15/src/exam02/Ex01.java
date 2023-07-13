package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        //String str = "ABC";
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);

        //String str2 = opt.get();
        //String str2 = opt.orElse("기본값!");
        // String str2 = opt.orElseThrow();
        //String str2 = opt.orElseThrow(() -> new RuntimeException());
        String str2 = opt.orElseThrow(RuntimeException::new);
        System.out.println(str2);
    }
}
