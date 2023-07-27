package validators;

public interface RequiredValidator {
    /**
     * 문자열 필수 항목 검증
     *
     * @param str
     * @param e
     */
    default void requiredCheck(String str, RuntimeException e) {
        if (str == null || str.isBlank()) {
            throw e;
        }
    }

    /**
     * true인지 검증
     * @param field
     * @param e
     */
    default void requiredTrue(boolean field, RuntimeException e) {
        if (!field) {
            throw e;
        }
    }
}
