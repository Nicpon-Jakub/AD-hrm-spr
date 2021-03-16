public class Godziny{

	private String godziny;
	private Integer liczbaGodzin = 0;
	private String przedmiot;


	liczbaGodzin(Integer liczba){
		this.liczbaGodzin = liczba;
	}

	Przedmiot(String nazwa){
		this.przedmiot = nazwa;
	}

	public int liczbaPozostalo(){
		Integer liczbaGodzTematow = 0;
		return liczbaGodzin - liczbaGodzTemtow;
	}

	public void listujTemat(){
		for( Zajecia zaj : listaTematow){
			Tematy[ i ];
		}
	}

}