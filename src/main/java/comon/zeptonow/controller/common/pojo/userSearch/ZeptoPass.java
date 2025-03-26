package comon.zeptonow.controller.common.pojo.userSearch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "passId",
    "isPassSelected",
    "membershipId",
    "isEnabled",
    "ptpBottomsheetViewedTimestamps",
    "isAutoAttachApplicable"
})
public class ZeptoPass {
  @JsonProperty("passId")
  public Object passId;
  @JsonProperty("isPassSelected")
  public Boolean isPassSelected;
  @JsonProperty("membershipId")
  public Object membershipId;
  @JsonProperty("isEnabled")
  public Boolean isEnabled;
  @JsonProperty("ptpBottomsheetViewedTimestamps")
  public List<Object> ptpBottomsheetViewedTimestamps;
  @JsonProperty("isAutoAttachApplicable")
  public Boolean isAutoAttachApplicable;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
