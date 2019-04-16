package com.universityofmurphy.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CourseCommand {
    private Long id;
    private String courseName;
    private Long startTime;
    private Long endTime;
    private Long startDate;
    private Long endDate;
}
