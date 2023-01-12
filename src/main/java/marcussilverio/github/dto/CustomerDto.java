package marcussilverio.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
  private Long id;
  @NotBlank(message = "name is required")
  private String name;
  @NotBlank(message = "phone is required")
  private String phone;
  @NotBlank(message = "email is required")
  private String email;
  @NotBlank(message = "address is required")
  private String address;
  @NotNull(message = "age is required")
  private Long age;

}