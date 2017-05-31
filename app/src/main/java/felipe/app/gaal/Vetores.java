package felipe.app.gaal;

/**
 * Created by fylyp on 29/05/2017.
 */

public class Vetores {

    String somaVetores(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];

        int[] A = new int[3];
        int[] B = new int[3];
        int[] resultadoVetor = new int[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=A[0]+B[0];
        resultadoVetor[1]=A[1]+B[1];
        resultadoVetor[2]=A[2]+B[2];

        resultado = resultado.concat(Integer.toString(resultadoVetor[0]) + ", " + Integer.toString(resultadoVetor[1]) + ", " + Integer.toString(resultadoVetor[2]));

        return resultado;
    }

    String diferencaVetores(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];

        int[] A = new int[3];
        int[] B = new int[3];
        int[] resultadoVetor = new int[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=A[0]-B[0];
        resultadoVetor[1]=A[1]-B[1];
        resultadoVetor[2]=A[2]-B[2];

        resultado = resultado.concat(Integer.toString(resultadoVetor[0]) + ", " + Integer.toString(resultadoVetor[1]) + ", " + Integer.toString(resultadoVetor[2]));

        return resultado;
    }


    String definidoDoisPontos(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];

        int[] A = new int[3];
        int[] B = new int[3];
        int[] resultadoVetor = new int[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=B[0]-A[0];
        resultadoVetor[1]=B[1]-A[1];
        resultadoVetor[2]=B[2]-A[2];

        resultado = resultado.concat(Integer.toString(resultadoVetor[0]) + ", " + Integer.toString(resultadoVetor[1]) + ", " + Integer.toString(resultadoVetor[2]));

        return resultado;
    }

    String produtoEscalar(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];

        int[] A = new int[3];
        int[] B = new int[3];
        int[] resultadoVetor = new int[3];
        int resultadoFinal;

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=B[0]*A[0];
        resultadoVetor[1]=B[1]*A[1];
        resultadoVetor[2]=B[2]*A[2];

        resultadoFinal = resultadoVetor[0] + resultadoVetor[1] + resultadoVetor[2];

        resultado = resultado.concat(Integer.toString(resultadoFinal));

        return resultado;
    }

    String produtoVetorial(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];

        int[] A = new int[3];
        int[] B = new int[3];
        int[] resultadoVetor = new int[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=(A[1]*B[2])-(A[2]*B[1]);
        resultadoVetor[1]=(A[2]*B[0])-(A[0]*B[2]);
        resultadoVetor[2]=(A[0]*B[1])-(A[1]*B[0]);

        resultado = resultado.concat(Integer.toString(resultadoVetor[0]) + ", " + Integer.toString(resultadoVetor[1]) + ", " + Integer.toString(resultadoVetor[2]));

        return resultado;
    }

    String moduloVetor(String vetor1){
        String resultado="";
        String[] primeiro = new String[3];

        double resultadoFinal;


        double[] A = new double[3];


        primeiro = vetor1.split(",");

        A[0]=Double.parseDouble(primeiro[0]);
        A[1]=Double.parseDouble(primeiro[1]);
        A[2]=Double.parseDouble(primeiro[2]);


        resultadoFinal = Math.sqrt( (Math.pow(A[0], 2) + Math.pow(A[1], 2) + Math.pow(A[2], 2)) );



        resultado = resultado.concat(Double.toString(resultadoFinal));

        return resultado;
    }


    String produtoMisto(String vetor1, String vetor2, String vetor3){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];
        String[] terceiro = new String[3];

        double resultadoFinal;

        double[] A = new double[3];
        double[] B = new double[3];
        double[] C = new double[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");
        terceiro = vetor3.split(",");

        A[0]=Double.parseDouble(primeiro[0]);
        A[1]=Double.parseDouble(primeiro[1]);
        A[2]=Double.parseDouble(primeiro[2]);

        B[0]=Double.parseDouble(segundo[0]);
        B[1]=Double.parseDouble(segundo[1]);
        B[2]=Double.parseDouble(segundo[2]);

        C[0]=Double.parseDouble(terceiro[0]);
        C[1]=Double.parseDouble(terceiro[1]);
        C[2]=Double.parseDouble(terceiro[2]);

        resultadoFinal= ((A[0]*B[1]*C[2])+(A[1]*B[2]*C[0])+(A[2]*B[0]*C[1]) - (A[1]*B[0]*C[2]) - (A[0]*B[2]*C[1]) - (A[2]*B[1]*C[0]));

        resultado = resultado.concat(Double.toString(resultadoFinal));

        return resultado;

    }


    String anguloVetores(String vetor1, String vetor2){
        String resultado="";
        double resultadoFinal;

        resultadoFinal = (Double.parseDouble(produtoEscalar(vetor1, vetor2))) / (Double.parseDouble(moduloVetor(vetor1)) * Double.parseDouble(moduloVetor(vetor2)));

        resultadoFinal = Math.toDegrees(Math.acos(resultadoFinal));

        resultado = Double.toString(resultadoFinal);

        return resultado;
    }

    String multiplicacaoNumero(String vetor1, String numero){
        String resultado="";
        String[] primeiro = new String[3];


        int[] A = new int[3];
        int[] resultadoVetor = new int[3];

        primeiro = vetor1.split(",");


        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);


        resultadoVetor[0]=A[0]*Integer.parseInt(numero);
        resultadoVetor[1]=A[1]*Integer.parseInt(numero);
        resultadoVetor[2]=A[2]*Integer.parseInt(numero);

        resultado = resultado.concat(Integer.toString(resultadoVetor[0]) + ", " + Integer.toString(resultadoVetor[1]) + ", " + Integer.toString(resultadoVetor[2]));

        return resultado;
    }




    String ortogonalidadeEntreVetores(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];

        int resultadoVetor;

        resultadoVetor = Integer.parseInt(produtoEscalar(vetor1, vetor2));

        if(resultadoVetor==0){
            resultado = "Verdadeiro";

        }else{
            resultado= "Falso";
        }

        return resultado;
    }


    String paralelismoVetores(String vetor1, String vetor2){
        String resultado="";
        String[] primeiro = new String[3];
        String[] segundo = new String[3];
        boolean teste = false;

        int[] A = new int[3];
        int[] B = new int[3];
        double[] resultadoVetor = new double[3];

        primeiro = vetor1.split(",");
        segundo = vetor2.split(",");

        A[0]=Integer.parseInt(primeiro[0]);
        A[1]=Integer.parseInt(primeiro[1]);
        A[2]=Integer.parseInt(primeiro[2]);

        B[0]=Integer.parseInt(segundo[0]);
        B[1]=Integer.parseInt(segundo[1]);
        B[2]=Integer.parseInt(segundo[2]);

        resultadoVetor[0]=A[0]/B[0];
        resultadoVetor[1]=A[1]/B[1];
        resultadoVetor[2]=A[2]/B[2];


        if(resultadoVetor[0]==resultadoVetor[1]){
            teste=true;
        }else{
            teste=false;
        }

        if(teste == true && resultadoVetor[1]==resultadoVetor[2]){
            teste=true;
        }else{
            teste=false;
        }

        if(teste==true){
            resultado="Verdadeiro";
        }else{
            resultado="Falso";
        }

        return resultado;
    }



}
