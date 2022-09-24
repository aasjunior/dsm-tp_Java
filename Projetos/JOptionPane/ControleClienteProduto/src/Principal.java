import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Cadastrar Cliente\n2 - Listar Cliente\n3 - Cadastrar Produto\n4 - Listar Produto\n5 - Vender Produto\n0 - Sair"));
            
            switch(op){
                case 1:
                    cliente.cadastrarCliente();
                    break;
                case 2:
                    cliente.listarCliente();
                    break;
                case 3:
                    produto.cadastrarProduto();
                    break;
                case 4:
                    produto.listarProduto();
                    break;
                case 5:
                    int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
                    if(produto.getEstoqueDisponivel()>=qtde){
                        produto.pedido(qtde);
                        JOptionPane.showMessageDialog(null,"Preço total da compra: R$" + produto.pedido(qtde));
                        produto.vender(qtde);
                    }else{
                        JOptionPane.showMessageDialog(null,"Estoque Indisponivel");
                    }
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
