package leetcode.stack;

import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    while (!stack.isEmpty()) {
                        int a = stack.pop();
                        if (nums2[a] > nums1[i]) {
                            ans[i] = nums2[a];
                            break;
                        }
                    }
                    if (ans[i] == 0) {
                        ans[i] = -1;
                    }
                } else {
                    stack.push(j);
                }
            }
            stack.clear();
        }

        return ans;
    }
}
