import entidades.Cliente;
import entidades.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("111.111.111-11");

        obj1.getDocumento().setRg("");
        obj1.getDocumento().setCnh("");
        
        // definir os valores correspondente ao endereço, contato e nome de uma cliente

        //ENDEREÇO
        obj1.getEndereco().setCep("");
        obj1.getEndereco().setNome("");
        obj1.getEndereco().setNumero("");

        //CONTATO 
        obj1.getContato().setCelular("");
        

        System.out.println(obj1);

    }
}
