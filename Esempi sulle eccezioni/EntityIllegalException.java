
@SuppressWarnings("serial")
public class EntityIllegalException extends IllegalArgumentException {
	
	public EntityIllegalException() {
		super("Attenzione!!! L'entit� inserita non appartiene alla gerarchia prevista!!!");
	}

}
