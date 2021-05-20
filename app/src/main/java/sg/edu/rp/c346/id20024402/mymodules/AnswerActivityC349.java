package sg.edu.rp.c346.id20024402.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivityC349 extends AppCompatActivity {
    TextView tvAnswerC349;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_c349);

        tvAnswerC349 = findViewById(R.id.textViewDisplayC349);
        back = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String answer = intentReceived.getStringExtra("Content");
        tvAnswerC349.setText(answer);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}