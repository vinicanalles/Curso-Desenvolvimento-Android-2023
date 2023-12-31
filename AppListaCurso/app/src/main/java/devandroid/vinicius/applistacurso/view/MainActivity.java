package devandroid.vinicius.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import devandroid.vinicius.applistacurso.R;
import devandroid.vinicius.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Pessoa outraPessoa;

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

        btnLimpar.setOnClickListener(view -> {
            editPrimeiroNome.setText("");
            editSobrenome.setText("");
            editNomeCurso.setText("");
            editTelefoneContato.setText("");
        });

        btnFinalizar.setOnClickListener(view -> {
            Toast.makeText(this, "Volte sempre!", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnSalvar.setOnClickListener(view -> {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobrenome(editSobrenome.getText().toString());
            pessoa.setTelefone(editTelefoneContato.getText().toString());
            pessoa.setCursoDesejado(editNomeCurso.getText().toString());

            Toast.makeText(this, "Salvo " + pessoa.toString(), Toast.LENGTH_SHORT).show();
        });

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
    }
}