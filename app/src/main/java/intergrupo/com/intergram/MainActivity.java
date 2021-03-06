package intergrupo.com.intergram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import intergrupo.com.intergram.view.ConteinerActivity;
import intergrupo.com.intergram.view.CreateAccountActivity;
import intergrupo.com.intergram.view.PictureDatailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //se crea un metodo para poder ir a la actividad de crear cuenta
    public void goCreateAccount(View view){
        Intent intent=new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goLogin(View view){
        Intent intent=new Intent(this, ConteinerActivity.class);
        startActivity(intent);
    }

    public void goWebPage(View  view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.intergrupo.com"));
        startActivity(intent);
    }


}
