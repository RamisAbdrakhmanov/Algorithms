package leetcode.interview.questions.easy;

import java.util.Objects;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        String[] strs = s.split("");
        int ans = 0;
        for (int i = strs.length - 1; i >= 0; i--) {

            switch (strs[i]) {
                case "I" -> ans += 1;
                case "V" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "I")) {
                            ans += 5;
                        } else {
                            ans += 4;
                            i--;
                        }
                    } else {
                        ans += 5;
                    }
                }
                case "X" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "I")) {
                            ans += 10;
                        } else {
                            ans += 9;
                            i--;
                        }
                    } else {
                        ans += 10;
                    }
                }
                case "L" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "X")) {
                            ans += 50;
                        } else {
                            ans += 40;
                            i--;
                        }
                    } else {
                        ans += 50;
                    }
                }
                case "C" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "X")) {
                            ans += 100;
                        } else {
                            ans += 90;
                            i--;
                        }
                    } else {
                        ans += 100;
                    }
                }
                case "D" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "C")) {
                            ans += 500;
                        } else {
                            ans += 400;
                            i--;
                        }
                    } else {
                        ans += 500;
                    }
                }
                case "M" -> {
                    if (i != 0) {
                        if (!Objects.equals(strs[i - 1], "C")) {
                            ans += 1000;
                        } else {
                            ans += 900;
                            i--;
                        }
                    } else {
                        ans += 1000;
                    }
                }
            }
        }
        return ans;
    }
}
