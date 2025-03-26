package comon.zeptonow.controller.common.pojo.userSearch;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "leaveAtGate",
    "additionalNote",
    "doNotRingBell",
    "bewareOfPets",
    "returnPaperBag",
    "leaveWithSecurity",
    "returnCokePetBottle"
})

public class DeliveryInstructions {

  @JsonProperty("leaveAtGate")
  public Boolean leaveAtGate;
  @JsonProperty("additionalNote")
  public String additionalNote;
  @JsonProperty("doNotRingBell")
  public Boolean doNotRingBell;
  @JsonProperty("bewareOfPets")
  public Boolean bewareOfPets;
  @JsonProperty("returnPaperBag")
  public Boolean returnPaperBag;
  @JsonProperty("leaveWithSecurity")
  public Boolean leaveWithSecurity;
  @JsonProperty("returnCokePetBottle")
  public Boolean returnCokePetBottle;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}