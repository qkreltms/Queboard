package bowonlee.my.queboard;

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

    String[] fragmentNames = {"Home", "Board", "Profile", "Alam", "Community"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        pager.setOffscreenPageLimit(5);

        ViewPagerAdapter adatper = new ViewPagerAdapter(getSupportFragmentManager());

        FragmentHome fragmentHome = new FragmentHome();
        FragmentBoard fragmentBoard = new FragmentBoard();
        FragmentProfile fragmentProfile = new FragmentProfile();
        FragmentAlarm fragmentAlarm = new FragmentAlarm();
        FragmentCommunity fragmentCommunity = new FragmentCommunity();

        adatper.addItem(fragmentHome);
        adatper.addItem(fragmentBoard);
        adatper.addItem(fragmentProfile);
        adatper.addItem(fragmentAlarm);
        adatper.addItem(fragmentCommunity);

        pager.setAdapter(adatper);
    }


}
