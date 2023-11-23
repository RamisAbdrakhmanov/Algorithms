package litcode.arr_2d;

import java.util.*;

public class DiagonalTraverseII {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
       int  h = nums.size();
       List<Integer>[] rows = new ArrayList[100001];
       int rowsSize = 0;
       int resSize = 0;
        for (int i = 0; i < h; i++) {
            resSize += nums.get(i).size();
            for (int j = 0; j < nums.get(i).size() ; j++) {
                int row = i + j;
                if(rows[row] == null){
                    rows[row] = new ArrayList<>();
                }
                rows[row].add(nums.get(i).get(j));

                rowsSize = Math.max(rowsSize,row);
            }
        }

        int[] res = new int[resSize];
        int index = 0;
        for (int i = 0; i <= rowsSize ; i++) {
            for (int j = rows[i].size()-1; j >=0 ; j--) {
                res[index++] = rows[i].get(j);
            }
        }
        return res;
    }


    /*
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        PriorityQueue<MyClass> pr = new PriorityQueue<>(new Comp());

        for (int i = 0; i < nums.size(); i++) {
            List<Integer> list = nums.get(i);
            for (int j = 0; j < list.size(); j++) {
                MyClass myClass = new MyClass(i, j, list.get(j));
                pr.add(myClass);
            }
        }

        int[] ans = new int[pr.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = pr.poll().val;
        }

        return ans;
    }

    class  Comp implements Comparator<MyClass>{
        @Override
        public int compare(MyClass o1, MyClass o2) {
            if (o1.h + o1.w == o2.h + o2.w) {
                return o2.h - o1.h;
            }
            return (o1.h + o1.w) - (o2.h + o2.w);
        }
    }

    class MyClass  {
        public int h;
        public int w;
        public int val;

        public MyClass(int h, int w, int val) {
            this.h = h;
            this.w = w;
            this.val = val;
        }
    }*/



    /*public int[] findDiagonalOrder(List<List<Integer>> nums) {

        int bottom = nums.size();

        int right = 0;

        int allSize = 0;
        for (List<Integer> num : nums) {
            int size = num.size();
            right = Math.max(right, size);
            allSize += size;
        }
        int[] ans = new int[allSize];
        int k = 0;
        for (int i = 0; i < bottom; i++) {
            for (int j = 0; j <= i; j++) {
                if (nums.get(i - j).size() > j) {
                    ans[k++] = nums.get(i - j).get(j);
                }
            }
        }

        for (int i = 1; i < right; i++) {
            for (int j = 0; j < bottom; j++) {
                if (nums.get(bottom - 1 - j).size() > i+j){
                    ans[k++] = nums.get(bottom - 1 - j).get(i + j);
                }
            }
        }
        return ans;
    }*/

}
