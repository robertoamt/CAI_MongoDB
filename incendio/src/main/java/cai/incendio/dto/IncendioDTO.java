package cai.incendio.dto;



import cai.incendio.model.Incendio;

public class IncendioDTO {
	
	private String id;

	private String fecha;

	private double riesgoincendio;
	
	private double precipitacion;
	
	private int diasinlluvia;
	
	private String pais;
	
	private String estado;
	
	private String municipio;
	
	private double[] coordenadas;
	

	public IncendioDTO(Incendio incendio) {
		this.setId(incendio.getId());
		this.setFecha(incendio.getFecha());
		this.setRiesgoincendio(incendio.getRiesgoincendio());
		this.setPrecipitacion(incendio.getPrecipitacion());
		this.setDiasinlluvia(incendio.getDiasinlluvia());
		this.setPais(incendio.getPais());
		this.setEstado(incendio.getEstado());
		this.setMunicipio(incendio.getMunicipio());
		this.setCoordenadas(incendio.getCoordenadas());
	}

	
	public IncendioDTO(String id, String fecha, double riesgoincendio, 
			int diasinlluvia, String pais, String estado, String municipio, double[] coordenadas) {
		this.id = id;
		this.fecha = fecha;
		this.riesgoincendio = riesgoincendio;
		this.diasinlluvia = diasinlluvia;
		this.pais = pais;
		this.estado = estado;
		this.municipio = municipio;
		this.coordenadas = coordenadas;				
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getRiesgoincendio() {
		return riesgoincendio;
	}

	public void setRiesgoincendio(double riesgoincendio) {
		this.riesgoincendio = riesgoincendio;
	}

	public int getDiasinlluvia() {
		return diasinlluvia;
	}

	public void setDiasinlluvia(int diasinlluvia) {
		this.diasinlluvia = diasinlluvia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public double[] getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(double[] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public double getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(double precipitacion) {
		this.precipitacion = precipitacion;
	}
	
	
	

}
