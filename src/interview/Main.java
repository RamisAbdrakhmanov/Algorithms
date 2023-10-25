package interview;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Word> list = List.of(
                Word.of("large",3),
                Word.of("phone", -6),
                Word.of("newspaper",2),
                Word.of("chocolate",-10),
                Word.of("connection",13),
                Word.of("engineering", 10)
        );

        System.out.println(list.stream()
                        .filter(Predicate.not(Word::isBad))
                .max(Comparator.comparing(Word::getPr))
                .map(Word::getValue)
                .orElse("Nothing found"));
    }


    public static class Word {
        private final String value;
        private final int pr;

        public Word(String value, int pr) {
            this.value = value;
            this.pr = pr;
        }

        static Word of(String value, int pr) {
            return new Word(value, pr);
        }

        public boolean isBad(){
            return this.value.contains("la");
        }

        public String getValue() {
            return value;
        }

        public int getPr() {
            return pr;
        }
    }
}
