package com.carl.personal.controller;

import com.carl.personal.model.Person;
import com.carl.personal.service.PersonService;
import com.carl.util.NotNullHelps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**	Created by chenzhuo_m on 2018/8/23. **/

@Controller
public class PersonController {

	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonService personService ;

	private String message ;

	@ResponseBody
	@RequestMapping("/person/{id}/info")
	public Person selectUser(@PathVariable Long id){
		Person person = personService.getPersonInfoById(id);
		if (NotNullHelps.isNotNull(person) == false) {
			message = "%% 数据查询异常！ @@";
		} else {
			message = "## 查询人员信息成功！ @@" ;
		}
		logger.info(message);
		return person ;
	}


	@ResponseBody
	@RequestMapping("/allPerson")
	public List<Person> listAllPerson(){
		List<Person> personList = personService.listAllPerson();
		if (NotNullHelps.isNotNull(personList) == false) {
			message = "%% 数据查询异常！ @@";
		} else {
			message = "## 人员列表查询成功！ @@" ;
		}
		logger.info(message);
		return personList ;
	}




}
