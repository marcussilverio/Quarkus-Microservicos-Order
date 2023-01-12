package marcussilverio.github.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import marcussilverio.github.entity.OrderEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderRepository implements PanacheRepository <OrderEntity> {}
