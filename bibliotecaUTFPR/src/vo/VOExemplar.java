package vo;

import java.util.Date;

public class VOExemplar {

	private String id;
	private String Titulo;
	private VOClassificacao classificacao;
	private VOAutor autor;
	private VOEditora editora;
	private Date dataHora;

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
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the classificacao
     */
    public VOClassificacao getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(VOClassificacao classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the autor
     */
    public VOAutor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(VOAutor autor) {
        this.autor = autor;
    }

    /**
     * @return the editora
     */
    public VOEditora getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(VOEditora editora) {
        this.editora = editora;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

}