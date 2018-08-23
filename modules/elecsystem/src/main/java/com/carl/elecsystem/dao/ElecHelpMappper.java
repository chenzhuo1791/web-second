package com.carl.elecsystem.dao;

import com.carl.elecsystem.model.ElecRole;
import org.springframework.stereotype.Repository;

/**	Created by chenzhuo_m on 2018/8/23. **/

@Repository
public interface ElecHelpMappper {

	ElecRole findRoleById(Long id);

}
