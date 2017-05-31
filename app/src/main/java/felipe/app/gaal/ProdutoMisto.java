package felipe.app.gaal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProdutoMisto extends AppCompatActivity {


    EditText primeiroVetor;
    EditText segundoVetor;
    EditText terceiroVetor;
    TextView resultado;


    Vetores vetor = new Vetores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_misto);
    }

    public void produtoMisto(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        terceiroVetor = (EditText) findViewById(R.id.vetor3);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.produtoMisto(primeiroVetor.getText().toString(), segundoVetor.getText().toString(), terceiroVetor.getText().toString()));

    }


}
