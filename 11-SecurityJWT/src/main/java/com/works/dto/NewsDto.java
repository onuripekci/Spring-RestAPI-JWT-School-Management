package com.works.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NewsDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String detail;

}