package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "news")
public class NewsEntity {
    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "news_id", columnDefinition = "VARCHAR(36)")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "news_title", columnDefinition = "TEXT")
    private String title;

    @Column(name = "news_sub_title", columnDefinition = "TEXT")
    private String subTitle;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "news_creator")
    private String creator;

    @Column(name = "news_image_preview_id",columnDefinition = "VARCHAR(36)")
    private UUID imagePreviewId;

    @Column(name = "type")
    private int type;

}
