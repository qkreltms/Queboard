package bowonlee.my.queboard;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bowonlee.my.queboard.BoardList.FragmentBoard;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private FragmentHome fragment1;
    private FragmentBoard fragment2;
    private FragmentProfile fragment3;
    private FragmentAlarm fragment4;
    private FragmentCommunity fragment5;

    private android.support.v4.app.FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    /*
    * 1. 시작은 일단 fragment1 에서 시작하도록 함
    * 2. 그 후 하나씩 바꾸기로 한다.
    *
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        startFragment();
    }

    private void startFragment(){
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();

        mFragmentTransaction.replace(R.id.main_fragment_container,fragment1.newInstance()).commit();

    }

    @Override
    public void onClick(View view) {

            mFragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){

            case R.id.button : {
                mFragmentTransaction.replace(R.id.main_fragment_container,
                        fragment1.newInstance());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();

            }break;
            case R.id.button2 : {
                mFragmentTransaction.replace(R.id.main_fragment_container,
                        fragment2.newInstance());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }break;
            case R.id.button3 : {
                mFragmentTransaction.replace(R.id.main_fragment_container,
                        fragment3.newInstance());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }break;
            case R.id.button4 : {
                mFragmentTransaction.replace(R.id.main_fragment_container,
                        fragment4.newInstance());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }break;
            case R.id.button5 : {
                mFragmentTransaction.replace(R.id.main_fragment_container,
                        fragment5.newInstance());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }break;

        }

    }
}
