package org.springframework.samples.evipdus.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.evipdus.model.AnalysisOfNecesity;
import org.springframework.transaction.annotation.Transactional;

public interface AnalysisOfNecesityRepository extends PagingAndSortingRepository<AnalysisOfNecesity, Integer> {

	
	@Query("SELECT aon FROM AnalysisOfNecesity aon")
	@Transactional(readOnly = true)
	List<AnalysisOfNecesity> findAllAoN(Pageable page);
	
	@Query("SELECT aon FROM AnalysisOfNecesity aon WHERE id=:id")
	@Transactional(readOnly = true)
	AnalysisOfNecesity findByIdAoN(@Param("id") Integer id);
	
	
	@Query("SELECT aon FROM AnalysisOfNecesity aon WHERE aon.user.id=:id")
	@Transactional(readOnly = true)
	AnalysisOfNecesity findByUserId(@Param("id") Integer id);
	
	//void save(AnalysisOfNecesity aon);
}
