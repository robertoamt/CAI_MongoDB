package cai.incendio.controller;


import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cai.incendio.dto.IncendioDTO;
import cai.incendio.dto.LluviaDTO;
import cai.incendio.services.IIncendioService;



@RestController
public class IncendioController {
	
	@Inject
	private IIncendioService incendiosService;
	
	//Lista todos los documentos de la colección
	@GetMapping(value = "/api/incendios")
	public ResponseEntity<?> getIncendios() {
		ResponseEntity<?> response = null;
		Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
		result.addAll(this.getIncendiosService().getIncendios());
		response = ResponseEntity.ok(result);
		return response;	
	}
	
	//Lista los documentos que se encuentran dentro del radio de un punto
	//Se debe especificar punto (rLong y rLat) y radio (rRadio)
	@GetMapping(value="/api/incendios_radio")
    public ResponseEntity<?> getIncendiosRadio(
            @RequestParam(value = "long")  double rLong,
            @RequestParam(value = "lat")  double rLat,
            @RequestParam(value = "radio")  double rRadio) {
        ResponseEntity<?> response = null;
        Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
        result.addAll(this.getIncendiosService().getIncendiosRadio(rLong,rLat,rRadio));
        response = ResponseEntity.ok(result);
        return response;
    }
	
	//Lista los documentos que tienen mayor cantidad de dias sin lluvia
	//respecto al valor especificado (rDias)
	@GetMapping(value="/api/incendios_sinlluvia")
    public ResponseEntity<?> getIncendiosLluvia(
            @RequestParam(value = "dias")  int rDias) {
        ResponseEntity<?> response = null;
        Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
        result.addAll(this.getIncendiosService().getIncendiosLluvia(rDias));
        response = ResponseEntity.ok(result);
        return response;
    }
	
	//Lista la suma de los días sin lluvia y la cantidad de documentos de cada pais
	@GetMapping(value="/api/incendios_promSinlluvia")
    public ResponseEntity<?> getIncendiosPromLluvia(){
        ResponseEntity<?> response = null;
        Collection<LluviaDTO> result = new ArrayList<LluviaDTO>();
        result.addAll(this.getIncendiosService().getIncendiosPromLluvia());
        response = ResponseEntity.ok(result);
		return response;
    }
	
	//Lista los documentos entre dos fechas establecidas (fromDate y toDate)
	@GetMapping(value="/api/incendios_fecha")
    public ResponseEntity<?> getIncendiosFecha(
            @RequestParam(value = "fromDate")  String fromDate,
            @RequestParam(value = "toDate")  String toDate) {
        ResponseEntity<?> response = null;
        Collection<IncendioDTO> result = new ArrayList<IncendioDTO>();
        result.addAll(this.getIncendiosService().getIncendiosFecha(fromDate,toDate));
        response = ResponseEntity.ok(result);
        return response;
    }
	
	
	public IIncendioService getIncendiosService() {
		return this.incendiosService;
	}

}
