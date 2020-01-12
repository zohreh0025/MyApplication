package ir.akhbar;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Main_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmant,new Newsfragmant())
                .commit();


    //navigat();

}

    private void navigat() {
        Bundle ex=new Bundle();
        ex.putInt("conter",0);
        Newsfragmant newsfragmant=new Newsfragmant();
        newsfragmant.setArguments(ex);

    }
}
