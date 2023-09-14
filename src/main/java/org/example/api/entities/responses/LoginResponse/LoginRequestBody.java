package org.example.api.entities.responses.LoginResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequestBody {
    @JsonProperty("id_delivery_times")
    String id_delivery_times;
    @JsonProperty("username")
    String username;
    @JsonProperty("password")
    String password;

    @JsonProperty("restore_account")
    boolean restore_account;

    public LoginRequestBody(String id_delivery_times, String username, String password, boolean restore_account) {
        this.id_delivery_times = id_delivery_times;
        this.username = username;
        this.password = password;
        this.restore_account = restore_account;
    }

    public LoginRequestBody(String username, String password) {
        this.username = username;
        this.password = password;
        this.id_delivery_times = null;
        this.restore_account = false;

    }

    public LoginRequestBody() {
    }

    public String getId_delivery_times() {
        return id_delivery_times;
    }

    public void setId_delivery_times(String id_delivery_times) {
        this.id_delivery_times = id_delivery_times;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRestore_account() {
        return restore_account;
    }

    public void setRestore_account(boolean restore_account) {
        this.restore_account = restore_account;
    }

    @Override
    public String toString() {
        return "RB{" +
                "id_delivery_times='" + id_delivery_times + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", restore_account=" + restore_account +
                '}';
    }
}

