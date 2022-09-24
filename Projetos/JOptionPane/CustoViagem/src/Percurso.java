import javax.swing.JOptionPane;

public class Percurso {
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;

    public Percurso() {
        this(0.0,0.0,0.0);
    }

    public Percurso(double kmPercorrida, double valorCombustivel, double valorPedagio) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    public void cadastrarPercurso(){
        this.setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quilometragem percorrida (km): \n")));
        this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustível (R$): \n")));
        this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do pedágio (R$): \n")));
    }
    
    public void listarPercurso(){
        JOptionPane.showMessageDialog(null, "Km Percorrida: " + this.getKmPercorrida() +
                                            "\nValor Combustível: R$ " + this.getValorCombustivel() +
                                            "\nValor Pedágio: R$ " + this.getValorPedagio());
    }
}
