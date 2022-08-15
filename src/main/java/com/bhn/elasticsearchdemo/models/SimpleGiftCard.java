package com.bhn.elasticsearchdemo.models;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "simplegiftcardindex")
public class SimpleGiftCard {

    //@Id
    private String id;

    @Field(type = FieldType.Text, name = "dist")
    private String dist;

    @Field(type = FieldType.Text, name = "owner")
    private String owner;

    @Field(type = FieldType.Text, name = "message")
    private String message;

    @Field(type = FieldType.Date, name = "date")
    private Date date;

    @Field(type = FieldType.Double, name = "amnt")
    private double amnt;

    @Field(type = FieldType.Boolean, name = "status")
    private boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDist() {
        return dist;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmnt() {
        return amnt;
    }

    public void setAmnt(double amnt) {
        this.amnt = amnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
