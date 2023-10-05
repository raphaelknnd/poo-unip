public class Ti extends Funcionario implements UsuarioAutenticavel, Reparo{
    private String nivel, cpf;

    public Ti(String nome, double salario, String nivel, String cpf){
        super(nome, salario);
        this.nivel = nivel;
        this.cpf = cpf;
    }

    public String getNivel(){
        return this.nivel;
    }

    public void setNivel(String value){
        this.nivel = value;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String value){
        this.cpf = value;
    }

    public double getBonificacao(){
        // métofo funcionou com e sem o uso so "super", mas mantive o super na linha por convenção.
        return super.getSalario() * 0.5;
    }

    public String getDocumento(){
        return getCpf();
    }

    public Boolean autenticacao(String senha){
        /*quando fiz à mão usei 

         if(senha == "cachorro")
            return true;
         return false;

         mas lembrei que o ternário deixa um pouco mais enxuto.
         */
        return senha == "cachorro" ? true : false;
    }

    public void logoff(){
        // métofo funcionou com e sem o uso so "super", mas mantive o super na linha por convenção.
        System.out.println("Usuário " + super.getNome() + " saiu");
    }

    public Boolean repararImpressora(){
        return true;
    }
}
