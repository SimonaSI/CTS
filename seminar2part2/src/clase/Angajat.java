package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private Integer salariu;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(Integer salariu) {
		this.salariu = salariu;
	}

	public Angajat() {
		super();
		
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie= ").append(ocupatie);
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}


}
