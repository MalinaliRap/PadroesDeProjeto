package vo;

public class VOEmail {

	private VOUsuario vOUsuario;
	private String endereco;
	private String provedor;
	private String sufixo;

    /**
     * @return the vOUsuario
     */
    public VOUsuario getvOUsuario() {
        return vOUsuario;
    }

    /**
     * @param vOUsuario the vOUsuario to set
     */
    public void setvOUsuario(VOUsuario vOUsuario) {
        this.vOUsuario = vOUsuario;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the provedor
     */
    public String getProvedor() {
        return provedor;
    }

    /**
     * @param provedor the provedor to set
     */
    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    /**
     * @return the sufixo
     */
    public String getSufixo() {
        return sufixo;
    }

    /**
     * @param sufixo the sufixo to set
     */
    public void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }

}