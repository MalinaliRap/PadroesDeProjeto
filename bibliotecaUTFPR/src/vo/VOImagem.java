package vo;

public class VOImagem {

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
     * @return the Caminho
     */
    public String getCaminho() {
        return Caminho;
    }

    /**
     * @param Caminho the Caminho to set
     */
    public void setCaminho(String Caminho) {
        this.Caminho = Caminho;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

	private String id;
	private String Caminho;
	private String formato;

}