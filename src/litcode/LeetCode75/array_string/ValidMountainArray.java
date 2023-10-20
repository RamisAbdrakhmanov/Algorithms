package litcode.LeetCode75.array_string;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int j = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] >= arr[i]){
                j = i-1;
                break;
            }
        }
        if(j < 1){
            return false;
        }
        for(int i = j+1; i < arr.length; i++){
            if(arr[i-1] <= arr[i]){
                return false;
            }
        }
        return true;
    }
}
