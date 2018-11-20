package engtelecom.poo.marcelo.meusegundoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCounter=0;
    private TextView mTextViewCounter;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count",mCounter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mTextViewCounter = findViewById(R.id.tvCounter);
        if(savedInstanceState!=null){
            mCounter = savedInstanceState.getInt("count");
            if(mTextViewCounter!=null) mTextViewCounter.setText(mCounter);
        }
    }

    public void incrementarContador(View view) {
        mCounter++;

        if(mCounter==5){
            Toast toast = Toast.makeText(this,R.string.botaomsn, Toast.LENGTH_LONG);
            toast.show();
        }

        mTextViewCounter.setText(Integer.toString(mCounter));
    }

    public void exibirMensagem(View view) {
        //Toast toast = Toast.makeText(this,R.string.botaomsn, Toast.LENGTH_LONG);
        //toast.show();

        /*Uri uri = Uri.parse("http://docenteifsc.edu.br/mello");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);*/

        /*Uri uri = Uri.parse("tel:33812800");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);*/

        Intent messageIntent = new Intent(this, SegundaActivity.class);
        startActivity(messageIntent);



    }
}
