package computers.beans;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data	
@NoArgsConstructor
public class Computers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String manufacturer;
	private double ghz;
	private int serialNum;
	private String processorManufacturer;
	
	
	public Computers(String manufacturer, double ghz, int serialNum, String processorManufacturer) {
		super();
		this.manufacturer = manufacturer;
		this.ghz = ghz;
		this.serialNum = serialNum;
		this.processorManufacturer = processorManufacturer;
	}
	
	public Computers(int id, double ghz, int serialNum, String processorManufacturer) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.ghz = ghz;
		this.serialNum = serialNum;
		this.processorManufacturer = processorManufacturer;
	}


	@Override
	public String toString() {
		return "Computers [id=" + id + ", manufacturer=" + manufacturer + ", ghz=" + ghz + ", serialNum=" + serialNum
				+ ", processorManufacturer=" + processorManufacturer + "]";
	}
	
	

}
