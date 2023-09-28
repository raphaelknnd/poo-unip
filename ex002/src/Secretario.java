public class Secretario extends Funcionario {
    private String turno;

    public Secretario(String nome, double salario, String turno){
        super(nome, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getBonificacao(){
        return getSalario() * 0.15;
    }
    
}
