package ajaymehta.arrayofobjects3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // see i took a data source (model) as Array...u can take Getter Setter (POJO) , any Input method or anything...its own u..

    int[] rollno = new int[] {101, 102, 103, 104, 105};
    String[] names = new String[] {"Michel","Ria","Simi","Diler","Rocky"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student[] student = new Student[5];

        for(int i = 0 ; i< student.length; i++) {
            student[i] = new Student(rollno[i], names[i]);
        }


       student[0].initStudentData(student, this);

    }
}
