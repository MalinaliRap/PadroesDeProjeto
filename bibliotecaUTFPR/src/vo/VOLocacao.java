package vo;

import java.util.Date;

public class VOLocacao {

	private String id;
	private Date previsaoDevolucao;
	private VOUsuario usuario;
	private VOExemplar exemplar;
	private VOReserva reserva = null;
	private Date dataDevolucao = null;
	private Date dataEmprestimo;
	private boolean pendencia;
	private String observacoes;
	private VOMulta multa;

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
     * @return the previsaoDevolucao
     */
    public Date getPrevisaoDevolucao() {
        return previsaoDevolucao;
    }

    /**
     * @param previsaoDevolucao the previsaoDevolucao to set
     */
    public void setPrevisaoDevolucao(Date previsaoDevolucao) {
        this.previsaoDevolucao = previsaoDevolucao;
    }

    /**
     * @return the usuario
     */
    public VOUsuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(VOUsuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the exemplar
     */
    public VOExemplar getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(VOExemplar exemplar) {
        this.exemplar = exemplar;
    }

    /**
     * @return the reserva
     */
    public VOReserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(VOReserva reserva) {
        this.reserva = reserva;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the dataEmprestimo
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the pendencia
     */
    public boolean isPendencia() {
        return pendencia;
    }

    /**
     * @param pendencia the pendencia to set
     */
    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the multa
     */
    public VOMulta getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(VOMulta multa) {
        this.multa = multa;
    }

}