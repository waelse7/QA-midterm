package org.example.api.entities.requests;

public class SearchRequestBody {
    private int aggs;
    private String q;
    private String store;

    public SearchRequestBody(int aggs, String q, String store) {
        this.aggs = aggs;
        this.q = q;
        this.store = store;
    }

    public int getAggs() {
        return aggs;
    }

    public void setAggs(int aggs) {
        this.aggs = aggs;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
    @Override
    public String toString() {
        return "SearchRequestBody{" +
                "aggs=" + aggs +
                ", q='" + q + '\'' +
                ", store='" + store + '\'' +
                '}';
    }
}
