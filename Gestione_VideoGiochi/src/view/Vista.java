package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

import model.VideoGame;

public class Vista {

	Scanner input = new Scanner(System.in);

	public String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		return input.nextLine();
	}

	public int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		boolean flag = false;
		int leggiIntero = 0;
		do {
			flag = false;
			try {
				leggiIntero = Integer.parseInt(input.nextLine());

			} catch (Exception e) {
				System.out.println("Inserisci un numero");
				flag = true;
			}

		}while(flag);
		return leggiIntero;
	}

	public double leggiDouble(String messaggio) {
		System.out.println(messaggio);
		boolean flag = false;
		double leggiDouble = 0;
		do {
			flag = false;
			try {
				leggiDouble = Double.parseDouble(input.nextLine());

			} catch (Exception e) {
				System.out.println("Inserisci un numero");
				flag = true;
			}

		}while(flag);
		return leggiDouble;
	}

	public boolean leggiBoolean(String stringa) {
		String s = "";
		boolean flag = false;
		boolean ritorno = false;
		do {
			s = leggiStringa(stringa);
			flag = false;
			if(s.equalsIgnoreCase("si"))
				ritorno = true;
			else if (s.equalsIgnoreCase("no")){
				ritorno = false;
			}
			else {
				System.out.println("Inserire si o no");
				flag = true;
			}
		}while(flag);
		return ritorno;
	}

	public Date leggiData(String suggerimento){
        String sData=""; 
        Date data = null;
        boolean flag = true;
        do {
            flag = false;
            sData = leggiStringa(suggerimento +"(dd/MM/yyyy):"); 
            try {

                data = new SimpleDateFormat("dd/MM/yyyy").parse(sData);
            } catch (ParseException e) {
                System.out.println("Formato data invalido.");
                flag = true;
            }
        }while(flag);
        return data;
    }
	
	public VideoGame inserisci() {
		//int id, String nome, String genere, double prezzo, Date dataUscita, String softwareHouse, boolean retrocompatibilita
		VideoGame v = new VideoGame(leggiIntero("Inserisci id: "),leggiStringa("Inserire nome: "), 
				leggiStringa("Inserisci genere"),leggiDouble("Inserisci prezzo: "), 
				leggiData("Inserisci data di lancio:"), leggiStringa("Inserisci softwarehouse: "),
				leggiBoolean("Retrocompatibile?"));
				return v;
	}
	
	public void modifica(VideoGame v) {
		System.out.println("Id [" + v.getId()+ "]");
		v.setId(leggiIntero("Inserisci id"));

		System.out.println("Nome [" + v.getNome()+ "]");
		v.setNome(leggiStringa("Inserisci nome: "));

		System.out.println("Genere [" + v.getGenere()+ "]");
		v.setGenere(leggiStringa("Inserisci genere: "));

		System.out.println("Data lancio [" + v.getDataUscita()+ "]");
		v.setDataUscita(leggiData("Inserisci data di lancio "));

		System.out.println("Softwarehouse [" + v.getSoftwareHouse()+ "]");
		v.setSoftwareHouse(leggiStringa("Inserisci softwarehouse: "));

		System.out.println("Retrocompatibile [" + v.isRetrocompatibilita() + "]");
		v.setRetrocompatibilita(leggiBoolean("Retrocompatibile? : "));

	}
	
	public void cancella(ArrayList<VideoGame> v) {
		v.remove(leggiIntero("Inserisci l'id del VideoGame da eliminare"));
	}
	
	public void stampaScheda(ArrayList<VideoGame> v) {
		for (VideoGame vg : v) {
			System.out.println(vg.getId());
			System.out.println(vg.getNome());
			System.out.println(vg.getGenere());
			System.out.println(vg.getDataUscita());
			System.out.println(vg.getSoftwareHouse());
			System.out.println(vg.isRetrocompatibilita());
		}
	}
	
	public void stampaScheda(TreeSet<VideoGame> v) {
		for (VideoGame vg : v) {
			System.out.println(vg.getId());
			System.out.println(vg.getNome());
			System.out.println(vg.getGenere());
			System.out.println(vg.getDataUscita());
			System.out.println(vg.getSoftwareHouse());
			System.out.println(vg.isRetrocompatibilita());
		}
	}
}
