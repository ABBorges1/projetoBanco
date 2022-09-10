package entidades;

public class Documento {
    private String cpf;
    private String rg;
    private String cnh;

    public Documento(String cpf) {
        this.validaCpf(cpf);               //atributo obrigatório
    }

    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    private Boolean validaCpf(String cpf){
        cpf = cpf.replace(".", "");     //Substitui . por string vazia
        cpf = cpf.replace("-", "");     //Subtitui - por string vazia
        int soma = 0;
        int dv1 = Character.getNumericValue(cpf.charAt(9));         //converte de char para int
        int dv2 = Character.getNumericValue(cpf.charAt(10));        //converte de char para int
        for (int i = 0; i < cpf.length()-2; i++) {
            //converte de char para int
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma = soma+digito*(10-i);
        }
        int resto = soma%11;
        if ((resto < 2)&&(dv1!=0)){
            System.out.println("Erro no primeiro digito verificador");
            System.out.println("\nCorreto deveria ser 0");
            return false;
        }else if((resto >= 2)&&(dv1!=(11-resto))){
            System.out.println("Erro no primeiro digito verificador");
            System.out.println("\nCorreto deveria ser "+(11-resto));
            return false;
        }

        // vamos verificar o dv2
        soma=0;
        for (int i = 0; i < cpf.length()-1; i++){
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma = soma+digito*(11-i);
        }
        resto = soma%11;
        if ((resto < 2)&&(dv2!=0)){
            System.out.println("Erro no primeiro digito verificador");
            System.out.println("\nCorreto deveria ser 0");
            return false;
        }else if((resto >= 2)&&(dv2!=(11-resto))){
            System.out.println("Erro no primeiro digito verificador");
            System.out.println("\nCorreto deveria ser "+(11-resto));
            return false;
        }
        System.out.println("CPF ESTA CORRETO");
        return true;        
    }

    public static void main(String[] args) {
        Documento doc = new Documento("");
    }
}
