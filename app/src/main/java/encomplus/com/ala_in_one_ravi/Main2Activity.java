package encomplus.com.ala_in_one_ravi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imageView =(ImageView)findViewById(R.id.imageRs);
     String   url1="http://www.maadurgawallpaper.com/wp-content/uploads/2015/05/god-shiva-photos.jpg";
        Picasso.with(this).load(url1).into(imageView);



    }
}
