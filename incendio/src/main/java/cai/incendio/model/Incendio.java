package cai.incendio.model;




import org.springframework.data.annotation.Id;
//import org.springframework.data.geo.Point;


public class Incendio {
	
	@Id
	public String id;

	public String fecha;

	public double riesgoincendio;
	
	public double precipitacion;
	
	public int diasinlluvia;
	
	public String pais;
	
	public String estado;
	
	public String municipio;
	
	public double latitud;
	
	public double longitud;
	
	
	

	public Incendio(String id, String fecha, double riesgoincendio, 
			double precipitacion, int diasinlluvia, String pais, String estado,
			String municipio, double latitud, double longitud) { 
		this.setId(id);
		this.setFecha(fecha);
		this.setRiesgoincendio(riesgoincendio);
		this.setDiasinlluvia(diasinlluvia);
		this.setPrecipitacion(precipitacion);
		this.setPais(pais);
		this.setEstado(estado);
		this.setMunicipio(municipio);
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}
	public Incendio() {
		
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
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
	
	public double getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(double precipitacion) {
		this.precipitacion = precipitacion;
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

	public double[] getCoordenadas(){
		return new double[] {this.latitud,this.longitud};
	}
	

}
