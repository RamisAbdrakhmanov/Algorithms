package leetcode.interview.questions.easy;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i = 0; i< columnTitle.length();i++){
            sum += (columnTitle.charAt(columnTitle.length() -1 - i) - '@') * Math.pow(26 ,i);
        }
        return sum;
    }
}
