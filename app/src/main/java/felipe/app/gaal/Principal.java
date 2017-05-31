package felipe.app.gaal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    public void startSomaActivity(View v) {

        Intent cadastroActivity = new Intent(this, Soma.class);
        startActivity(cadastroActivity);
    }
    public void startProdutoMistoActivity(View v) {

        Intent cadastroActivity = new Intent(this, ProdutoMisto.class);
        startActivity(cadastroActivity);
    }

    public void startMultiplicacaoActivity(View v) {

        Intent cadastroActivity = new Intent(this, Multiplicacao.class);
        startActivity(cadastroActivity);
    }




}
