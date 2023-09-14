package org.example.api.entities.responses.LoginResponse.AddToCartResponse;



public class Meta {

    @JsonProperty("ct")
    private int ct;
    @JsonProperty("ms")
    private double ms;
    @JsonProperty("cs")
    private int cs;


    public void setCt(int ct) {
        this.ct = ct;
    }
    public int getCt() {
        return ct;
    }
    
    public void setMs(double ms) {
        this.ms = ms;
    }
    public double getMs() {
        return ms;
    }
    
    public void setCs(int cs) {
        this.cs = cs;
    }
    public int getCs() {
        return cs;
    }

    public Meta(int ct, double ms, int cs) {
        this.ct = ct;
        this.ms = ms;
        this.cs = cs;
    }

    public Meta() {
    }

    @Override
    public String toString() {
        return "Meta{" +
                "ct=" + ct +
                ", ms=" + ms +
                ", cs=" + cs +
                '}';
    }
}