package yandex.lesson.first_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String a = reader.readLine();
        String[] numbStr = a.split(" ");
        int apartmentOne = Integer.parseInt(numbStr[0]);
        int floors = Integer.parseInt(numbStr[1]);
        int apartmentTwo = Integer.parseInt(numbStr[2]);
        int entranceTwo = Integer.parseInt(numbStr[3]);
        int floorTwo = Integer.parseInt(numbStr[4]);


        System.out.println(getEntranceAndFlour(apartmentOne,floors,apartmentTwo,entranceTwo,floorTwo));
    }

    public static String getEntranceAndFlour(int apartmentOne,
                                             int floors,
                                             int apartmentTwo,
                                             int entranceTwo,
                                             int floorTwo){

        if(floorTwo>floors){
            return -1 + " " + -1;
        }



        int floorOne = 0;
        int entranceOne = 0;
        if(floors != 1){
            if(floorTwo == 1 && entranceTwo == 1){
                entranceOne = 0;
            } else {
                int check = (entranceTwo-1)*floors + floorTwo;
                if(apartmentTwo < check){
                    return -1 + " " + -1;
                }
                int apartmentsPerFloor = apartmentTwo/(check-1);
                if(apartmentTwo/apartmentsPerFloor != ((entranceTwo-1)*floors)+floorTwo){
                    System.out.println(apartmentTwo/apartmentsPerFloor);
                    System.out.println((entranceTwo-1)*floors+floorTwo);
                    return -1 + " " + -1;
                }

                entranceOne = (apartmentOne/apartmentsPerFloor)/floors + 1;
                floorOne = ((apartmentOne-1)/apartmentsPerFloor)%floors + 1;

            }
        } else {
            floorOne = 1;
        }
        return entranceOne + " " + floorOne;
    }
}
