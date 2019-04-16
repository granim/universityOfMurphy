package com.universityofmurphy.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course extends BaseEntity {

   @OneToOne
   @JoinColumn(name = "teacher_id")
   private Teacher teacher;
   @ManyToOne
   @JoinColumn(name = "student_id")
   private Student student;
   @Column(name = "courseName")
   private String courseName;
   @Column(name = "startTime")
   private Long startTime;
   @Column(name = "endTime")
   private Long endTime;
   @Column(name = "startDate")
   private Long startDate;
   @Column(name = "endDate")
   private Long endDate;


   public Course (Student student, Long startTime, Long endTime, Long startDate, Long endDate, Teacher teacher){
      this.student = student;
      this.startTime = startTime;
      this.endTime = endTime;
      this.startDate = startDate;
      this.endDate = endDate;
      this.teacher = teacher;
   }


   public String getCourseName() {
      return courseName;
   }

   public void setCourseName(String courseName) {
      this.courseName = courseName;
   }

   public Long getStartTime() {
      return startTime;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public Long getEndTime() {
      return endTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public Long getStartDate() {
      return startDate;
   }

   public void setStartDate(Long startDate) {
      this.startDate = startDate;
   }

   public Long getEndDate() {
      return endDate;
   }

   public void setEndDate(Long endDate) {
      this.endDate = endDate;
   }
}
