package com.zepto.automation.services.UserserachSeravices;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zepto.automation.services.UserserachSeravices.DataProvider.SearchData;
import com.zepto.automation.services.UserserachSeravices.Validators.CartValidator;
import com.zepto.automation.services.UserserachSeravices.Validators.SearchServicesValidator;
import comon.zeptonow.controller.servicehelper.CartServiceHelper;
import comon.zeptonow.controller.servicehelper.UserSearchServiceHelper;
import comon.zeptonow.controller.utility.HeaderManager;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class UserSearchBaseTest {

  @BeforeClass
  public void setup() {
    RestAssured.baseURI = "https://api.zepto.com";
  }

  protected UserSearchServiceHelper userSearchServiceHelper;
  protected CartServiceHelper cartServiceHelper;
  protected ObjectMapper objectMapper;
  protected HeaderManager headerManager;
  protected SearchData searchData;
  protected CartValidator cartValidator;
  protected SearchServicesValidator searchServicesValidator;

  public UserSearchBaseTest() {
    userSearchServiceHelper=new UserSearchServiceHelper();
    cartServiceHelper=new CartServiceHelper();
    headerManager=new HeaderManager();
    objectMapper=new ObjectMapper();
    searchData=new SearchData();
    cartValidator=new CartValidator();
    searchServicesValidator=new SearchServicesValidator();

  }
}
