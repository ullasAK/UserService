/*
 * package com.moneylion.userservice.service;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.mockito.InjectMocks; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.*; import com.moneylion.userservice.model.UserFeature;
 * import com.moneylion.userservice.model.UserFeatureMap; import
 * com.moneylion.userservice.repository.IUserFeatureRepo; import
 * com.sun.xml.bind.v2.schemagen.xmlschema.Any;
 * 
 * public class UserFeatureServiceImplTest {
 * 
 * @Autowired UserFeatureServiceImpl userFeatureServiceImpl;
 * 
 * @Autowired IUserFeatureRepo userFeatureRepo;
 * 
 * @Before public void init() {
 * 
 * }
 * 
 * @Test public void checkSave() {
 * when(userFeatureRepo.save(any())).thenReturn(new UserFeature()); HttpStatus
 * res=userFeatureServiceImpl.updateFeature(new UserFeatureMap());
 * 
 * assertEquals(HttpStatus.OK, res); } }
 */