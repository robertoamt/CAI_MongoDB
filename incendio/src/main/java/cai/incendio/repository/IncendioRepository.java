package cai.incendio.repository;



import java.util.Collection;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import cai.incendio.dto.LluviaDTO;
import cai.incendio.model.Incendio;
	
@Repository
public interface IncendioRepository extends MongoRepository<Incendio, String>{
	
	
	@Query("{ 'fecha' : { $gte: ?0, $lte: ?1 }}")
	public Collection<Incendio> findByDates(String fromDate, String toDate);

	@Query("{'localizacion': {$nearSphere: {$geometry: {type : 'Point', coordinates : [ ?0, ?1 ]}, "
			+ "$minDistance: 0, $maxDistance: ?2 }}}")
	public Collection<Incendio> findByRadio(double rLong, double rLat, double rRadio);

	@Query("{ 'diasinlluvia' : { $gte: ?0 }}")
	public Collection<Incendio> findByLluvia(int rDias);

	@Aggregation(pipeline = {"{'$group': {'_id': '$pais','totalDiaSinLluvia': { '$sum': '$diasinlluvia' }, 'cantReg': {'$sum': 1}}},"
			+ "{ '$sort': { 'totalDiaSinLluvia': -1 } },{ '$project' : {'cantReg' : 1, 'totalDiaSinLluvia' : 1}}"})
	public Collection<LluviaDTO> findByPromLluvia();
	
}//


