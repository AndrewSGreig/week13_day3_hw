package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {
	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findDistilleriesWithWhiskyAtAge(){
		Distillery macallan = new Distillery("Macallan", "Speyside");
		distilleryRepository.save(macallan);
		distilleryRepository.findAll().contains(macallan);
		List foundWhiskies = whiskyRepository.findByDistilleryAndAgeEquals(macallan, 25);
		System.out.println(foundWhiskies);
//		public void findDistilleriesWithWhiskiesAtAge(@PathVariable String distiller_age){
//
//		/distillery/age/{distillery_age}
	}
//	@Test
//	public void createNewDistillery(){
//		Distillery laphroaig = new Distillery("Laphroaig","Islay");
//		distilleryRepository.save(laphroaig);
////		String distilleryName = laphroaig.getName();
//		assertEquals("Laphroaig", laphroaig.getName());
//	}

}
