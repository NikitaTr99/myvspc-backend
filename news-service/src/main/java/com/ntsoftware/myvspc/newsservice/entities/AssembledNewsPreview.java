package com.ntsoftware.myvspc.newsservice.entities;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
public class AssembledNewsPreview {
    private UUID newsId;
    private String title;
    private String subTitle;
    private Timestamp date;
    private String creator;
    private int type;
    private String typeName;
    private UUID imageId;
}
