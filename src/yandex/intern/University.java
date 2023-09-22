package yandex.intern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class University {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] a = br.readLine().split(" ");
        int numbOfStudents = Integer.parseInt(a[0]);
        int numbOfGroups = Integer.parseInt(a[1]);


        String[] b = br.readLine().split(" ");
        long[] groups = new long[b.length];

        for (int i = 0; i < groups.length; i++) {
            groups[i] = Integer.parseInt(b[i]);
        }

        List<Student> students = new ArrayList<>();
        while (br.ready()){
            String[] c = br.readLine().split(" ");
            int[] student = new int[c.length];

            for (int i = 0; i < c.length; i++) {
                student[i] = Integer.parseInt(b[i]);
            }


            List<Integer> groupsSt = new ArrayList<>();
            for (int i = 2; i < students.size(); i++) {
                groupsSt.add(student[i]);
            }
            students.add(new Student(student[0],student[1],groupsSt));
        }
    }
}

class Student implements Comparable<Student>{
    int rate;
    int count;
    List<Integer> programs;

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public Student(int rate, int count, List<Integer> programs) {
        this.rate = rate;
        this.count = count;
        this.programs = programs;
    }


}
