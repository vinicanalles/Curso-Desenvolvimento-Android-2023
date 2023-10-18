package devandroid.vinicius.applistacurso.controller;

import android.util.Log;

import devandroid.vinicius.applistacurso.model.Pessoa;

public class PessoaController {

    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controller", "Salvo " + pessoa.toString());
    }
}
