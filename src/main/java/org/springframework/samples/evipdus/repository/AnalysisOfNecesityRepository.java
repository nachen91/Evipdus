package org.springframework.samples.evipdus.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.samples.evipdus.model.AnalysisOfNecesity;
import org.springframework.transaction.annotation.Transactional;

public interface AnalysisOfNecesityRepository extends PagingAndSortingRepository<AnalysisOfNecesity, Integer> {

	
	@Query("SELECT aon FROM AnalysisOfNecesity aon")
	@Transactional(readOnly = true)
	List<AnalysisOfNecesity> findAllAoN(Pageable page);
	
	@Query("SELECT aon FROM AnalysisOfNecesity aon WHERE username=:username")
	@Transactional(readOnly = true)
	AnalysisOfNecesity findAoNByUsername(String username);
	
	
	
	//void save(AnalysisOfNecesity aon);
}
