package marcussilverio.github.controller;

import marcussilverio.github.dto.OrderDto;
import marcussilverio.github.service.OrderService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("api/orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderController {
  @Inject
  private OrderService service;

  @GET
  public List<OrderDto> getAllOrders(){
    return service.getAllOrders();
  }
  @POST
  @Transactional
  public Response saveNewOrder(OrderDto order){
    try{
      service.saveNewOrder(order);
      return Response.ok().build();
    }catch (Exception err){
      err.printStackTrace();
      return Response.serverError().build();
    }
  }

}
