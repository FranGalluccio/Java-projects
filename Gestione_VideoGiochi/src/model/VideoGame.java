package model;

import java.util.Date;

public class VideoGame implements Comparable<VideoGame>{

	private int id;
	private String nome;
	private String genere;
	private double prezzo;
	private Date dataUscita;
	private String softwareHouse;
	private boolean retrocompatibilita;
	
	public VideoGame(int id, String nome, String genere, double prezzo, Date dataUscita, String softwareHouse, boolean retrocompatibilita) {
		this.id = id;
		this.nome = nome;
		this.genere = genere;
		this.prezzo = prezzo;
		this.dataUscita = dataUscita;
		this.softwareHouse = softwareHouse;
		this.retrocompatibilita = retrocompatibilita;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Date getDataUscita() {
		return dataUscita;
	}
	public void setDataUscita(Date dataUscita) {
		this.dataUscita = dataUscita;
	}
	public String getSoftwareHouse() {
		return softwareHouse;
	}
	public void setSoftwareHouse(String softwareHouse) {
		this.softwareHouse = softwareHouse;
	}
	public boolean isRetrocompatibilita() {
		return retrocompatibilita;
	}
	public void setRetrocompatibilita(boolean retrocompatibilita) {
		this.retrocompatibilita = retrocompatibilita;
	}

	@Override
	public String toString() {
		return id + "," + nome + "," + genere + "," + prezzo + ","
				+ dataUscita + "," + softwareHouse + "," + retrocompatibilita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataUscita == null) ? 0 : dataUscita.hashCode());
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (retrocompatibilita ? 1231 : 1237);
		result = prime * result + ((softwareHouse == null) ? 0 : softwareHouse.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoGame other = (VideoGame) obj;
		if (dataUscita == null) {
			if (other.dataUscita != null)
				return false;
		} else if (!dataUscita.equals(other.dataUscita))
			return false;
		if (genere == null) {
			if (other.genere != null)
				return false;
		} else if (!genere.equals(other.genere))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		if (retrocompatibilita != other.retrocompatibilita)
			return false;
		if (softwareHouse == null) {
			if (other.softwareHouse != null)
				return false;
		} else if (!softwareHouse.equals(other.softwareHouse))
			return false;
		return true;
	}

	@Override
	public int compareTo(VideoGame o) {
	        Integer nominativoUno,nominativoDue;
	        nominativoUno=this.id;
	        nominativoDue=o.getId();
	        return nominativoUno.compareTo(nominativoDue);
	}
}
