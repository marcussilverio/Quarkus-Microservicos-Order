package marcussilverio.github.service;

import marcussilverio.github.client.CustomerClient;
import marcussilverio.github.client.ProductClient;
import marcussilverio.github.dto.CustomerDto;
import marcussilverio.github.dto.OrderDto;
import marcussilverio.github.entity.OrderEntity;
import marcussilverio.github.repository.OrderRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class OrderService {
  @Inject
  private OrderRepository repository;
  @Inject
  @RestClient
  private CustomerClient customerClient;
  @Inject
  @RestClient
  private ProductClient productClient;

  public List<OrderDto> getAllOrders(){
    return repository.findAll().stream().map(OrderDto::new).collect(Collectors.toList());
  }
  public void saveNewOrder(OrderDto orderDto){
    CustomerDto customerDto = customerClient.getCustomerById(orderDto.getCustomerId());
    if(customerDto.getName().equals(orderDto.getCustomerName())
      && productClient.getProductById(orderDto.getProductId()) != null){
      repository.persist(new OrderEntity(orderDto));
    }else{
      throw new NotFoundException();
    }
  }
}
