/**
 * 
 */
package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;

/**
 * @author venus
 *
 */
public interface EmailService {
	
	public void notificarAtraso(Usuario usuario);
}
