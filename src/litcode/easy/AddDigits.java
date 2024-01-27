package litcode.easy;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        int ans = 0;
        while(num / 10 != 0){
            int temp = 0;
            while( num != 0){
                temp += num % 10;
                num /= 10;
            }
            ans = temp;
            num = temp;
        }
        return ans;
    }
}
