package com.vtorres.projetospring.config;


import com.vtorres.projetospring.entities.Order;
import com.vtorres.projetospring.entities.OrderItem;
import com.vtorres.projetospring.entities.User;
import com.vtorres.projetospring.repositories.OrderItemRepository;
import com.vtorres.projetospring.repositories.OrderRepository;
import com.vtorres.projetospring.repositories.UserRepository;
import org.aspectj.bridge.context.CompilationAndWeavingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        //User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        //User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        //Order 01 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        // 02 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        //Order 03 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        //userRepository.saveAll(Arrays.asList(u1, u2));
        //orderRepository.saveAll()

    }
}
