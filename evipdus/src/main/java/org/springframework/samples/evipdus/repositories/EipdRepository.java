package org.springframework.samples.evipdus.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.evipdus.model.Eipd;
import org.springframework.transaction.annotation.Transactional;

public interface EipdRepository extends PagingAndSortingRepository<Eipd, Integer> {

	
	@Query("SELECT eipd FROM Eipd eipd")
	@Transactional(readOnly = true)
	List<Eipd> findAllEipd(Pageable page);
	
	@Query("SELECT eipd FROM Eipd eipd WHERE id=:id")
	@Transactional(readOnly = true)
	Eipd findEipdById(@Param("id") Integer id);
	
	
	@Query("SELECT eipd FROM Eipd eipd WHERE eipd.user.id=:id")
	@Transactional(readOnly = true)
	Eipd findEipdByUserId(@Param("id") Integer id);
	
	//void save(AnalysisOfNecesity aon);
}
