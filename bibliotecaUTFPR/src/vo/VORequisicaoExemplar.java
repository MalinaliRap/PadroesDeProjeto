package vo;

import java.util.ArrayList;
import java.util.Date;

public class VORequisicaoExemplar {

	private VOBibliotecario fazer;
	private String id;
	private VOFuncionario funcionario;
	private ArrayList<VOExemplar> exemplar;
	private Date dataHora;
        private boolean status;

    /**
     * @return the fazer
     */
    public VOBibliotecario getFazer() {
        return fazer;
    }

    /**
     * @param fazer the fazer to set
     */
    public void setFazer(VOBibliotecario fazer) {
        this.fazer = fazer;
    }


    /**
     * @return the funcionario
     */
    public VOFuncionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(VOFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the exemplar
     */
    public ArrayList<VOExemplar> getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(ArrayList<VOExemplar> exemplar) {
        this.exemplar = exemplar;
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

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
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