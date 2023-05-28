package litcode.interview.questions.easy;

import litcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        if(list.size()%2 != 0 || list.size()<2){
            return false;
        }

        for(int i = 0; i <= list.size()/2; i++){
            if(list.get(i) != list.get(list.size()-1 - i)){
                return false;
            }
        }

        /*while(head != null && head.next != null){
            list.add(head.val);
            list.add(head.next.val);
            head = head.next.next;
        }*/
        return true;
    }



}
