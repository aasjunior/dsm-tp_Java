import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        double a, b;
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair"));
            
            switch(op){
                case 1: 
                    calc.somar();
                    break;
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    calc.subtrair(a, b);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + calc.multiplicar());
                    break;
                case 4:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é " + calc.dividir(a, b));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }while(op !=0);
    }
    
}
