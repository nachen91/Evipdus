package org.springframework.samples.evipdus.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.evipdus.model.AnalysisOfNecesity;
import org.springframework.samples.evipdus.repository.AnalysisOfNecesityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AnalysisOfNecesityService{
	
	
	private AnalysisOfNecesityRepository AoNRepository;
	
	public AnalysisOfNecesityService(final AnalysisOfNecesityRepository AoNRepository) {
		this.AoNRepository = AoNRepository;
	}
	
	public AnalysisOfNecesity findByIdAoN(final int id) throws DataAccessException{
		return this.AoNRepository.findByIdAoN(id);
	}
	
	public List<AnalysisOfNecesity> findAllAoN(final Pageable page) throws DataAccessException{
		return this.AoNRepository.findAllAoN(page);
	}
	
	public AnalysisOfNecesity findByUserId(final int id) throws DataAccessException{
		return this.AoNRepository.findAonByUserId(id);
	}
	

	
	
}
