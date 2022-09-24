import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Nome\n2 - Salário Base\n3 - Valor Vendido\n4 - Calcular Comissão\n0 - Sair"));
            
            switch(op){
                case 1:
                    vendedor.entrarNome();
                    JOptionPane.showMessageDialog(null, "Nome salvo: " + vendedor.getNome());
                    break;
                case 2:
                    vendedor.entrarSalarioBase();
                    JOptionPane.showMessageDialog(null, "Salário base salvo: R$ " + vendedor.getSalarioBase());
                    break;
                case 3:
                    vendedor.setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas: R$ ")));
                    JOptionPane.showMessageDialog(null, "Valor vendido salvo: R$ " + vendedor.getValorVendido());
                    break;
                case 4:
                    if(vendedor.getNome()=="" || vendedor.getSalarioBase()==0.0 || vendedor.getValorVendido()==0.0){
                        if(vendedor.getNome()==""){
                            vendedor.entrarNome();   
                        }
                        if(vendedor.getSalarioBase()==0.0){
                            vendedor.entrarSalarioBase();
                        }
                        if(vendedor.getValorVendido()==0.0){
                            vendedor.setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas: R$ ")));
                        }
                    }        
                    JOptionPane.showMessageDialog(null, "Nome: " + vendedor.getNome() + 
                                                        "\nSalário base: R$ " + vendedor.getSalarioBase() +
                                                        "\nValor vendido: R$ " + vendedor.getValorVendido() + 
                                                        "\nNovo salário: R$ " + vendedor.calculoComissao(vendedor.getValorVendido()));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }while(op != 0);
    }
    
}
