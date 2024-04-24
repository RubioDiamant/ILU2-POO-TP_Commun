package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	private String service;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		switch (numService){
		case 1 :
			service = "premier";
			break;
		case 2 :
			service = "deuxième";
			break;
		}
		
		return "Le " + super.toString() + "\nTable " + numTable + " pour le " 
	+ service + " service.";
	}

}
