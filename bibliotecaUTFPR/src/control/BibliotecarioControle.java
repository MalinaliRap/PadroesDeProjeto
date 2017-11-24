
import java.util.ArrayList;
import vo.VOBiblioteca;
import vo.VOExemplar;
import vo.VOLocacao;
import vo.VOMulta;
import vo.VOPermissao;
import vo.VORequisicaoExemplar;
import vo.VOReserva;
import vo.VOUsuario;

public class BibliotecarioControle extends UsuarioControle {

	/**
	 * 
	 * @param usuario
	 */
	public boolean inserirUsuario(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public boolean deletarUsuario(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public boolean atualizaUsuario(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public Usuario selecionaUsuario(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exemplar
	 */
	public boolean inserirExemplar(VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exemplar
	 */
	public boolean deletarExemplar(VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exemplar
	 */
	public boolean atualizarExemplar(VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exemplar
	 */
	public VOExemplar selecionarExemplar(VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param permissao
	 */
	public VOPermissao InserirPermissao(VOPermissao permissao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param permissao
	 */
	public boolean deletarPermissao(VOPermissao permissao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param permissao
	 */
	public boolean atualizarPermissao(VOPermissao permissao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param permissao
	 */
	public VOPermissao selecionaPermissao(VOPermissao permissao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param exemplar
	 */
	public VOReserva reservarExemplar(VOUsuario usuario, ArrayList<VOExemplar> exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param exemplar
	 */
	public VOLocacao emprestimo(VOUsuario usuario, VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param exemplar
	 */
	public VOLocacao devolucao(VOUsuario usuario, VOExemplar exemplar) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param multa
	 */
	public boolean quitarMulta(VOUsuario usuario, VOMulta multa) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public boolean liberarUsuario(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public ArrayList<VOMulta> consultarMultas(VOUsuario usuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param VOUsuario
	 */
	public ArrayList<VOLocacao> consultarPendencias(int VOUsuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param permissao
	 */
	public void atribuirPermissao(VOUsuario usuario, VOPermissao permissao) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exemplar
	 * @param biblioteca
	 */
	public VORequisicaoExemplar requisitarLivro(VOExemplar exemplar, VOBiblioteca biblioteca) {
		throw new UnsupportedOperationException();
	}

}