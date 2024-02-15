package codewar;

public class JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }
    public  static  String toJadenCase(String phrase) {
        if(phrase == null){
            return null;
        }
        StringBuilder sb = new StringBuilder(phrase);
        if(Character.isAlphabetic(sb.charAt(0))){
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }

        for (int i = 1; i < sb.length() ; i++) {
            if(sb.charAt(i-1) == ' '){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }


        return sb.toString();
    }
}
