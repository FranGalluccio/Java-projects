package model;

public class DelfinoCurioso extends Animale{

	boolean moltoCurioso;
	private String nome;
	private double lunghezza;

	public DelfinoCurioso() {
	}
	public DelfinoCurioso (double pesoAnimale, String habitat, String dieta) {
		super("DelfinoCurioso", pesoAnimale, habitat, dieta);
	}
	public DelfinoCurioso(double pesoAnimale, String habitat, String dieta, boolean moltoCurioso, String nome, double lunghezza) {
		super("DelfinoCurioso", pesoAnimale, habitat, dieta);
	}
	public boolean isMoltoCurioso() {
		return moltoCurioso;
	}
	public void setMoltoCurioso(boolean moltoCurioso) {
		this.moltoCurioso = moltoCurioso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	@Override
	public String toString() {
		return super.toString() + "," + moltoCurioso + "," + nome + "," + lunghezza;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(lunghezza);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (moltoCurioso ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DelfinoCurioso other = (DelfinoCurioso) obj;
		if (Double.doubleToLongBits(lunghezza) != Double.doubleToLongBits(other.lunghezza))
			return false;
		if (moltoCurioso != other.moltoCurioso)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
