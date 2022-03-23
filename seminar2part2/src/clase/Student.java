package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected Integer anStudii;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAnStudii(Integer anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append(super.toString());
		sb.append("facultate= ").append(facultate);
		sb.append(", anStudii=").append(anStudii);
		sb.append('}');
		return sb.toString();
	}
}
