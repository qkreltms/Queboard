package bowonlee.my.queboard;

import android.app.Fragment;

public class BaseFragment extends android.support.v4.app.Fragment{





    public void refreshFragment(){
        getFragmentManager().beginTransaction().detach(this).attach(this).commit();
    }

}
