public class Secretario extends Funcionario {
    private String turno;
    private String cpf; 

    public Secretario(String nome, double salario, String turno, String cpf){
        super(nome, salario);
        this.turno = turno;
        this.cpf = cpf; 
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

     public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getBonificacao(){
        return getSalario() * 0.15;
    }

    public String getDocumento(){
        return getCpf();
    }
    
}
