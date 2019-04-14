package co.overlead.module;

import java.util.Date;
import java.util.UUID;

public class PayTransaction {

    private String id;

    private Date time;
    private Long cost;


    public PayTransaction(Long cost) {
        this.cost = cost;
        this.id= UUID.randomUUID().toString();
        this.time= new Date();
    }

    public void setId() {
        this.id =UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }


    public Long getCost() {
        return cost;
    }

}
