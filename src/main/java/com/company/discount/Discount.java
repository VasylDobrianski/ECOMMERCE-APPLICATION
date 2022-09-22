package com.company.discount;

import com.company.Cart;

import java.util.UUID;

public abstract class Discount {

    private UUID Id;
    private String name;
    private Double thresholdAmount;


    public Discount(UUID Id, String name, Double thresholdAmount) {
        this.Id = Id;
        this.name = name;
        this.thresholdAmount = thresholdAmount;
    }

    public boolean decideDiscountIsApplicableToCart(Cart cart){
        return cart.calculateCartTotalAmount() > thresholdAmount;

    }

    public abstract Double calculateCartAmountAfterDiscountApplied(Double amount);

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Double getThresholdAmount() {
        return thresholdAmount;
    }
}
