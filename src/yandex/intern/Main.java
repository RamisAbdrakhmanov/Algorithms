package yandex.intern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int peopleCount;
        int programCount;
        int[] programs;
        Person[] persons;
        Queue<Person> personQueue = new PriorityQueue<>();

        try (Scanner scanner = new Scanner(System.in)) {
            String[] line = scanner.nextLine().split(" ");
            peopleCount = Integer.parseInt(line[0]);
            persons = new Person[peopleCount];
            programCount = Integer.parseInt(line[1]);
            programs = new int[programCount];
            line = scanner.nextLine().split(" ");
            for(int i = 0; i < programCount; i++) {
                programs[i] = Integer.parseInt(line[i]);
            }

            for (int i = 0; i < peopleCount; i++) {
                line = scanner.nextLine().split(" ");
                int personPrograms = Integer.parseInt(line[1]);
                Queue<Integer> programList = new LinkedList<>();
                for (int j = 0; j < personPrograms; j++) {
                    programList.offer(Integer.parseInt(line[2 + j]));
                }
                Person person = new Person(Integer.parseInt(line[0]), programList);
                persons[i] = person;
                personQueue.offer(person);
            }
        }

        for (int i = 0; i < peopleCount; i++) {
            Person person = personQueue.poll();
            do {
                int programNumber = person.programs.poll();
                int placesInProgram = programs[programNumber - 1];
                if (placesInProgram > 0) {
                    person.program = programNumber;
                    programs[programNumber - 1]--;
                    break;
                }
            } while (person.programs.size() > 0);
        }

        StringBuilder resultString = new StringBuilder();
        resultString.append(persons[0].program);
        for (int i = 1; i < persons.length; i++) {
            resultString.append(" ");
            resultString.append(persons[i].program);
        }

        System.out.println(resultString);
    }

    static class Person implements Comparable<Person> {
        int position;
        Queue<Integer> programs;

        int program = -1;

        Person(int position, Queue<Integer> programs) {
            this.position = position;
            this.programs = programs;
        }

        @Override
        public int compareTo(Person person) {
            return Integer.compare(this.position, person.position);
        }
    }
}

