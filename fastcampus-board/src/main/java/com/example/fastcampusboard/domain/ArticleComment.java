package com.example.fastcampusboard.domain;

import java.time.LocalDate;

public class ArticleComment {
    private Long id;
    private Article article;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
