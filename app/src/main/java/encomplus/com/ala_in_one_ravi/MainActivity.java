package encomplus.com.ala_in_one_ravi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.sdsmdg.tastytoast.TastyToast;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    Button button;
    String url1,url2,url3,url4,url5,url6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.buttonDw);
        imageView1= (ImageView) findViewById(R.id.image);
        imageView2= (ImageView) findViewById(R.id.image2);
        imageView3= (ImageView) findViewById(R.id.image3);
        imageView4= (ImageView) findViewById(R.id.image4);
        imageView5= (ImageView) findViewById(R.id.image5);
        imageView6= (ImageView) findViewById(R.id.image6);
        url1="http://www.maadurgawallpaper.com/wp-content/uploads/2015/05/god-shiva-photos.jpg";
        url2="http://redzambala.com/sites/default/files/styles/front-333/public/field/image/Navagrahas-9.jpg?itok=fCv9KiND";
        url3="https://4.bp.blogspot.com/-I8OZ3avDMrE/UiiCq_T9SnI/AAAAAAAAJzc/DOE7mmvbTUU/s640/durga7.jpg";
        url4="https://data.whicdn.com/images/197157395/large.jpg";
        url5="http://mobi-wall.brothersoft.com/files/480640/l/12829644346743.jpg";
        url6="https://orig00.deviantart.net/22f6/f/2015/222/7/2/dgj_by_vishnu108-d952h0q.gif";


        Picasso picasso = null;
        Glide glide = null;
        picasso.with(MainActivity.this).load(url2).into(imageView2);
        picasso.with(MainActivity.this ).load(url1).into(imageView1);
        glide.with(MainActivity.this).load(url3).into(imageView3);
        glide.with(MainActivity.this).load(url4).into(imageView4);
        glide.with(MainActivity.this).load(url5).into(imageView5);
        picasso.with(MainActivity.this).load(url6).into(imageView6);
        TastyToast.makeText(getApplicationContext(),"Please Wait Downlodig Data",TastyToast.LENGTH_LONG,TastyToast.DEFAULT);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i    = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"Full size of image",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.RIGHT,0,10);
                toast.show();

            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TastyToast.makeText(getApplicationContext(),"Full size of image",TastyToast.LENGTH_LONG,TastyToast.SUCCESS);



            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(getApplicationContext(),"Full size of image",TastyToast.LENGTH_LONG,TastyToast.WARNING);



            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(getApplicationContext(),"Full size of image",TastyToast.LENGTH_LONG,TastyToast.INFO);


            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(getApplicationContext(),"Full size of image",TastyToast.LENGTH_LONG,TastyToast.CONFUSING);


            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TastyToast.makeText(getApplicationContext(),"Full size of image",TastyToast.LENGTH_LONG,TastyToast.ERROR);



            }
        });

    }




    }

