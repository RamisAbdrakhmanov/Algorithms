package leetcode.stack;

public class CrawlerLogFolder {
        public int minOperations(String[] logs) {
            int count = 0;
            for (String log : logs) {
                if (log.charAt(0) == '.') {
                    if (log.charAt(1) == '.') {
                        if (log.length() > 2 && log.charAt(2) == '/') {
                            if (count > 0) {
                                count--;
                            }
                        } else {
                            count++;
                        }
                    }
                } else {
                    count++;
                }
            }
            return count;
        }

}
