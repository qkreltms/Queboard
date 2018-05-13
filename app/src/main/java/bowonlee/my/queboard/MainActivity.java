package bowonlee.my.queboard;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import bowonlee.my.queboard.BoardList.FragmentBoard;


public class MainActivity extends AppCompatActivity {

    private String[] fragmentNames = {"Home", "Board", "Profile", "Notification"};
    private Button createButton;
    private Button messageButton;
    private FragmentBoard fragmentBoard;
    private FragmentProfile fragmentProfile ;
    private FragmentHome fragmentHome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createButton = findViewById(R.id.mainActivity_button_create);
        messageButton = findViewById(R.id.mainActivity_button_message);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QueBoardCreateActivity.class);
                startActivityForResult(intent,500);
            }
        });
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QueBoardCreateActivity.class);
                startActivity(intent);
            }
        });

        getWindow().setStatusBarColor(Color.RED);
        initViewPager();

    }



    class ViewPagerAdapter extends FragmentStatePagerAdapter {

        ArrayList<Fragment> items = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
            items.clear();
            notifyDataSetChanged();
        }

        public void addItem(Fragment item) {
            items.add(item);
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentNames[position];
        }
    }

    public void initViewPager() {
        ViewPager pager;
        
        pager = findViewById(R.id.MainActivity_viewPager_container);
        pager.setOffscreenPageLimit(4);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        fragmentHome = new FragmentHome();
        fragmentBoard = new FragmentBoard();
        fragmentProfile = new FragmentProfile();
        FragmentAlarm fragmentAlarm = new FragmentAlarm();

        
        adapter.addItem(fragmentHome);
        adapter.addItem(fragmentBoard);
        adapter.addItem(fragmentProfile);
        adapter.addItem(fragmentAlarm);

        pager.setAdapter(adapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == QueBoardCreateActivity.REQUEST){
            if(resultCode == QueBoardCreateActivity.RESULT_OK){
                fragmentHome.addDummy();
                fragmentBoard.addDummy();
            }
        }

    }
}
