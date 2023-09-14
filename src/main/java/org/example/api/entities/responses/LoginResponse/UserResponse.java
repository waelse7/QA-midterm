package org.example.api.entities.responses.LoginResponse;

import org.example.api.entities.responses.LoginResponse.ResponseClasses.Cart;
import org.example.api.entities.responses.LoginResponse.ResponseClasses.DeliveryTimesCustomer;
import org.example.api.entities.responses.LoginResponse.ResponseClasses.User;

import java.util.List;

public class UserResponse {
    private User user;
    private DeliveryTimesCustomer deliveryTimesCustomer;
    private List<Object> orderTokens;
    private Object order;
    private Cart cart;
    private List<Object> shopLists;

    public UserResponse(User user, DeliveryTimesCustomer deliveryTimesCustomer, List<Object> orderTokens, Object order, Cart cart, List<Object> shopLists) {
        this.user = user;
        this.deliveryTimesCustomer = deliveryTimesCustomer;
        this.orderTokens = orderTokens;
        this.order = order;
        this.cart = cart;
        this.shopLists = shopLists;
    }

    public UserResponse() {
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "user=" + user +
                ", deliveryTimesCustomer=" + deliveryTimesCustomer +
                ", orderTokens=" + orderTokens +
                ", order=" + order +
                ", cart=" + cart +
                ", shopLists=" + shopLists +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DeliveryTimesCustomer getDeliveryTimesCustomer() {
        return deliveryTimesCustomer;
    }

    public void setDeliveryTimesCustomer(DeliveryTimesCustomer deliveryTimesCustomer) {
        this.deliveryTimesCustomer = deliveryTimesCustomer;
    }

    public List<Object> getOrderTokens() {
        return orderTokens;
    }

    public void setOrderTokens(List<Object> orderTokens) {
        this.orderTokens = orderTokens;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Object> getShopLists() {
        return shopLists;
    }

    public void setShopLists(List<Object> shopLists) {
        this.shopLists = shopLists;
    }
}
