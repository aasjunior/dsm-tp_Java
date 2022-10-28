package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private String telefone;

    Conexao con = new Conexao();
    
    public Usuario() {
        this(0,"","","");
    }

    public Usuario(int codigo, String login, String senha, String telefone) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastrarUsuario(){           
        String sql = "INSERT INTO Usuarios(codigo,login,senha,telefone) VALUES(" + this.getCodigo() +
                                                                        ",'" + this.getLogin() +
                                                                        "','" + this.getSenha() +
                                                                        "','" + this.getTelefone() + "' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
        
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Usuarios";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
     
    public void excluir(){
        String sql;
        sql = "DELETE FROM Usuarios WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterar(){
        String sql;
        sql = "UPDATE Usuarios SET login= '" + this.getLogin() + 
                               "', senha= '" + this.getSenha() + 
                               "', telefone= '" + this.getTelefone() + 
                               "' WHERE codigo= " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");    
    }
}
