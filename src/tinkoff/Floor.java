package tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Floor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numberOfEmployeesAndTime = br.readLine().split(" ");
        String[] floors = br.readLine().split(" ");
        long employee = Integer.parseInt(floors[Integer.parseInt(br.readLine()) - 1]);
        long min = Integer.parseInt(floors[0]);
        long max = Integer.parseInt(floors[floors.length - 1]);
        long time = Integer.parseInt(numberOfEmployeesAndTime[1]);
        if (employee - min < time || max - employee < time) {
            System.out.println(max - min);
        } else {
            long doubleFloors = Math.min(employee - min, max - employee);
            System.out.println(max - min + doubleFloors);
        }
    }
}
