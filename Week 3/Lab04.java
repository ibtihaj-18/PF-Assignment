public class Lab04 {
    public static void main(String[] args) {

        int[] marks = {75, 80, 65, 90, 85};
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double average = (double) sum / marks.length;

        System.out.println("Average Score: " + average);
    }
}