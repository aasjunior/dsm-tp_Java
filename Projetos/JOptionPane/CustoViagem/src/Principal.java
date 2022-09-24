import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Percurso p = new Percurso();
        Custos c = new Custos();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n1 - Cadastrar Percurso\n2 - Listar Percurso\n3 - Calcular Viagem\n0 - Sair"));
            
            switch(op){
                case 1:
                    p.cadastrarPercurso();
                    break;
                case 2:
                    p.listarPercurso();
                    break;
                case 3:
                    c.calcularViagem(p);
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
