package vo;

import java.util.*;

public class VOUsuario {

	private String id;
	private String login;
	private String senha;
	private String nome;
	private ArrayList<VOPermissao> permissao;
	private VOImagem foto;
	private VOEndereco endereco;
	private VOEmail email;


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the permissao
     */
    public ArrayList<VOPermissao> getPermissao() {
        return permissao;
    }

    /**
     * @param permissao the permissao to set
     */
    public void setPermissao(ArrayList<VOPermissao> permissao) {
        this.permissao = permissao;
    }

    /**
     * @return the foto
     */
    public VOImagem getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(VOImagem foto) {
        this.foto = foto;
    }

    /**
     * @return the endereco
     */
    public VOEndereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(VOEndereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the email
     */
    public VOEmail getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(VOEmail email) {
        this.email = email;
    }

}