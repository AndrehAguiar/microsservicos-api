package one.digital.innovation.shoppingcart.repository;

import one.digital.innovation.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
