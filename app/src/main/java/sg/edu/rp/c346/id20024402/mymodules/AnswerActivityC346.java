package sg.edu.rp.c346.id20024402.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivityC346 extends AppCompatActivity {
    TextView tvAnswercode;
    TextView tvAnswername;
    TextView tvAnsweryear;
    TextView tvAnswerSem;
    TextView tvAnswerCredit;
    TextView tvAnswerVenue;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_c346);

        tvAnswercode = findViewById(R.id.textViewDisplayCode);
        tvAnswername = findViewById(R.id.textViewDisplayName);
        tvAnsweryear = findViewById(R.id.textViewDisplayYear);
        tvAnswerSem = findViewById(R.id.textViewDisplaySem);
        tvAnswerCredit = findViewById(R.id.textViewDisplayCredit);
        tvAnswerVenue = findViewById(R.id.textViewDisplayVenue);
        back = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String Mcode = intentReceived.getStringExtra("code");
        String Mname = intentReceived.getStringExtra("name");
        int Myear = intentReceived.getIntExtra("year" , -1);
        int Msem = intentReceived.getIntExtra("sem" , -1);
        int Mcredit = intentReceived.getIntExtra("credit" , -1);
        String Mvenue = intentReceived.getStringExtra("venue");

        tvAnswercode.setText("Module Code: " + Mcode);
        tvAnswername.setText("Module Name: " + Mname);
        tvAnsweryear.setText("Academic Year: " + Myear);
        tvAnswerSem.setText("Semester: " + Msem);
        tvAnswerCredit.setText("Module Credit: " + Mcredit);
        tvAnswerVenue.setText("Venue: " + Mvenue);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}