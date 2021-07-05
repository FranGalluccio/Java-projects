
public class ControlloEccezione {
	
	public static void metodo1() {
		throw new EntityIllegalException(); //unchecked
		//l'eccezione non � controllata
	}
	
	//checked � l'eccezione presente in un metodo a cui � stata applicata
	//la keyword throws; questo dovr� essere gestito da un try-catch da terzi
	//o ulteriormente delegato da quest'ultimi con un ulteriore throws
	public static void metodo2() throws EntityIllegalException,Exception{
		throw new EntityIllegalException(); //checked
		//l'eccezione obbliga il controllo del metodo in un try-catch
	}

}
