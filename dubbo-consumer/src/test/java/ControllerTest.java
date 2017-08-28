//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//import com.consumer.controller.UserController;
//
//
//
//@ContextConfiguration({"classpath*:/application.xml","classpath*:/dubbo-user.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
//public class ControllerTest {
//
//	private MockHttpServletRequest request;
//	private MockHttpServletResponse response;
//	
//	@Autowired
//	private UserController uc;
//	
//	
//	@Before
//	public void doBefore(){
//		request = new MockHttpServletRequest();
//		request.setCharacterEncoding("UTF-8");
//		response = new MockHttpServletResponse();
//	}
//	
//	@Test
//	public void myTest1() throws Exception{
//		try {
//			uc.queryUser("xxx");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
