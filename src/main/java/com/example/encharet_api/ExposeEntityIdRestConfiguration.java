package com.example.encharet_api;

import com.example.encharet_api.models.Bid;
import com.example.encharet_api.models.Item;
import com.example.encharet_api.models.Role;
import com.example.encharet_api.models.User;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Item.class, Bid.class, User.class, Role.class);
    }
}
