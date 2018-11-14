package engtelecom.poo.marcelo.meusegundoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCounter=0;
    private TextView mTextViewCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mTextViewCounter = findViewById(R.id.tvCounter);
    }

    public void incrementarContador(View view) {
        mCounter++;

        //usar toast aqui


        mTextViewCounter.setText(Integer.toString(mCounter));
    }

    public void exibirMensagem(View view) {
        Toast toast = Toast.makeText(this,R.string.botaomsn, Toast.LENGTH_LONG);
        toast.show();
    }
}
