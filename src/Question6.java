package aayushi;
import java.util.*;

class Student
{
    private String name;
    private int score;
    private double age;

    public Student(String name,int score,double age)
    {
        this.name=name;
        this.score=score;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}

class StudentSorted implements Comparator<Student>{
    public int compare(Student t1, Student t2) {

        // for comparison
        int ScoreCompare = Double.compare(t1.getScore(), t2.getScore());
        int NameCompare = t1.getName().compareTo(t2.getName());

        // 2-level comparison using if-else block
        if (ScoreCompare == 0) {
            return ((NameCompare == 0) ? ScoreCompare : NameCompare);
        } else {
            return ScoreCompare;
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Student s1 = new Student("Ayushi",99,22);
        Student s2 = new Student("Komal",78,20);
        Student s3 = new Student("Akash",80,14);
        Student s4 = new Student("Astha",99,19);
        Student s5 = new Student("Shobhit",80,18);


        List<Student> student = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);

        ListIterator<Student> itr = student.listIterator();
        System.out.println("-------BEFORE SORTING-------");

        while (itr.hasNext())
        {
            System.out.println("Value is : " + itr.next());
        }

        System.out.println();

        Collections.sort(student,new StudentSorted());

        ListIterator<Student> iterator = student.listIterator();

        System.out.println("-------AFTER SORTING--------");
        while (iterator.hasNext())
        {
            System.out.println("Value is : " + iterator.next());
        }
    }
}
