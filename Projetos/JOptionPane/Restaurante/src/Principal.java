import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Lançar Gastos\n2 - Verificar promoção\n3 - Fechar mesa\n4 - Listar comanda\n0 - Sair"));
            
            switch(op){
                case 1:
                    comanda.lancarGastos();
                    break;
                case 2:
                    comanda.verificarPromocao();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Valor Total: R$" + comanda.totalizarComanda());
                    break;
                case 4:
                    comanda.listarComanda();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }while(op!=0);
    }
    
}
