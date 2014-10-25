import packet.tema2.student.student;

/**
 * Created by Andrei on 25.10.2014.
 *
 * Aceasta este tema 2
 */
public class Main {
    /**
     * Acesta este punctul de intrare in proiect
     *
     * @param args este un vector de argumente
     */
    public static void main(String[] args) {
        /**
         * @param studentTestStrings este o variabila pentru test
         */
        String[] studentTestStrings = {"Student", "Talas", "E214A"};
        student Andrei=new student("Andrei","E214A",21);

        for (int iterator = 0; iterator < studentTestStrings.length; iterator++) {
            try {
                System.out.println("Information about the students: " + studentTestStrings[iterator]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Numbers of students: "+ student.studentCount);
    }
}