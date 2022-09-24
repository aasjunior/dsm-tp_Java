import javax.swing.JOptionPane;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private double rendaMensal;
    private double limiteCredito;

    public Cliente() {
        this(0,"","","",0.0,0.0);
    }

    public Cliente(int id, String nome, String endereco, String email, double rendaMensal, double limiteCredito) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.rendaMensal = rendaMensal;
        this.limiteCredito = limiteCredito;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public void cadastrarCliente(){
        this.setId(this.getId() + 1);
        this.setNome(JOptionPane.showInputDialog("Cadastro de Cliente\n\nDigite o nome do Cliente: "));
        this.setEndereco(JOptionPane.showInputDialog("Cadastro de Cliente\n\nDigite o endereço do Cliente: "));
        this.setEmail(JOptionPane.showInputDialog("Cadastro de Cliente\n\nDigite o e-mail do Cliente: "));
        this.setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Cadastro de Cliente\n\nDigite a renda mensal do Cliente (R$): ")));
    }
    
    public void listarCliente(){
        JOptionPane.showMessageDialog(null, "Dados do Cliente:\n" +
                                            "\nID: " + this.getId() +
                                            "\nNome: " + this.getNome() +
                                            "\nEndereco: " + this.getEndereco() +
                                            "\nE-mail: " + this.getEmail() +
                                            "\nRenda Mensal: R$ " + this.getRendaMensal());
    }
}
