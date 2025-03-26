package com.zepto.automation.services.UserserachSeravices.Services;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.zepto.automation.services.UserserachSeravices.Validators.CartValidator;
import comon.zeptonow.controller.servicehelper.CartServiceHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class CartServiceTest {
  CartServiceHelper cartServiceHelper = new CartServiceHelper();
  @Severity(SeverityLevel.BLOCKER)
  @Description("Add to cart")
  @Owner("Mutturaj")
  @Test()
  public void testCartService() throws JsonProcessingException {
    Response response = cartServiceHelper.addToCart();
    CartValidator.CartSatusCode(response);

  }
}