/*
 * package com.moneylion.userservice.controller;
 * 
 * import static org.assertj.core.api.Assertions.assertThat;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.InjectMocks; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.RequestBuilder; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest(value = UserfeatureContoller.class) public class
 * UserfeatureContollerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @InjectMocks private UserfeatureContoller userfeatureContoller;
 * 
 * @Before public void init() { }
 * 
 * @Test public void testFeatureEndpoint() throws Exception {
 * 
 * RequestBuilder requestBuilder =
 * MockMvcRequestBuilders.get("/feature?email=user@dom.com&featureName=Remove")
 * .accept(MediaType.APPLICATION_JSON);
 * 
 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 * assertThat(result.getResponse().getStatus()).isEqualTo(200); } }
 */