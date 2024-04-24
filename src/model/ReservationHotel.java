package model;

public class ReservationHotel extends Reservation{
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int nbChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, 
			int nbChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.nbChambre = nbChambre;
	}
	
	@Override
	public String toString() {
		return "Le " + super.toString() + " : chambre n° " + nbChambre + ", " + nbLitSimple
				+ " lit(s) simple(s) et " + nbLitDouble + " lit(s) double(s).";
	}
	
}
