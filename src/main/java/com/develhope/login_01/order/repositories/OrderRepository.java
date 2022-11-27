package com.develhope.login_01.order.repositories;

import com.develhope.login_01.entities.User;
import com.develhope.login_01.order.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCreatedBy(User user);

    Object findByRestaurant(User user);

    Object findByRider(User user);

}
