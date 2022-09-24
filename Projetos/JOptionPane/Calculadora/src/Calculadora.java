import javax.swing.JOptionPane;

public class Calculadora {
    private double n1;
    private double n2;
    private double r;

    public Calculadora() {
        this(0.0,0.0,0.0);
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        
        this.setR(this.getN1() + this.getN2());
        
        JOptionPane.showMessageDialog(null, "A  soma entre " + this.getN1() + " e " + this.getN2() + " é " + this.getR());
    }
    
    public void subtrair(double a, double b){
        this.setR(a - b);
        JOptionPane.showMessageDialog(null, "A subtração entre " + a + " e " + b + " é " + this.getR());
    }
    
    public double multiplicar(){
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        
        this.setR(this.getN1() * this.getN2());
        
        return(this.getR());
    }
    
    public double dividir(double a, double b){
        this.setR(a / b);
        
        return(this.getR());
    }
}
