package entidades;


public class Funcionario extends PessoaFisica{
    
    private double salario;
    private String matricula;

    public Funcionario(String cpf) {
        super(cpf);
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return  "{ \"funcionario\": { "+super.toString()+",\"salario\": "+"\""+getSalario()+"\""+",\"matricula\":"+"\""+getMatricula()+"\", "+ "\"success\": true, \"message\": \"Dados exibidos com sucesso\"} }";
    }
    
}
