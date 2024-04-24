package model;

public class FormulaireHotel extends Formulaire{
	private int numChambreE;
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

	public int getIdentificationEntite() {
		return numChambreE;
	}

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}

	public void setIdentificationEntite(int numChambreE) {
		this.numChambreE = numChambreE;
	}
	
	
}
