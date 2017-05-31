package felipe.app.gaal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends AppCompatActivity {

    EditText primeiroVetor;
    EditText segundoVetor;
    TextView resultado;

    Vetores vetor = new Vetores();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
    }


    public void soma(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.somaVetores(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void diferenca(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.diferencaVetores(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void doisVetores(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.definidoDoisPontos(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }


    public void produtoEscalar(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.produtoEscalar(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void produtoVetorial(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.produtoVetorial(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }

    public void moduloPrimeiroVetor(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.moduloVetor(primeiroVetor.getText().toString()));

    }

    public void anguloVetores(View v){

        primeiroVetor = (EditText) findViewById(R.id.vetor1);
        segundoVetor = (EditText) findViewById(R.id.vetor2);
        resultado = (TextView) findViewById(R.id.resultado);

        resultado.setText(vetor.anguloVetores(primeiroVetor.getText().toString(), segundoVetor.getText().toString()));

    }


}
