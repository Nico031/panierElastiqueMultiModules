package afpa.cdi.elastique.panier.modele;

import java.io.Serializable;


public class Client implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7264858985910445091L;

	/**
	 * identifiant du client
	 */
	private String login;
	
	/**
	 * mot de passe du client
	 * 
	 */
	private String password;
	
	
	/**
	 * Constructeur sans paramètres
	 */
	
	public Client() {
		super();
	}


	/**
	 * Constructeur avec identifiant et mdp
	 *
	 */
	public Client(String ident, String mdp) {
		super();
		this.login 		= ident;
		this.password 	= mdp;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String identifiant) {
		this.login = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String motDePasse) {
		password = motDePasse;
	}
	
	
	
	/**
	 * methode pour verifier l'identité du client
	 * @return
	 */
	public boolean validate() {
		
		if (this.login.equals("lana") && this.password.equals("travail!")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Ident = " + this.getLogin() + "  Pass = " + this.getPassword();
	}

	

}
