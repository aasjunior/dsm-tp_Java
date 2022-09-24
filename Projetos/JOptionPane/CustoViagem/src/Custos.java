import javax.swing.JOptionPane;

public class Custos {
    private double totalPercurso;

    public Custos() {
        this(0.0);
    }

    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    public void calcularViagem(Percurso p){
        this.setTotalPercurso((p.getKmPercorrida() * p.getValorCombustivel()) + p.getValorPedagio());
        JOptionPane.showMessageDialog(null, "Total da viagem: R$" + this.totalPercurso);
    }
}
