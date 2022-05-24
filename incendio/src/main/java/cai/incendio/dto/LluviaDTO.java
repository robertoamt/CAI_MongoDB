package cai.incendio.dto;

import org.springframework.data.mongodb.core.mapping.Field;


public class LluviaDTO {
	
	@Field("_id")
	private String pais;
	
	@Field("totalDiaSinLluvia")
	private int totalDiaSinLluvia;
	
	@Field("cantReg")
	private int cantReg;

	public LluviaDTO(LluviaDTO a) {
		// TODO Auto-generated constructor stub
		this.setPais(a.getPais());
		this.setTotalDiaSinLluvia(a.getTotalDiaSinLluvia());
		this.setCantReg(a.getCantReg());
	}
	
	public LluviaDTO() {
		// TODO Auto-generated constructor stub
	}

	public LluviaDTO(String pais, int totalDiaSinLluvia, int cantReg) {
		super();
		this.pais = pais;
		this.totalDiaSinLluvia = totalDiaSinLluvia;
		this.cantReg = cantReg;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTotalDiaSinLluvia() {
		return totalDiaSinLluvia;
	}

	public void setTotalDiaSinLluvia(int totalDiaSinLluvia) {
		this.totalDiaSinLluvia = totalDiaSinLluvia;
	}

	public int getCantReg() {
		return cantReg;
	}

	public void setCantReg(int cantReg) {
		this.cantReg = cantReg;
	}
	
	

	

}
