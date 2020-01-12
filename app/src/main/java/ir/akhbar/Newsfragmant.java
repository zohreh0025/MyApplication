package ir.akhbar;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ParsService on 1/8/2020.
 */

public class Newsfragmant extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragmant_news,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      final         TextView txt= (TextView) view.findViewById(R.id.contertxt);
     final    EditText txt1= (EditText) view.findViewById(R.id.edit1);
      final   EditText txt2= (EditText) view.findViewById(R.id.edit2);
        Button btn= (Button) view.findViewById(R.id.btnok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isvalid();
            }

            private void isvalid() {
                String myname=txt1.getText().toString().trim();
                String mypass=txt2.getText().toString().trim();
                if (initioalis(myname,mypass)){
                    txt.setText("sabt shod");
                    rigsternews rigfragment=new rigsternews();
                   getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmant,rigfragment)
                            .commit();



                }

            }

            private boolean initioalis(String sname,String spass) {

                if (!sname.contains("admin")) {
                    txt.setText("نام کاربری اشتباه است");
                    return false;
                }
                if (!spass.contains("123")){
                    txt.setText("پسورد اشتباه است");
                    return  false;
                }
                return true;
            }
        });
    }
}
