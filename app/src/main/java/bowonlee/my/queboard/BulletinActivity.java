package bowonlee.my.queboard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BulletinActivity extends AppCompatActivity {

    private Button getTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulletin);
        getWindow().setStatusBarColor(Color.RED);

        getTeamButton = findViewById(R.id.bulletinActivity_button_getTeam);
        getTeamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getTeamButton.getText().equals("퀘스트 지원하기")) {
                    getTeamButton.setText("퀘스트 지원 취소하기");
                } else {
                    getTeamButton.setText("퀘스트 지원하기");
                }
            }
        });

    }
}
