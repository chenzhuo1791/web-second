package com.carl.personal.testService;

import com.carl.elecsystem.dao.ElecSystemMapper;
import com.carl.personal.controller.PersonController;
import com.carl.personal.model.Person;
import com.carl.personal.service.PersonService;
import com.carl.test.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** Created by chenzhuo_m on 2018/8/23. **/

public class TestAPersonService extends SpringTest {

	@Autowired
	private PersonController personController ;

	@Autowired
	private PersonService personService ;


	@Autowired
	private ElecSystemMapper elecSystemMapper ;

//  3	 ===========================================================================================
	@Test
	public void testC() throws Exception {

		System.out.println("\n\n");
	}

//  2	 ===========================================================================================
	@Test
	public void testBselectUser() throws Exception {
		Person person = personController.selectUser(3L);
		System.out.println("$$$$$ " + person);
		System.out.println("\n\n");
	}

//  1	 ===========================================================================================
	@Test
	public void testAcount() throws Exception {
		Long personId = 2L ;
		Person person = personService.getPersonInfoById(personId);
		System.out.println(person);
		System.out.println("\n\n");
		System.out.println("## elecSystemMapper :" + elecSystemMapper);
		Integer number = elecSystemMapper.countRole() ;
		System.out.println(" number : " + number);
		System.out.println("\n\n");
	}

//  0	 ===========================================================================================
	@Test
	public void test() throws Exception {
		System.out.println();
	}

//  ===========================================================================================
	@Test
	public void testInit() throws Exception {
		System.out.println();
	}



}
