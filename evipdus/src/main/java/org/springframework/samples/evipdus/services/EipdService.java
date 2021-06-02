package org.springframework.samples.evipdus.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.evipdus.model.Eipd;
import org.springframework.samples.evipdus.repositories.EipdRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class EipdService {

	private EipdRepository eipdRepository;
	
	
	public List<Eipd> findAllUser(final Pageable page) throws DataAccessException{
		return this.eipdRepository.findAllEipd(page);
	}
	
	public Eipd findEipdById(final int id) throws DataAccessException{
		return this.eipdRepository.findEipdById(id);
	}
	
	public Eipd findByUserId(final int id) throws DataAccessException{
		return this.eipdRepository.findEipdByUserId(id);
	}
	public void saveEipd(final Eipd eipd) throws DataAccessException{
		this.eipdRepository.save(eipd);
	}
	
	public void deleteUser(final Eipd eipd) throws DataAccessException{
		
		this.eipdRepository.delete(eipd);
	}
}
