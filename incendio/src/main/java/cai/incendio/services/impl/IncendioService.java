package cai.incendio.services.impl;



import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.inject.Inject;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cai.incendio.dto.IncendioDTO;
import cai.incendio.dto.LluviaDTO;
import cai.incendio.repository.IncendioRepository;
import cai.incendio.services.IIncendioService;

@Service
@Transactional
public class IncendioService implements IIncendioService {
	
	@Inject
	public IncendioRepository incendioRepository;
	
	
	@Override
	public Collection<IncendioDTO> getIncendios(){
		Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
		this.getIncendioRepository().findAll().stream().
		map(a -> new IncendioDTO(a)).
		collect(Collectors.toCollection(() -> result));
		return result;
	}
	
	@Override
	public Collection<IncendioDTO> getIncendiosFecha(String fromDate, String toDate){
		Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
		this.getIncendioRepository().findByDates(fromDate,toDate).stream().
		map(a -> new IncendioDTO(a)).
		collect(Collectors.toCollection(() -> result));
		return result;
	}
	
	@Override
	public Collection<IncendioDTO> getIncendiosRadio(double rLong, double rLat, double rRadio){
		Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
		this.getIncendioRepository().findByRadio(rLong,rLat,rRadio).stream().
		map(a -> new IncendioDTO(a)).
		collect(Collectors.toCollection(() -> result));
		return result;
	}
	
	@Override
	public Collection<IncendioDTO> getIncendiosLluvia(int rDias){
		Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
		this.getIncendioRepository().findByLluvia(rDias).stream().
		map(a -> new IncendioDTO(a)).
		collect(Collectors.toCollection(() -> result));
		return result;
	}
	
	@Override
	public Collection<LluviaDTO> getIncendiosPromLluvia(){
		Collection<LluviaDTO> result = new ArrayList<LluviaDTO>();
		this.getIncendioRepository().findByPromLluvia().stream().
		map(a -> new LluviaDTO(a)).
		collect(Collectors.toCollection(() -> result));
		return result;
	}

	
	public IncendioRepository getIncendioRepository() {
		return this.incendioRepository;
	}

	public void setIncendioRepository(IncendioRepository incendioRepository) {
		this.incendioRepository = incendioRepository;
	}

	
	
}
