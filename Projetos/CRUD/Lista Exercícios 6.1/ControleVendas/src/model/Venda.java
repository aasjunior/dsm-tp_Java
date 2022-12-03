package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;
    
    Conexao con = new Conexao();
    
    public Venda() {
        this(0,"","");
    }

    public Venda(int codigo, String nomeVendedor, String produtoVendido) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    
    public void cadastrarVenda(){
        String sql;
        String sqlId;
        ResultSet tabela = null;
        
        try{
            sql = "INSERT INTO Vendas(nomeVendedor, produtoVendido) VALUES('" + this.getNomeVendedor() +
                                                                        "','" + this.getProdutoVendido() + "' );";
            con.executeSQL(sql);
            try{
                sqlId = "SELECT codigo FROM Vendas WHERE nomeVendedor= '" + this.getNomeVendedor() + "';";

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
        
    public ResultSet consultarVenda(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Vendas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void alterarVenda(){
        String sql;
        sql = "UPDATE Vendas SET nomeVendedor= '" + this.getNomeVendedor() + 
                               "', produtoVendido= '" + this.getProdutoVendido() + 
                               "' WHERE codigo= " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.");    
    }
     
    public void excluirVenda(){
        String sql;
        sql = "DELETE FROM Vendas WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public Venda getVenda(int codigo){
        String sql = "SELECT * FROM Vendas WHERE codigo = " + codigo;
        
        ResultSet rs = null;
        
        try{
            rs = con.RetornarResultset(sql);
            Venda venda = new Venda();
            
            rs.first();
            venda.setCodigo(rs.getInt("codigo"));
            venda.setNomeVendedor(rs.getString("nomeVendedor"));
            venda.setProdutoVendido(rs.getString("produtoVendido"));
            return venda;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados cadastrais: " + erro);
        }
        return null;
    }
}