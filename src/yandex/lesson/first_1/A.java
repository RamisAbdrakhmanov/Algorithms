package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] temperatures = reader.readLine().split("\\s");
        String command = reader.readLine();;

        int fromTemperature = Integer.parseInt(temperatures[0]);
        int toTemperature = Integer.parseInt(temperatures[1]);

        System.out.println(getTemperature(command,fromTemperature,toTemperature));
    }

    public static int getTemperature(String command, int fromTemperature, int toTemperature) {
        switch (command){
            case "freeze":
                return Math.min(fromTemperature, toTemperature);
            case "heat":
                return Math.max(fromTemperature, toTemperature);
            case "auto":
                return toTemperature;
            case "fan":
                return fromTemperature;

        }

        return 0;
    }
}
