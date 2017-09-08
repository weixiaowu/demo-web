package cn.jyc.demo;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration(value = "src/main/webapp")   
@ContextHierarchy({  
        @ContextConfiguration(name = "parent", locations = {"classpath:conf/ApplicationContext-dao.xml", 
        		"classpath:conf/ApplicationContext-service.xml",
        		"classpath:conf/ApplicationContext-trans.xml"}),  
        @ContextConfiguration(name = "child", locations = "classpath:conf/SpringMvc.xml")  
}) 
public class WebAppConfigureBase {
	
	@Autowired  
    private WebApplicationContext wac;  
	
	private MockMvc mockMvc; 
	
    @Before  
    public void setUp() throws Exception {
    	mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); 
    }
    
	public WebApplicationContext getWac() {
		return wac;
	}

	public void setWac(WebApplicationContext wac) {
		this.wac = wac;
	}
	
	public MockMvc getMockMvc() {
		return mockMvc;
	}

	public void setMockMvc(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}
	
}