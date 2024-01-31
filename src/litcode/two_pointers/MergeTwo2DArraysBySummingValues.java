package litcode.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        mergeArrays(new int[][]{{148, 597}, {165, 623}, {306, 359}, {349, 566}, {403, 646}, {420, 381}, {566, 543},
                        {730, 209}, {757, 875}, {788, 208}, {932, 695}},
                new int[][]{{74, 669}, {87, 399}, {89, 165}, {99, 749}, {122, 401}, {138, 16}, {144, 714}, {148, 206},
                        {177, 948}, {211, 653}, {285, 775}, {309, 289}, {349, 396}, {386, 831}, {403, 318}, {405, 119},
                        {420, 153}, {468, 433}, {504, 101}, {566, 128}, {603, 688}, {618, 628}, {622, 586}, {641, 46},
                        {653, 922}, {672, 772}, {691, 823}, {693, 900}, {756, 878}, {757, 952}, {770, 795}, {806, 118},
                        {813, 88}, {919, 501}, {935, 253}, {982, 385}});
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();

        int iterator1 = 0;
        int iterator2 = 0;

        while (iterator1 < nums1.length && iterator2 < nums2.length) {
            if (nums1[iterator1][0] == nums2[iterator2][0]) {
                list.add(new int[]{nums1[iterator1][0], nums1[iterator1][1] + nums2[iterator2][1]});
                iterator1++;
                iterator2++;
            } else if (nums1[iterator1][0] < nums2[iterator2][0]) {
                list.add(new int[]{nums1[iterator1][0], nums1[iterator1][1]});
                iterator1++;
            } else {
                list.add(new int[]{nums2[iterator2][0], nums2[iterator2][1]});
                iterator2++;
            }
        }

        while (iterator1 < nums1.length) {
            list.add(new int[]{nums1[iterator1][0], nums1[iterator1][1]});
            iterator1++;
        }

        while (iterator2 < nums2.length) {
            list.add(new int[]{nums2[iterator2][0], nums2[iterator2][1]});
            iterator2++;
        }

        int[][] ans = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            int[] row = list.get(i);
            ans[i] = row;
        }

        return ans;
    }
}
