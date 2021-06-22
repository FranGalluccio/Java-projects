
public class Util {
	
	//aggiunge un valore ad una quantit� fino al raggiungimento della quantit� massima
	public void add(int value, int quantDisp, int quantMax)
    {
        if (quantDisp > 0)
        {
            value += quantDisp;

            if (quantDisp > quantMax)
            {
                quantDisp = quantMax;
            }
        }
    }
	
	//rimuove un valore ad una quantit� (se il valore da rimuovere non � superiore alla quantit� disponibile)
	 public int remove(int value, int quantDisp, int quantMax)
     {        

         if (quantDisp > 0)
         {
             value = (value > quantMax) ? quantMax : quantDisp;
             quantDisp -= value;
         }
         return value;
     }

}
