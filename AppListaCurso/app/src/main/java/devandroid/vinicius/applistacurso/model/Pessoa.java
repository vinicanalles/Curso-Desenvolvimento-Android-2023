package devandroid.vinicius.applistacurso.model;

public class Pessoa {

    //Construtor
    public Pessoa() {

    }

    //Atributos
    private String primeiroNome;
    private String sobrenome;
    private String cursoDesejado;
    private String telefone;

    //Métodos de Acesso - Gets and Sets
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
