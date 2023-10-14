package devandroid.vinicius.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

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

        EditText editPrimeiroNome;
        EditText editSobrenome;
        EditText editNomeCurso;
        EditText editTelefoneContato;

        Button btnLimpar;
        Button btnSalvar;
        Button btnFinalizar;

        // Atribuir conteúdo, dados, valores para o Objeto
        pessoa.setPrimeiroNome("Vinicius");
        pessoa.setSobrenome("Canalles");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefone("16997711804");

        outraPessoa.setPrimeiroNome("Renan");
        outraPessoa.setSobrenome("Canalles");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefone("16997646368");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenome.setText(outraPessoa.getSobrenome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefone());

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
    }
}