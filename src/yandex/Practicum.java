package yandex;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dog implements Comparable<Dog> {

    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nickname, dog.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public int compareTo(Dog o) {
        return this.nickname.compareTo(o.nickname);
    }

    /* Вам предстоит реализовать метод compareTo и, возможно, equals —
    подумайте, какая между ними связь. */
}

public class Practicum {

    public static void main(String[] args) {
        List<Dog> unsortedDogs = Stream.of(
                        "Дружок", "Пушок", "Тузик", "Ромео",
                        "Белка", "Стрелка", "Бобик", "Афоня",
                        "Волчок")
                .map(Dog::new)
                .collect(Collectors.toList());

        // найдите Белку
        Dog dog = new Dog("Белка");
        String result = search(unsortedDogs, dog)
                .map(d -> "А вот и собака по кличке " + d + " нашлась")
                .orElseGet(() -> "Нет собаки по кличке " + dog + " :(");

        System.out.println(result);
    }

    private static <T extends Comparable<T>> Optional<T> search(List<T> unsortedList, T searchObject) {
        // искать легче по упорядоченному списку — вам поможет алгоритм сортировки
        int idx = -1;
        Collections.sort(unsortedList);
        for (int i = 0; i < unsortedList.size(); i++) {
            if (unsortedList.get(i).equals(searchObject)) {
                idx = i;
            }
        }// найдите Белку, учтите, что idx может быть -1, если ничего не нашлось.
        if (idx == -1) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(unsortedList.get(idx));
        }
    }

    // методы сортировки и поиска
}