package com.driving.license.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import com.driving.license.repository.CandidateRepository;
import com.driving.license.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {
	private static final Logger logger=LoggerFactory.getLogger(CandidateServiceImpl.class);

	
	  @Autowired
	  private CandidateRepository candidateRepository;
	 
	  // Implementing the service interface method here
	@Override
	public String insertCandidateDetails(com.driving.license.model.CandidateDetails candidateDetails) {
		logger.info("Candidate details in Service layer :"+candidateDetails);
		
		candidateRepository.save(candidateDetails);
		return "Candidate data is successfully inserted";
	}

}
