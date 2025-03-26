package comon.zeptonow.controller.common.pojo.userSearch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storeId",
    "cartProducts",
    "latitude",
    "longitude",
    "deliveryInstructions",
    "riderTip",
    "userMeta",
    "use_zepto_cash",
    "zeptoPass",
    "recommendedCouponId",
    "oosProductMeta"
})
public class CartRequestBody {
  @JsonProperty("storeId")
  public String storeId;
  @JsonProperty("cartProducts")
  public List<Object> cartProducts;
  @JsonProperty("latitude")
  public Double latitude;
  @JsonProperty("longitude")
  public Double longitude;
  @JsonProperty("deliveryInstructions")
  public DeliveryInstructions deliveryInstructions;
  @JsonProperty("riderTip")
  public Integer riderTip;
  @JsonProperty("userMeta")
  public UserMeta userMeta;
  @JsonProperty("use_zepto_cash")
  public Boolean useZeptoCash;
  @JsonProperty("zeptoPass")
  public ZeptoPass zeptoPass;
  @JsonProperty("recommendedCouponId")
  public String recommendedCouponId;
  @JsonProperty("oosProductMeta")
  public List<OosProductMeta> oosProductMeta;

}
