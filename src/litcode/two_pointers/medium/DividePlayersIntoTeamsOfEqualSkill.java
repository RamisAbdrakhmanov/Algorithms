package litcode.two_pointers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DividePlayersIntoTeamsOfEqualSkill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l = 0;
        int r = skill.length - 1;

        long check = (long) skill[l] + skill[r];

        long sum = (long) skill[l++] * skill[r--];



        while (l < r) {
            if ((long) skill[l] + skill[r] != check) {
                return -1;
            }
            sum += (long) skill[l++] * skill[r--];
        }

        return sum;
    }
}
