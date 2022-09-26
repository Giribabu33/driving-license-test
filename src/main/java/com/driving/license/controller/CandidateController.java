package com.driving.license.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.driving.license.model.CandidateDetails;
import com.driving.license.service.CandidateService;

@RestController
public class CandidateController  {
	
	private static final Logger logger = LoggerFactory.getLogger(CandidateController.class);
	
	@Autowired
	private CandidateService candidateService;
	
	/**
	 * This method user to Create the data
	 * @param cd
	 * @return response
	 */
	@PostMapping("/driving-license")
	public String addCandidateDetails(@RequestBody CandidateDetails cd) {
		
		logger.info("Candidate original details are :" +cd);
		String response = "Congratualations "+ cd.getCandidateName() + " Verified your SSC and DOB Details.So you can apply your driving license at "+cd.getCandidateLocation();
		return response;
		
	}
	
/**
 * get the driving license based on pincode by using pathvariable
 * param pincode
 * @return response
 */
	@GetMapping("/get-driving-license/{pincode}")
	public String getDrivingLicense(@PathVariable int pincode) {
		logger.info("Pincode is :" +pincode);
		String response="My Pincode is :" +pincode;
		return response;
	}
	/**
	 * This method user to get  the data by using RequestParam
	 * @param pincode
	 * @return response
	 */
	
	@GetMapping("/get-driving-license")
	public String getDrivingLicense1(@RequestParam int pincode) {
	
	  logger.info("Pincode is :" +pincode);
	String response = "Pincode is :"+pincode;
	return response;
	}
	/**
	 * This method user to  update the data by pincode
	 * @param cd
	 * @param pincode
	 * @return response
	 */
	
	@PutMapping("/update-driving-license")
	public String updateDrivingLicenseByPincode(@RequestBody CandidateDetails cd, @RequestParam int pincode ) {
		logger.info("CandidateDetails : "+cd);
		logger.info("Pincode :"+pincode);
		
		String response="Candidate details are successfully updated with pincode : "+pincode;
		return response;
	}
	/**
	 * This method user to delete the data based on pincode details
	 * @param pincode
	 * @return response
	 */
	
	@DeleteMapping("/delete-driving-license")
	public String deleteDrivingLicenseByPincode(@RequestParam int pincode ) {
		logger.info("Pincode :"+pincode);
		String response="Data deleted by pincode= "+pincode;
		return response;
	}
	/**
	 * This method user to partially update the data
	 * @param candidateLocation
	 * @return response
	 */
	
	@PatchMapping("/partial-update-driving-license/{candidateLocation}")
	public String partialUpdateByCandidateLocation(@PathVariable String candidateLocation) {
		logger.info("Candidate Location is ::" +candidateLocation);
		String response = "Candidate location is successfully updated "+candidateLocation;
		return response;
	}
	
	/**
	 * We are calling the method(insertCandidateDetails) which is created in the Service interface
	 * @param candidateDetails
	 * @return response
	 */
	@PostMapping("/add-driving-license")
	public String insertCricketereDetails(@RequestBody CandidateDetails candidateDetails) {
		logger.info("Candidate Details in controller layer :"+candidateDetails);
		String response=candidateService.insertCandidateDetails(candidateDetails);
		return response;
	}

}

















