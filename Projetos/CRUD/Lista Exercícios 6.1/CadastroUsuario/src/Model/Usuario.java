package Model;

import Control.Conexao;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private String email;

    Conexao con = new Conexao();

    public Usuario() {
        this(0, "", "", "", "");
    }

    public Usuario(int id, String nome, String login, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarUsuario(){
        String sql;
        String sqlId;
        ResultSet tabela = null;
        
        try{
            sql = "INSERT INTO Usuarios(nome, login, senha, email) values('" + this.getNome() + 
                                                                            "', '" + this.getLogin() + 
                                                                            "', '" + this.getSenha() +
                                                                            "', '" + this.getEmail() + "');";
        
            con.executeSQL(sql);

            try{
                sqlId = "SELECT id FROM Usuarios WHERE email= '" + this.getEmail() + "';";

                tabela = con.RetornarResultset(sqlId);
                tabela.first();
                this.setId(tabela.getInt("id"));
                
                JOptionPane.showMessageDialog(null, "Registrado com sucesso");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar capturar id: " + erro);
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir os dados: " + erro);
        } 
    }
    
    public ResultSet consultarUsuario(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Usuarios";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluirUsuario(){
        String sql = "DELETE FROM Usuarios WHERE  id= " + this.getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarUsuario(){
        String sql = "UPDATE Usuarios SET nome= '" + this.getNome() + 
                               "', login= '" + this.getLogin() + 
                               "', senha= '" + this.getSenha() +
                               "', email= '" + this.getEmail() +
                               "' WHERE id= " + this.getId();
        
        try{
            con.executeSQL(sql);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar os dados cadastrais: " + erro);
        } 
    }
    
    public Usuario getUsuario(int id){
        String sql = "SELECT * FROM Usuarios WHERE id = " + id;
        
        ResultSet rs = null;
        
        try{
            rs = con.RetornarResultset(sql);
            Usuario usuario = new Usuario();
            
            rs.first();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setEmail(rs.getString("email"));
            return usuario;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados cadastrais: " + erro);
        }
        return null;
    }
   
    public String criptografarSenha(String txtSenha){
        String senha = txtSenha;
        
        try{
            MessageDigest hash = MessageDigest.getInstance("SHA-256"); //gera o hash utilizando o SHA (Secure Hash Algorithm - tamanho de saída de 256 bits)
            byte messageDigest[] = hash.digest(senha.getBytes("UTF-8"));//efetua criptografia retornando um array de bytes

            StringBuilder hexString = new StringBuilder();
            for(byte b : messageDigest){ //foreach: para cada byte 'b' contido no array 'messageDigest'
                hexString.append(String.format("%02X", 0xFF & b)); //converte os valores de 'b' para String e concatena com o objeto hexString (valor hexadecimal) 
            }

            String senhaHex = hexString.toString();

            return senhaHex;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar criptografar senha: " + erro);
            return null;
        }
    }
    
    public void sair(){
        System.exit(0);
        return;
    }
}
