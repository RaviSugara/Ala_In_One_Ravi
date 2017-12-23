package encomplus.com.ala_in_one_ravi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registation extends AppCompatActivity {
    EditText editText,editText2,editText3,editText4;
    String Name,Email,Addre,Mono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);
        editText=(EditText)findViewById(R.id.name);
        editText2=(EditText)findViewById(R.id.email);
        editText3=(EditText)findViewById(R.id.address);
        editText4=(EditText)findViewById(R.id.mobieno);
    }

    public void submit(View view) {
        Name=editText.getText().toString();
        Email=editText2.getText().toString();
        Addre=editText3.getText().toString();
        Mono=editText4.getText().toString();
        Bundle bundle =new Bundle();
        bundle.putString("name",Name);
        bundle.putString("email",Email);
        bundle.putString("add",Addre);
        bundle.putString("mono",Mono);
        Intent intent2 =new Intent(Registation.this,RegistationData.class);
       intent2.putExtras(bundle);

        startActivity(intent2);
    }
}
