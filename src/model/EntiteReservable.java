package model;

public abstract class EntiteReservable <Form extends Formulaire>{
	private CalendrierAnnuel calendrier;
	private int numero;
	private Form formulaire;
	
	public EntiteReservable(Form formulaire) {
		calendrier = new CalendrierAnnuel();
		this.formulaire = formulaire;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(Form formulaire) {
		return calendrier.estLibre(formulaire.getJour() - 1, formulaire.getMois() - 1);
	}
	
	public boolean compatible(Form formulaire) {
		return false;
	}
}