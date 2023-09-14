package litcode.interview.questions.medium;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s =  "PAHNAPLSIIGYIR";
        System.out.println(convert(s, 3));
    }

    public static String convert(String s, int numRows) {
        StringBuilder[] str = new StringBuilder[numRows];
        for (int i = 0; i < s.length(); i+=numRows+1) {
            
        }
        return null;
    }

   /* public static String convert(String s, int numRows) {
        String[] str = s.replace(" ", "").split("\n");
        if(str.length == 1){
            return str[0];
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str[0].length(); i++) {
            stringBuilder.append(str[0].charAt(i));
            for (int j = 1; j < str.length - 1; j++) {
                stringBuilder.append(str[j].charAt(i * 2));
            }
                stringBuilder.append(str[str.length - 1].charAt(i));

            for (int j = str.length - 2; j >= 1; j--) {
                if (str[j].length() > i * 2+1) {
                    stringBuilder.append(str[j].charAt((i * 2) + 1));
                }
            }
        }
        return String.valueOf(stringBuilder);
    }*/ //решал не ту задачу требуется просто строчки по очереди слепить, а я вернул обратно все, жалко удалять
}
