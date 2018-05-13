package bowonlee.my.queboard;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class QueBoardCreateActivity extends AppCompatActivity {

    static final int REQUEST = 500;
    static final int RESULT_OK = 501;

    private Button startDateButton;
    private Button dueDateButton;
    private Button finishQueDateButton;
    private Button completionButton;
    private Button cancleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_board_create);

        getWindow().setStatusBarColor(Color.RED);

        completionButton = findViewById(R.id.QueBoardCreateActivity_button_completion);
        cancleButton = findViewById(R.id.QueBoardCreateActivity_button_cancel);

        startDateButton = findViewById(R.id.QueBoardCreateActivity_button_startDate);
        dueDateButton = findViewById(R.id.QueBoardCreateActivity_button_dueDate);
        finishQueDateButton = findViewById(R.id.QueBoardCreateActivity_button_finishQueDate);


        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDateButtonDialog(2018, 04, 12);
            }
        });

        dueDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dueDateButtonDialog( 2018, 04, 12);
            }
        });

        finishQueDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishQueDateButtonDialog(2018, 04, 12);
            }
        });

        completionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                setResult(RESULT_OK);
                finish();

            }
        });

        cancleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }





    public void startDateButtonDialog(int year, int month, int dayOfMonth) {
        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                startDateButton.setText(Integer.toString(year) + " 년" + Integer.toString(month+1) + " 월" + Integer.toString(dayOfMonth) + " 일");
            }
        }, year, month, dayOfMonth);
        dialog.show();
    }

    public void dueDateButtonDialog(int year, int month, int dayOfMonth) {
        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dueDateButton.setText(Integer.toString(year) + " 년" + Integer.toString(month+1) + " 월" + Integer.toString(dayOfMonth) + " 일");
            }
        }, year, month, dayOfMonth);
        dialog.show();
    }

    public void finishQueDateButtonDialog(int year, int month, int dayOfMonth) {
        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                finishQueDateButton.setText(Integer.toString(year) + " 년" + Integer.toString(month+1) + " 월" + Integer.toString(dayOfMonth) + " 일");
            }
        }, year, month, dayOfMonth);
        dialog.show();
    }
}
