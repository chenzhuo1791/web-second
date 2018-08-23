package com.carl.personal.dao;

import com.carl.personal.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**	Created by chenzhuo_m on 2018/8/23. **/
@Repository
public interface PersonHelpMapper {


	Person findPersonById(Long id);


	List<Person> listAllPerson();


}
