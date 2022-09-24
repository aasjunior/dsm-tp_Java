import javax.swing.JOptionPane;

public class Produto {
    private int id;
    private String descricao;
    private int estoqueDisponivel;
    private double precoUnitario;

    public Produto() {
        this(0,"",0,0.0);
    }

    public Produto(int id, String descricao, int estoqueDisponivel, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.estoqueDisponivel = estoqueDisponivel;
        this.precoUnitario = precoUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public void cadastrarProduto(){
        this.setId(this.getId() + 1);
        this.setDescricao(JOptionPane.showInputDialog("Cadastro de Produto\n\nDigite a descrição do Produto: "));
        this.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Produto\n\nDigite o estoque disponível do Produto: ")));
        this.setPrecoUnitario(Double.parseDouble(JOptionPane.showInputDialog("Cadastro de Produto\n\nDigite o preço unitário do Produto: ")));
    }
    
    public void listarProduto(){
        JOptionPane.showMessageDialog(null, "Dados Produto\n" +
                                            "\nDescrição: " + this.getDescricao() +
                                            "\nEstoque Disponível: " + this.getEstoqueDisponivel() +
                                            "\nPreço unitário: R$" +this.getPrecoUnitario());
    }
    
    public double pedido(int qtde){
        double valor;
        valor = (this.getPrecoUnitario() * qtde);
        return valor;
    }
    
    public void vender(int qtde){
        this.setEstoqueDisponivel(this.getEstoqueDisponivel()-qtde);
        JOptionPane.showMessageDialog(null,"Venda realizada com sucesso");
    }
}
