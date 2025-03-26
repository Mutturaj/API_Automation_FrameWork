package com.zepto.automation.services.UserserachSeravices.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zepto.automation.services.UserserachSeravices.DataProvider.SearchData;
import com.zepto.automation.services.UserserachSeravices.UserSearchBaseTest;
import com.zepto.automation.services.UserserachSeravices.Validators.SearchServicesValidator;
import comon.zeptonow.controller.servicehelper.UserSearchServiceHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserSearchTest extends UserSearchBaseTest {

 // UserSearchServiceHelper searchHelper = new UserSearchServiceHelper();

  @Severity(SeverityLevel.CRITICAL)
  @Description("Validating the search response")
  @Story("Search API Testing")
  @Owner("Mutturaj")
  @Test(dataProvider = "searchQueries", dataProviderClass = SearchData.class)
  public void testUserSearch(String query) {
    Response response = userSearchServiceHelper.searchUser(query);
    SearchServicesValidator.validateSearchResponse(response);

  }

  @Severity(SeverityLevel.BLOCKER)
  @Description("Validating the Widget ID in response")
  @Story("Search Widget Validation")
  @Owner("Mutturaj")
  @Test(dataProvider = "queries", dataProviderClass = SearchData.class)
  public void SerachService(String query, String actualWidgetName,String tenant) throws JsonProcessingException {
    Response response = userSearchServiceHelper.SearchQueryRequest(query,tenant);
    SearchServicesValidator.validateWidget(response, actualWidgetName);
  }
}