package marcussilverio.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import marcussilverio.github.entity.OrderEntity;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

  private Long customerId;
  private String customerName;
  private Long productId;
  private BigDecimal orderValue;

  public OrderDto (OrderEntity e) {
    this.customerId = e.getCustomerId();
    this.customerName = e.getCustomerName();
    this.productId = e.getProductId();
    this.orderValue = e.getOrderValue();
  }
}
