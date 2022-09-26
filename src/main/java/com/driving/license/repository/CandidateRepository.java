package com.driving.license.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driving.license.model.CandidateDetails;

  @Repository 
  public interface CandidateRepository extends JpaRepository<CandidateDetails,Integer> {
	  
	  //public void save(CandidateDetails candidateDetails);
	  
  
	  
  }
 