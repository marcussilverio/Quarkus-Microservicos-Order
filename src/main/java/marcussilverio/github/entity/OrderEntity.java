package marcussilverio.github.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import marcussilverio.github.dto.OrderDto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orderProducts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long customerId;
  private String customerName;
  private Long productId;
  private BigDecimal orderValue;

  public OrderEntity (OrderDto dto) {
    this.customerId = dto.getCustomerId();
    this.customerName = dto.getCustomerName();
    this.productId = dto.getProductId();
    this.orderValue = dto.getOrderValue();
  }
}
