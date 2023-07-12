package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ex07 {
    public static void main(String[] args) {
        long[] nums = LongStream.iterate(2, x -> x * x).limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
