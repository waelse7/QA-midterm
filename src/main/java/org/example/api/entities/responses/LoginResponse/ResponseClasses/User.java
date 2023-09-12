package org.example.api.entities.responses.LoginResponse.ResponseClasses;

import java.util.List;

public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String token;
    private String user_id;
    private Object meta;
    private String store_id;
    private Object locale;
    private String identity_card;
    private Object accounting_card_id;
    private int business;
    private Object birth_date;
    private Object phone;
    private Object additional_phone;
    private Object sex_id;
    private Object edit_order;
    private int send_email;
    private int send_sms;
    private String subscribe_at;
    private String subscribe_ip;
    private String club_accept_at;
    private String club_accept_ip;
    private int club_accept;
    private int send_club_database;
    private Object disabled_at;
    private Object activated_at;
    private Object deleted_at;
    private int area_id;
    private Object deactivated_at;
    private Object customer_id_club;
    private String name;
    private List<Object> orders;
    private List<Object> cards;
    private List<Object> addresses;
    private String popularProducts;
    private List<Object> features;
    private List<Object> coupons;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public Object getLocale() {
        return locale;
    }

    public void setLocale(Object locale) {
        this.locale = locale;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public Object getAccounting_card_id() {
        return accounting_card_id;
    }

    public void setAccounting_card_id(Object accounting_card_id) {
        this.accounting_card_id = accounting_card_id;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public Object getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Object birth_date) {
        this.birth_date = birth_date;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getAdditional_phone() {
        return additional_phone;
    }

    public void setAdditional_phone(Object additional_phone) {
        this.additional_phone = additional_phone;
    }

    public Object getSex_id() {
        return sex_id;
    }

    public void setSex_id(Object sex_id) {
        this.sex_id = sex_id;
    }

    public Object getEdit_order() {
        return edit_order;
    }

    public void setEdit_order(Object edit_order) {
        this.edit_order = edit_order;
    }

    public int getSend_email() {
        return send_email;
    }

    public void setSend_email(int send_email) {
        this.send_email = send_email;
    }

    public int getSend_sms() {
        return send_sms;
    }

    public void setSend_sms(int send_sms) {
        this.send_sms = send_sms;
    }

    public String getSubscribe_at() {
        return subscribe_at;
    }

    public void setSubscribe_at(String subscribe_at) {
        this.subscribe_at = subscribe_at;
    }

    public String getSubscribe_ip() {
        return subscribe_ip;
    }

    public void setSubscribe_ip(String subscribe_ip) {
        this.subscribe_ip = subscribe_ip;
    }

    public String getClub_accept_at() {
        return club_accept_at;
    }

    public void setClub_accept_at(String club_accept_at) {
        this.club_accept_at = club_accept_at;
    }

    public String getClub_accept_ip() {
        return club_accept_ip;
    }

    public void setClub_accept_ip(String club_accept_ip) {
        this.club_accept_ip = club_accept_ip;
    }

    public int getClub_accept() {
        return club_accept;
    }

    public void setClub_accept(int club_accept) {
        this.club_accept = club_accept;
    }

    public int getSend_club_database() {
        return send_club_database;
    }

    public void setSend_club_database(int send_club_database) {
        this.send_club_database = send_club_database;
    }

    public Object getDisabled_at() {
        return disabled_at;
    }

    public void setDisabled_at(Object disabled_at) {
        this.disabled_at = disabled_at;
    }

    public Object getActivated_at() {
        return activated_at;
    }

    public void setActivated_at(Object activated_at) {
        this.activated_at = activated_at;
    }

    public Object getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public Object getDeactivated_at() {
        return deactivated_at;
    }

    public void setDeactivated_at(Object deactivated_at) {
        this.deactivated_at = deactivated_at;
    }

    public Object getCustomer_id_club() {
        return customer_id_club;
    }

    public void setCustomer_id_club(Object customer_id_club) {
        this.customer_id_club = customer_id_club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOrders() {
        return orders;
    }

    public void setOrders(List<Object> orders) {
        this.orders = orders;
    }

    public List<Object> getCards() {
        return cards;
    }

    public void setCards(List<Object> cards) {
        this.cards = cards;
    }

    public List<Object> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Object> addresses) {
        this.addresses = addresses;
    }

    public String getPopularProducts() {
        return popularProducts;
    }

    public void setPopularProducts(String popularProducts) {
        this.popularProducts = popularProducts;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    public List<Object> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Object> coupons) {
        this.coupons = coupons;
    }

    public User(int id, String first_name, String last_name, String email, String token, String user_id, Object meta, String store_id, Object locale, String identity_card, Object accounting_card_id, int business, Object birth_date, Object phone, Object additional_phone, Object sex_id, Object edit_order, int send_email, int send_sms, String subscribe_at, String subscribe_ip, String club_accept_at, String club_accept_ip, int club_accept, int send_club_database, Object disabled_at, Object activated_at, Object deleted_at, int area_id, Object deactivated_at, Object customer_id_club, String name, List<Object> orders, List<Object> cards, List<Object> addresses, String popularProducts, List<Object> features, List<Object> coupons) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.token = token;
        this.user_id = user_id;
        this.meta = meta;
        this.store_id = store_id;
        this.locale = locale;
        this.identity_card = identity_card;
        this.accounting_card_id = accounting_card_id;
        this.business = business;
        this.birth_date = birth_date;
        this.phone = phone;
        this.additional_phone = additional_phone;
        this.sex_id = sex_id;
        this.edit_order = edit_order;
        this.send_email = send_email;
        this.send_sms = send_sms;
        this.subscribe_at = subscribe_at;
        this.subscribe_ip = subscribe_ip;
        this.club_accept_at = club_accept_at;
        this.club_accept_ip = club_accept_ip;
        this.club_accept = club_accept;
        this.send_club_database = send_club_database;
        this.disabled_at = disabled_at;
        this.activated_at = activated_at;
        this.deleted_at = deleted_at;
        this.area_id = area_id;
        this.deactivated_at = deactivated_at;
        this.customer_id_club = customer_id_club;
        this.name = name;
        this.orders = orders;
        this.cards = cards;
        this.addresses = addresses;
        this.popularProducts = popularProducts;
        this.features = features;
        this.coupons = coupons;


    }
}
