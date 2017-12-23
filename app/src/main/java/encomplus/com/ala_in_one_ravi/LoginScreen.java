package encomplus.com.ala_in_one_ravi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    EditText name,password;
    Button login,singup;
    CheckBox sp;
    String UName,UPasword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        name= (EditText) findViewById(R.id.user_email);
        password= (EditText) findViewById(R.id.password);
        login= (Button) findViewById(R.id.login);
        singup= (Button) findViewById(R.id.singup);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UName=name.getText().toString();


                Intent intent2 =new Intent(LoginScreen.this,Registation.class);

                startActivity(intent2);
            }
        });
        sp= (CheckBox) findViewById(R.id.show_password);
        sp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean r) {
                if(r){

                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);


                }else {
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                }


            }
        });

    }


}
