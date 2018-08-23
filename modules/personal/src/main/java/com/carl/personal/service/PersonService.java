package com.carl.personal.service;

import com.carl.personal.model.Person;

import java.util.List;

/**	Created by chenzhuo_m on 2018/8/23. **/

public interface PersonService {


	Person getPersonInfoById(Long personId);


	List<Person> listAllPerson();

}
