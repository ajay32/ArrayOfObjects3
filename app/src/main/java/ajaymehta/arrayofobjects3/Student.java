package ajaymehta.arrayofobjects3;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ajay Mehta on 6/25/2017.
 */

public class Student {


    private int rollno;
    private String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void initStudentData(Student[] student, Context context) {

        for (int i = 0; i < student.length; i++) {

            student[i].printStudentsData(i, context);

        }
    }


    public void printStudentsData(int i, Context context) {

        Toast.makeText(context, "student " + (i+1) + " = " + rollno + " " + name, Toast.LENGTH_SHORT).show();

    }
}
