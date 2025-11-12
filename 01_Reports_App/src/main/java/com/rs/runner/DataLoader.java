package com.rs.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.CitizenPlan;
import com.rs.repo.CitizenPlanRepository;
@Component
public class DataLoader implements ApplicationRunner{
	@Autowired
    private CitizenPlanRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//cash plan data 
		  if(repo.count() == 0) {
	CitizenPlan c1=new CitizenPlan();
	c1.setCitizenName("Rahul");
	c1.setGender("Male");
	c1.setPlanName("Cash");
	c1.setPlanStatus("Approved");
	c1.setPlanStartDate(LocalDate.now());
	c1.setPlanEndDate(LocalDate.now().plusMonths(6));
	c1.setBenefitAmt(5000.0);
	//denied plan data
	CitizenPlan c2=new CitizenPlan();
	c2.setCitizenName("Ritik");
	c2.setGender("Male");
	c2.setPlanName("Cash");
	c2.setPlanStatus("Denied");
	c2.setDenialReason("Rent Income");
	//
	CitizenPlan c3=new CitizenPlan();
	c3.setCitizenName("Smriti");
	c3.setGender("Female");
	c3.setPlanName("Cash");
	c3.setPlanStatus("Terminated");
	c3.setPlanStartDate(LocalDate.now().minusMonths(4));
	c3.setPlanEndDate(LocalDate.now().plusMonths(6));
	c3.setBenefitAmt(5000.0);
	c3.setTerminationDate(LocalDate.now());
	c3.setTerminationRsn("Employed");
	//medical data
	CitizenPlan c4=new CitizenPlan();
	c4.setCitizenName("Samy");
	c4.setGender("Female");
	c4.setPlanName("Medical");
	c4.setPlanStatus("Terminated");
	c4.setPlanStartDate(LocalDate.now().minusMonths(4));
	c4.setPlanEndDate(LocalDate.now().plusMonths(6));
	c4.setBenefitAmt(5000.0);
	c4.setTerminationDate(LocalDate.now());
	c4.setTerminationRsn("Employed");
	//food plan data
	CitizenPlan c5=new CitizenPlan();
	c5.setCitizenName("Prateek");
	c5.setGender("Male");
	c5.setPlanName("Food");
	c5.setPlanStatus("Approved");
	c5.setPlanStartDate(LocalDate.now());
	c5.setPlanEndDate(LocalDate.now().plusMonths(6));
	c5.setBenefitAmt(4000.0);
	//denied plan data
	CitizenPlan c6=new CitizenPlan();
	c6.setCitizenName("Rohan");
	c6.setGender("Male");
	c6.setPlanName("Food");
	c6.setPlanStatus("Denied");
	c6.setDenialReason("Property Income");
	
	List<CitizenPlan> list= Arrays.asList(c1,c2,c3,c4,c5,c6);
	repo.saveAll(list);
	
	}
	}
}
