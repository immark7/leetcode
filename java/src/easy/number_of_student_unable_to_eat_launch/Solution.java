package easy.number_of_student_unable_to_eat_launch;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        int result = sol.countStudents(students, sandwiches);
        System.out.println("Number of students who cannot eat: " + result);
    }

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.add(student);
        }

        int sandwichIndex = 0;
        int countFailures = 0;

        while (!studentQueue.isEmpty() && countFailures < studentQueue.size()) {
            int currentStudent = studentQueue.poll();
            if (currentStudent == sandwiches[sandwichIndex]) {
                sandwichIndex++;
                countFailures = 0;
            } else {
                studentQueue.add(currentStudent);
                countFailures++;
            }
        }

        return studentQueue.size();
    }
}
