package edu.dio.studer.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PomoDTO {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Long id;
    private String description;
    private int minutes;
    private LocalDate date;
    private Long studentId; // Referência ao ID do Student

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
