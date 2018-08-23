package com.carl.personal.service.impl;

import com.carl.personal.dao.PersonMapper;
import com.carl.personal.dao.PersonHelpMapper;
import com.carl.personal.model.Person;
import com.carl.personal.service.PersonService;
import com.carl.util.NotNullHelps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Created by chenzhuo_m on 2018/8/23. **/

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonHelpMapper personHelpMapper ;

	@Autowired
	private PersonMapper personMapper ;

	private String message ;

	@Override
	public Person getPersonInfoById(Long personId) {
		Person person = null ;
		if (NotNullHelps.isNotNull(personId) == false) {
			message = "$$ 参数缺失 @@";
		} else {
			Integer count = personMapper.countPerson();
			message = "%%  人员总人数 ： ## count :" + count;
			person = personHelpMapper.findPersonById(personId);
			if (NotNullHelps.isNotNull(person) == false) {
				message += " $$ 人员信息暂无！ @@";
			} else {
				message += " ** 查询成功！ ##" ;
			}
		}
		System.out.println("@@@@@@@@@@@ + " + message);
		return person ;
	}

	@Override
	public List<Person> listAllPerson() {
		List<Person> personList = personHelpMapper.listAllPerson();
		if (NotNullHelps.isNotNull(personList) == false) {
			message = "$$ 查询异常--暂无数据！ @@";
		} else {
			message = "&& 查询成功--用户数据 @@" ;
		}
		System.out.println(message);
		return personList ;
	}


}
