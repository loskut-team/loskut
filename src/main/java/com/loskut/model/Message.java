package com.loskut.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Entity
@Table(name="messages")
public class Message {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="auto_id_message",
            sequenceName="auto_id_message",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="auto_id_message")
    private int id;

    private String text;

    private String author;

    private String recipient;

    private String status;

    private Date date;

    public Message() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
