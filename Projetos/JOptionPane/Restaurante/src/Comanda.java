import javax.swing.JOptionPane;

public class Comanda {
    private int mesa;
    private double valorConsumo;
    private double valorEstacionamento;
    private double valorCouvert;
    private double valorDescontoPromocional;
    private double valorTotal;

    public Comanda() {
        this(0,0.0,0.0,0.0,0.0,0.0);
    }

    public Comanda(int mesa, double valorConsumo, double valorEstacionamento, double valorCouvert, double valorDescontoPromocional, double valorTotal) {
        this.mesa = mesa;
        this.valorConsumo = valorConsumo;
        this.valorEstacionamento = valorEstacionamento;
        this.valorCouvert = valorCouvert;
        this.valorDescontoPromocional = valorDescontoPromocional;
        this.valorTotal = valorTotal;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(double valorConsumo) {
        this.valorConsumo = valorConsumo;
    }

    public double getValorEstacionamento() {
        return valorEstacionamento;
    }

    public void setValorEstacionamento(double valorEstacionamento) {
        this.valorEstacionamento = valorEstacionamento;
    }

    public double getValorCouvert() {
        return valorCouvert;
    }

    public void setValorCouvert(double valorCouvert) {
        this.valorCouvert = valorCouvert;
    }

    public double getValorDescontoPromocional() {
        return valorDescontoPromocional;
    }

    public void setValorDescontoPromocional(double valorDescontoPromocional) {
        this.valorDescontoPromocional = valorDescontoPromocional;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void lancarGastos(){
        this.setMesa(Integer.parseInt(JOptionPane.showInputDialog("Informe a mesa: ")));
        this.setValorConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor consumido: ")));
        this.setValorEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do estacionamento: ")));
        this.setValorCouvert(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Couvert: ")));
        this.setValorDescontoPromocional(0.0);
        this.setValorTotal(0.0);
    }
    
    public void verificarPromocao(){
        if(this.getValorConsumo()>100){ 
            this.setValorDescontoPromocional(this.getValorConsumo()*0.10);
        }
        JOptionPane.showMessageDialog(null, "Valor Desconto Promocional: R$" + this.getValorDescontoPromocional());
    }
    
    public void listarComanda(){
        JOptionPane.showMessageDialog(null, "Comanda" + 
                                            "\nMesa: " + this.getMesa() +
                                            "\nValor Consumo: R$" + this.getValorConsumo() +
                                            "\nValor Estacionamento: R$" + this.getValorEstacionamento() +
                                            "\nValor Couvert: R$" + this.getValorCouvert() +
                                            "\nValor Desconto Promocional: R$" + this.getValorDescontoPromocional() +
                                            "\nValor Total: R$" + this.getValorTotal());
    }
    
    public double totalizarComanda(){
        this.setValorTotal((this.getValorConsumo() + this.getValorEstacionamento() + this.getValorCouvert()) - this.getValorDescontoPromocional());
        return this.getValorTotal(); 
    }
}
