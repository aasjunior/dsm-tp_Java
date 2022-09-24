import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Cadastrar cliente\n2 - Listar cliente\n3 - Calcular limite de credito\n0 - Sair"));
            
            switch(op){
                case 1:
                    cliente.cadastrarCliente();
                    break;
                case 2:
                    if(cliente.getId() == 0){
                        JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado, selecione a opção 1 para cadastrar um cliente.");
                    }else{
                        cliente.listarCliente();
                    }
                    break;
                case 3:
                    if(cliente.getId() == 0){
                        JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado, selecione a opção 1 para cadastrar um cliente.");
                    }else{
                        cliente.calcularLimiteCredito();
                        JOptionPane.showMessageDialog(null, "Limite de Crédito: " + cliente.getLimiteCredito());
                    }
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
