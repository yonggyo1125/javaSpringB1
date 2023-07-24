package coding.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Ex09 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int[] result = getExpired(today, terms, privacies);
        System.out.println(Arrays.toString(result));

        today = "2020.01.01";
        terms = new String[]{"Z 3", "D 5"};
        privacies = new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        result = getExpired(today, terms, privacies);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getExpired(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);

        Map<String, Integer> _terms = Arrays.stream(terms)
                .collect(toMap(s -> s.split("\\s+")[0], s-> Integer.valueOf(s.split("\\s+")[1])));

        List<Integer> expired = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split("\\s+");

            LocalDate pDate = LocalDate.parse(privacy[0], formatter);
            int months = _terms.get(privacy[1]);

            LocalDate eDate = pDate.plusMonths(months).minusDays(1);

            if (date.isAfter(eDate)) {
                expired.add(i + 1);
            }
        }

        return expired.stream().mapToInt(x->x).toArray();
    }
}
