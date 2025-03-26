package comon.zeptonow.controller.common.pojo.userSearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Example {

  @JsonProperty("query")
  public String query;
  @JsonProperty("pageNumber")
  public int pageNumber;
  @JsonProperty("userSessionId")
  public String userSessionId;
  @JsonProperty("mode")
  public String mode;
  @JsonProperty("filters")
  public Filters filters;
  @JsonProperty("filterId")
  public String filterId;
  @JsonProperty("intentId")
  public String intentId;
  @JsonProperty("layout")
  public List<Layout> layout;
}
