package com.zepto.automation.services.UserserachSeravices.DataProvider;

import org.testng.annotations.DataProvider;

public class SearchData {

  @DataProvider(name = "searchQueries")
  public Object[][] searchQueries() {
    return new Object[][]{
        {"John Doe"},
        {"Jane Smith"},
        {"Test User"}
    };
  }

  @DataProvider(name = "queries")
  public Object[][] Typeofqueries() {
    return new Object[][]{
        {"dairy", "ANCHOR_TABS_WIDGET","ZEPTO"},
        {"milk", "PRODUCT_GRID","ZEPTO"}
    };
  }
}