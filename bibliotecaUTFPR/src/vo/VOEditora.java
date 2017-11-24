package vo;

public class VOEditora {

	private String id;
	private VOTelefone telefone;
	private VOEmail email;
        private String nome;

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
     * @return the telefone
     */
    public VOTelefone getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(VOTelefone telefone) {
        this.telefone = telefone;
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

}