package sg.edu.rp.c346.id20024402.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPassC346;
    TextView tvPassC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPassC346 = findViewById(R.id.textViewC346);
        tvPassC349 = findViewById(R.id.textViewC349);

        tvPassC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, AnswerActivityC346.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });

        tvPassC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, AnswerActivityC349.class);
                intent.putExtra("Content" , "Module Code: C349 \nModule Name: iPad Programming \nAcademic Year: 2021 \nSemester: 2 \nModule Credit: 4 \nVenue: W66M");
                startActivity(intent);
            }
        });
    }
}