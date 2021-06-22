
public class Program {

	public static void main(String[] args) {
		//L�avanzamento di un nastro trasportatore pu� avvenire secondo due modi di funzionamento: 1)� inserito l�interruttore di
        //alimentazione e vi sono pezzi da trasportare; 2)� inserito l�interruttore, vi sono pezzi da trasportare e il numero dei pezzi gi�
        //trasportati � inferiore ad un limite prefissato 3)Inoltre l�avanzamento si deve arrestare automaticamente non appena qualche
        //incidente, per esempio la caduta di un pezzo, altera il funzionamento.

		//boolean a = i && p && (!c) && (m || n);
        boolean i = true; // inserimento interruttore
        boolean c = false;// se c'� un incidente
        boolean p = true; // numero di pezzi da trasportare
        boolean m = true; // modalit�
        boolean n = true; // pezzi inferiori
        boolean nastroFunzionante = (i && p && m && m && n && (i && p && (!c) && (m || n))); 

        if (nastroFunzionante) {
        System.out.println("i \t c \t p \t m \t n \t Nastro Funzionante");
        System.out.println(i + "\t" + c + "\t" + p + "\t" + m + "\t" + n + "\t");
        }else {
        	System.out.println("i \t c \t p \t m \t n \t Nastro Non Funzionante");
            System.out.println(i + "\t" + c + "\t" + p + "\t" + m + "\t" + n + "\t");
        }        
	}
}
