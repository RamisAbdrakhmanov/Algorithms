package litcode.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stackOfSandwich = new Stack<>();
        Queue<Integer> studentLine = new LinkedList<>();

        for (int student : students) {
            studentLine.add(student);
        }

        for (int i = sandwiches.length-1; i >=0 ; i--) {
            stackOfSandwich.push(sandwiches[i]);
        }

        int queueWithoutMovement = 0;
        while(!studentLine.isEmpty()){
            if(studentLine.peek() == stackOfSandwich.peek()){
                studentLine.poll();
                stackOfSandwich.pop();
                queueWithoutMovement = 0;
            } else {
                if(queueWithoutMovement >= stackOfSandwich.size()){
                    return stackOfSandwich.size();
                }
                studentLine.add(studentLine.poll());
                queueWithoutMovement++;

            }
        }

        return 0;
    }
}
