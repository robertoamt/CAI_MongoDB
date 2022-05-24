package cai.incendio.services;



import java.util.Collection;

import cai.incendio.dto.IncendioDTO;
import cai.incendio.dto.LluviaDTO;

public interface IIncendioService {
	
	public Collection<IncendioDTO> getIncendios();		

	public Collection<? extends IncendioDTO> getIncendiosFecha(String fromDate, String toDate);

	public Collection<? extends IncendioDTO> getIncendiosRadio(double rLong, double rLat, double rRadio);

	public Collection<? extends IncendioDTO> getIncendiosLluvia(int rDias);

	public Collection<? extends LluviaDTO> getIncendiosPromLluvia();

	

}
