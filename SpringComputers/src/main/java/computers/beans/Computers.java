package computers.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String manufacturer;
	private double ghz;
	private int serialNum;
	private String processorManufacturer;
	
	public Computers() {
		super();
		this.manufacturer = "Dell";
	}
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getGhz() {
		return ghz;
	}

	public void setGhz(double ghz) {
		this.ghz = ghz;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getProcessorManufacturer() {
		return processorManufacturer;
	}

	public void setProcessorManufacturer(String processorManufacturer) {
		this.processorManufacturer = processorManufacturer;
	}

	@Override
	public String toString() {
		return "Computers [id=" + id + ", manufacturer=" + manufacturer + ", ghz=" + ghz + ", serialNum=" + serialNum
				+ ", processorManufacturer=" + processorManufacturer + "]";
	}
	
	

}
