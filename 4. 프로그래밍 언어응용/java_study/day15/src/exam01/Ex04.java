package exam01;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Ex04 {

    private static List<Book> books;
    public static void main(String[] args) {
        books = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(Ex04::addBook);

        IntSummaryStatistics stat = books.stream().mapToInt(Book::getPrice).summaryStatistics();
        int max = stat.getMax();
        int min = stat.getMin();
        double avg = stat.getAverage();
        long total = stat.getSum();
        long cnt = stat.getCount();

        System.out.printf("최대값 : %d, 최소값 : %d, 평균 : %.2f, 합계 : %d, 갯수 : %d%n",
                max, min, avg, total, cnt);
    }

    private static void addBook(int num) {
        int price = 10000 * (int)(Math.random() * 4 + 1); // 1~4, 10000~40000
        books.add(new Book("책" + num, "저자" + num, "출판사" + num, price));
    }

}
