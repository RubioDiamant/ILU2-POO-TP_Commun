package model;

public class FormulaireSpectacle extends Formulaire{
	private int numPlaceE;
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour, mois);
		this.numZone = numZone;
	}

	public int getNumPlaceE() {
		return numPlaceE;
	}

	public int getNumZone() {
		return numZone;
	}

	public void setNumPlaceE(int numPlaceE) {
		this.numPlaceE = numPlaceE;
	}

}
