package encomplus.com.ala_in_one_ravi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Admain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admain);
    }

    public void imageShow(View view) {
        Intent intent =new Intent(Admain.this,MainActivity.class);
        startActivity(intent);
    }

    public void showPassword(View view) {
        Intent intent2 =new Intent(Admain.this,LoginScreen.class);
        startActivity(intent2);
    }
}
