package entidades;

//  extends fala que a classe Cliente é uma PessoaFisica, ou seja, ela herda todos os atibutos da classe PessoaFisica

public class Cliente extends PessoaFisica {
    private int scoreCredito;

    public Cliente(String cpf) {
        super(cpf);
    }

    public int getScoreCredito() {
        return scoreCredito;
    }

    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

    public String toString() {
        return "{ \"cliente\": { " + super.toString() + ",\"score\": " + "\"" + getScoreCredito() + "\", "
                + "\"success\": true, \"message\": \"Dados exibidos com sucesso\"} }";
    }
}

// +"\nScore "+getScoreCredito()
// {
// "cliente": {
// "nome": "João Miguel",
// "dataNascimento": "2001-02-04",
// "documento": {
// "cnh": "123456789",
// "cpf": "111.444.777-35",
// "rg": "10.258.452-9"
// },
