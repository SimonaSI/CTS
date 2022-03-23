package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private Integer clasa;
	private String tutore;

	public void setClasa(Integer i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append(super.toString());
		sb.append("clasa=").append(clasa);
		sb.append(", tutore= ").append(tutore);
		sb.append('}');
		return sb.toString();
	}

	public Elev() {
		super();
	}
	
}
