import entidades.Cliente;
import entidades.Funcionario;
import entidades.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        // Cliente cliente = new Cliente("");
        // Funcionario funcionario = new Funcionario("");

        // cliente.setNome("Astolfo");
        // funcionario.setNome("Joilsom");

        // info(cliente);
        // System.out.println("\n");
        // info(funcionario);
    }

    public static void info(PessoaFisica pf){
        System.out.println(pf.toString());
    }
}
