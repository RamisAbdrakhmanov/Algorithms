package interview;

public class Ants {
    public static void main(String[] args) {
        System.out.println(calculate(4, 4, 1));
    }
    public static int calculate(int n, int left, int right) {
        int count = 0;

        boolean isLeft = true;
        boolean isRight = true;

        while (left >=0 && left <= n && right >= 0 && right <=n){
            if(left-1 != right && isLeft){
                left--;
            }else {
                isLeft = false;
                left ++;
            }

            if(right+1 != left && isRight){
                right++;
            }else {
                isRight = false;
                right--;
            }
            count++;
        }

        return count;
    }
}
