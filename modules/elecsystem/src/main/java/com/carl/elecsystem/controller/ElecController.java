package com.carl.elecsystem.controller;

import com.carl.elecsystem.model.ElecRole;
import com.carl.elecsystem.service.ElecRoleService;
import com.carl.util.NotNullHelps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**	Created by chenzhuo_m on 2018/8/23. **/

@Controller
@RequestMapping("/elec")
public class ElecController {

	private static final Logger logger = LoggerFactory.getLogger(ElecController.class);

	@Autowired
	private ElecRoleService elecRoleService ;

	private String message ;

	@ResponseBody
	@RequestMapping("/{id}/roleInfo")
	public ElecRole findElecRoleInfoById(@PathVariable Long id){
		ElecRole elecRole = elecRoleService.getRoleInfoById(id);
		if (NotNullHelps.isNotNull(elecRole) == false) {
			message = "## 异常--elec角色 @@";
		} else {
			message = "** elec角色 -- 查询成功  ##" ;
		}
		logger.info(message);
		return elecRole ;
	}


}
