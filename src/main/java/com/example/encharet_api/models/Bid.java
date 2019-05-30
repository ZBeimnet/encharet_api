package com.example.encharet_api.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int bid_amount;

    private Date bid_date;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    @PrePersist
    void saveBidDate() {
        this.bid_date = new Date();
    }
}
