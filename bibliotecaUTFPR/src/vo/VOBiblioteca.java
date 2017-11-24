package vo;

public class VOBiblioteca {

	private String id;
	private VOEndereco endereco;
	private String nome;
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