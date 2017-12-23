package encomplus.com.ala_in_one_ravi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RegistationData extends AppCompatActivity {
    TextView Text,text2,Text3,Text4;
    String rame,rmail,Addre,Mono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation_data);
        Text=(TextView)findViewById(R.id.textView);
       text2=(TextView)findViewById(R.id.textView2);
       Text3=(TextView)findViewById(R.id.textView3);
        Text4=(TextView)findViewById(R.id.textView4);
        Bundle bundle =getIntent().getExtras();
       rame=bundle.getString("name");
        rmail=bundle.getString("email");
        Addre=bundle.getString("add");
        Mono= bundle.getString("mono");
        Text.setText(rame);
        text2.setText(rmail);
       Text3.setText(Mono);
        Text4.setText(Addre);

    }
}
