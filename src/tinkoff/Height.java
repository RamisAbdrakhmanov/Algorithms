package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Height {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String[] heightStudentsArr = reader.readLine().split(" ");
        Integer[] heightStudents = new Integer[heightStudentsArr.length];
        for (int i = 0; i < heightStudentsArr.length; i++) {
            heightStudents[i] = Integer.parseInt(heightStudentsArr[i]);
        }
        boolean isUsed = false;
        int iIndex = -1;
        int jIndex = -1;
        for (int i = 0; i < heightStudents.length; i++) {
            if (heightStudents[i] % 2 != (i + 1) % 2) {
                if (!isUsed && i + 1 != heightStudents.length) {
                    if (heightStudents[i + 1] % 2 != (i + 2) % 2) {
                        int swap = heightStudents[i];
                        heightStudents[i] = heightStudents[i + 1];
                        heightStudents[i + 1] = swap;

                        isUsed = true;
                        iIndex = i + 1;
                        jIndex = i + 2;
                    } else {
                        iIndex = -1;
                        jIndex = -1;
                        break;
                    }
                } else {
                    iIndex = -1;
                    jIndex = -1;
                    break;
                }
            }
        }
        System.out.println(iIndex + " " + jIndex);
    }
}
