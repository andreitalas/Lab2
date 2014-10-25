package packet.tema2.student;

/**
 * Created by Andrei on 25.10.2014.
 *
 * Aceasta este o clasa students
 */
public class student {
    /**
     * @param studenCount este variabila pentru a contoriza studentii
     * @param name este numele studentului
     * @param group este grupa studentului
     * @param age este varsta studentului
     */
    public static int studentCount=0;
    private String name;
    private String group;
    private int age;

    public student(){
        studentCount++;
    }

    public student(String name, String group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
        studentCount++;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

}