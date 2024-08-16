package leetcode.binary_tree.midium;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        double ans = 1;
        int down = 1;

        for (int i = 2; i <= n; i++) {
            ans *=i+n;
            ans/=i;
        }

        return (int) ans;
    }
}
