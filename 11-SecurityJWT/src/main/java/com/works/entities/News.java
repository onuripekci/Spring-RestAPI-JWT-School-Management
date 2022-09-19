package com.works.entities;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "detail", nullable = false, length = 500)
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}