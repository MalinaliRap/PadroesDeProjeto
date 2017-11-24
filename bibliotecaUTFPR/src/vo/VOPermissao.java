package vo;

import java.util.*;

public class VOPermissao {

	private Collection<VOUsuario> tem;
	private String descricao;
	private String id;

    /**
     * @return the tem
     */
    public Collection<VOUsuario> getTem() {
        return tem;
    }

    /**
     * @param tem the tem to set
     */
    public void setTem(Collection<VOUsuario> tem) {
        this.tem = tem;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

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

}