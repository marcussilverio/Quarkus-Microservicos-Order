package marcussilverio.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
  private Long id;
  @NotBlank(message = "name is required")
  private String name;
  @NotBlank(message = "description is required")
  private String description;
  @NotBlank(message = "category is required")
  private String category;
  @NotBlank(message = "model is required")
  private String model;
  @NotNull(message = "price is required")
  private BigDecimal price;
}
