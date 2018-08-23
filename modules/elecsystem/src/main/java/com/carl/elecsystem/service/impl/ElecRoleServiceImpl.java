package com.carl.elecsystem.service.impl;

import com.carl.elecsystem.dao.ElecHelpMappper;
import com.carl.elecsystem.model.ElecRole;
import com.carl.elecsystem.service.ElecRoleService;
import com.carl.util.NotNullHelps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**	Created by chenzhuo_m on 2018/8/23. **/

@Service
public class ElecRoleServiceImpl implements ElecRoleService {

	@Autowired
	private ElecHelpMappper elecHelpMappper ;

	private String message ;

	@Override
	public ElecRole getRoleInfoById(Long id) {
		ElecRole elecRole = null ;
		if (NotNullHelps.isNotNull(id) == false) {
			message = "%% 参数缺失 @@";
		} else {
			elecRole = elecHelpMappper.findRoleById(id);
			message = "%% 查询角色--成功！ @@" ;
		}
		System.out.println(message);
		return elecRole ;
	}

}
