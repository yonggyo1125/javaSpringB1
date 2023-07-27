package validators;

public interface LengthValidator {
    default void lengthCheck(String str, int overLen, RuntimeException e) {
        if (str.length() < overLen) {
            throw e;
        }
    }
}
