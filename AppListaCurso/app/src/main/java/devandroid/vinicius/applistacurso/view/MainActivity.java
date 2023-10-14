package devandroid.vinicius.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.vinicius.applistacurso.R;
import devandroid.vinicius.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        // Atribuir conteúdo, dados, valores para o Objeto
        pessoa.setPrimeiroNome("Vinicius");
        pessoa.setSobrenome("Canalles");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefone("16997711804");

        outraPessoa.setPrimeiroNome("Renan");
        outraPessoa.setSobrenome("Canalles");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefone("16997646368");

//        dadosPessoa = "Primeiro nome: ";
//        dadosPessoa += pessoa.getPrimeiroNome();
//        dadosPessoa += " Sobrenome: ";
//        dadosPessoa += pessoa.getSobrenome();
//        dadosPessoa += " Curso Desejado: ";
//        dadosPessoa += pessoa.getCursoDesejado();
//        dadosPessoa += " Telefone: ";
//        dadosPessoa += pessoa.getTelefone();
//
//        dadosOutraPessoa = "Primeiro nome: ";
//        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
//        dadosOutraPessoa += " Sobrenome: ";
//        dadosOutraPessoa += outraPessoa.getSobrenome();
//        dadosOutraPessoa += " Curso Desejado: ";
//        dadosOutraPessoa += outraPessoa.getCursoDesejado();
//        dadosOutraPessoa += " Telefone: ";
//        dadosOutraPessoa += outraPessoa.getTelefone();

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
    }
}