package litcode.easy;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String[] strings = address.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length-1; i++) {
            stringBuilder.append(strings[i]).append("[.]");
        }
        stringBuilder.append(strings[strings.length-1]);
        return String.valueOf(stringBuilder);
    }
}
