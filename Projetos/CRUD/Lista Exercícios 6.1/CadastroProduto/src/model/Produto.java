package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;

    private Conexao con = new Conexao();
    
    public Produto() {
        this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto(){
        String sql;
        String sqlId;
        ResultSet tabela = null;
        
        try{
            sql = "INSERT INTO Produtos(nomeProduto,descricao) VALUES('" + this.getNomeProduto() +
                                                                        "','" + this.getDescricao() + "' );";
            con.executeSQL(sql);
            try{
                sqlId = "SELECT codigo FROM Produtos WHERE nomeProduto= '" + this.getNomeProduto() + "';";

                tabela = con.RetornarResultset(sqlId);
                tabela.first();
                this.setCodigo(tabela.getInt("codigo"));

                JOptionPane.showMessageDialog(null, "Registrado com sucesso");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar capturar id: " + erro);
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir os dados: " + erro);
        }
        
        
    }
        
    public ResultSet consultarProduto(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void alterarProduto(){
        String sql;
        sql = "UPDATE Produtos SET nomeProduto= '" + this.getNomeProduto() + 
                               "', descricao= '" + this.getDescricao() + 
                               "' WHERE codigo= " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.");    
    }
     
    public void excluirProduto(){
        String sql;
        sql = "DELETE FROM Produtos WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public Produto getProduto(int codigo){
        String sql = "SELECT * FROM Produtos WHERE codigo = " + codigo;
        
        ResultSet rs = null;
        
        try{
            rs = con.RetornarResultset(sql);
            Produto produto = new Produto();
            
            rs.first();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setNomeProduto(rs.getString("nomeProduto"));
            produto.setDescricao(rs.getString("descricao"));
            return produto;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados cadastrais: " + erro);
        }
        return null;
    }
}
