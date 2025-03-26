package comon.zeptonow.controller.servicehelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import comon.zeptonow.controller.common.pojo.userSearch.CartRequestBody;
import comon.zeptonow.controller.common.pojo.userSearch.DeliveryInstructions;
import comon.zeptonow.controller.common.pojo.userSearch.Example;
import comon.zeptonow.controller.common.pojo.userSearch.OosProductMeta;
import comon.zeptonow.controller.common.pojo.userSearch.UserMeta;
import comon.zeptonow.controller.common.pojo.userSearch.ZeptoPass;
import java.util.Arrays;

public class RequsetBodyHelper {

  static ObjectMapper objectMapper = new ObjectMapper();

  public static String getCartRequestBody() throws JsonProcessingException {
    CartRequestBody cartRequestBody = CartRequestBody.builder()
        .storeId("9785ce3b-ca57-4033-af1e-46504def34d9")
        .latitude(18.9982461)
        .longitude(72.82696460000001)
        .deliveryInstructions(DeliveryInstructions.builder().leaveAtGate(false).build())
        .riderTip(0)
        .userMeta(UserMeta.builder().whatsappOpted("PENDING").build())
        .useZeptoCash(false)
        .zeptoPass(ZeptoPass.builder().isEnabled(false).build())
        .recommendedCouponId("147a9cd1-3bab-4d16-b28d-875e42898008")
        .oosProductMeta(Arrays.asList(
            OosProductMeta.builder()
                .storeProductId("5b718b33-6d2c-4996-9532-4f747ae70dd1")
                .quantity(1)
                .build()
        ))
        .build();

    // Convert to JSON
    return objectMapper.writeValueAsString(cartRequestBody);

  }

  public static String getReuesetbodyForSearch(String query) throws JsonProcessingException {
    Example serachRequsetBody = Example.builder().mode("SHOW_ALL_RESULTS").query(query).intentId("4f955e4f-c3c3-442c-92dc-efcbf3832a27_5adec8e5-f3d4-45d5-9994-f862e9dfe1b1").pageNumber(1).build();
    return objectMapper.writeValueAsString(serachRequsetBody);
  }


}