package yandex.lesson.sets_3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class H {
     public static void main(String[] args) throws IOException, IOException {
         BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
         long a = Long.parseLong(reader.readLine());
         Set<Long> set2 = new HashSet<>();
         long c = a;
         while (c-->0){
             String str = reader.readLine();
             String[] numb = str.split(" ");
             long horizontal = Long.parseLong(numb[0]);
             long vertical = Long.parseLong(numb[1]);
             set2.add(horizontal);
         }
             System.out.println(set2.size());

     }
   /* public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        int x = scan.nextInt();

        int[] xs = new int[x];

        for (int i = 0; i < x; i++) {
            xs[i] = scan.nextInt();
            scan.nextInt();
        }

        System.out.println(Arrays.stream(xs).distinct().count());

    }*/
}
