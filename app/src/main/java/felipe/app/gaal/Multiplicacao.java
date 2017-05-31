package felipe.app.gaal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacao extends AppCompatActivity {


    EditText primeiroVetor;
    EditText segundoVetor;
    TextView resultado;

    Vetores vetor = new Vetores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);
    }


    public void multiplicacaoNumero(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.multiplicacaoNumero(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void ortogonalidade(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.ortogonalidadeEntreVetores(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void paralelismo(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.paralelismoVetores(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }
}
