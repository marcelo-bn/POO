package engtelecom.poo.marcelo.meusegundoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    protected void nextActicity(View view){
        Intent messageIntent = new Intent(this, TerceiraActivity.class);
        startActivity(messageIntent);

    }
}
