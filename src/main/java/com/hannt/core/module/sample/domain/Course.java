package com.hannt.core.module.sample.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;
    private int fee;

    @Builder
    public Course(String title, Date beginDate, Date endDate, int fee) {
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.fee = fee;
    }
}
