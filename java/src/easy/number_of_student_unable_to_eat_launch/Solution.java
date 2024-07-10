package easy.number_of_student_unable_to_eat_launch;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        int result = sol.countStudents(students, sandwiches);
        System.out.println("Number of students who cannot eat: " + result);
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Queue<Integer> sandwichQueue = new LinkedList<>();

        for (int student : students) {
            studentQueue.add(student);
        }

        for (int sandwich : sandwiches) {
            sandwichQueue.add(sandwich);
        }

        int attempts = 0;

        while (!studentQueue.isEmpty() && attempts < studentQueue.size()) {
            if (studentQueue.peek()
                    .equals(sandwichQueue.peek())) {
                studentQueue.poll();
                sandwichQueue.poll();
                attempts = 0;
            } else {
                studentQueue.add(studentQueue.poll());
                attempts++;
            }
        }

        return studentQueue.size();
    }
}
