package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jspider {

	@Id
	private int id ;
	
	private String name;
	
	private long phoneno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
