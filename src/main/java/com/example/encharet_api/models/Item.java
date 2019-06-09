package com.example.encharet_api.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item_name;

    private String item_description;

    private int starting_price;

    private Date post_date;

    private String expiry_date;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "item")
    private List<Bid> bids;

    @PrePersist
    void savePostDate() {
        this.post_date = new Date();
    }

}
