package bowonlee.my.queboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity {

    private ImageView fakeGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        fakeGridView = findViewById(R.id.GalleryActivity_imageView);
    }
}
