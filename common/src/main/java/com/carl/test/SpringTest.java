package com.carl.test;

import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**	Created by chenzhuo_m on 2018/8/23. **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-core.xml")
public class SpringTest {

	protected MockHttpServletRequest request = new MockHttpServletRequest();

	protected MockHttpServletResponse response = new MockHttpServletResponse();

	protected MockHttpSession session = new MockHttpSession();

}
