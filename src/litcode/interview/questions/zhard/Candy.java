package litcode.interview.questions.zhard;

public class Candy {
    public static void main(String[] args) {
        int[] a = {1, 0, 2};
        System.out.println(candy(a));
    }

    public static int candy(int[] ratings) {
        int candies = ratings.length;

        boolean mark = ratings[0] < ratings[1];


        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candies++;
                mark = true;
            }
            if (ratings[i - 1] > ratings[i]) {
                if (!mark) {
                    candies++;
                } else {
                    mark = false;
                }
            }

            if(ratings[i - 1] == ratings[i] ) {
                candies += (ratings[i-1]+ratings[i+1])/2;
            }
        }

        return candies;
    }
}
