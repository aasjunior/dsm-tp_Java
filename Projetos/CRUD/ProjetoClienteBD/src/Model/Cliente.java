package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    
    Conexao con = new Conexao();

    public Cliente() {
        this(0,"","","");
    }

    public Cliente(int codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //METODO PARA CADASTRAR OS DADOS
    public void cadastrar(){
        String sql;
        sql = "INSERT INTO clientes(codigo, nome, telefone, email) VALUES(" + this.getCodigo() +
                                                                          ",'" + this.getNome() +
                                                                          "','" + this.getTelefone() +
                                                                          "','" + this.getEmail() + "');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
    }
    
    //ResultSet -> retorna o resultado do que for consultado no BD
    public ResultSet consultar(){
        ResultSet tabela = null;
        String sql = "SELECT * FROM clientes;";
        
        tabela = con.RetornarResultset(sql);
        
        return tabela;
    }
}
