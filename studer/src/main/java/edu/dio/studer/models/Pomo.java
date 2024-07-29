package edu.dio.studer.models;

import java.time.LocalDate;

import edu.dio.studer.dto.PomoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pomos")
public class Pomo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private int minutes;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="student_id", nullable = false)
	private Student student;
	
	public Pomo() {}
	
	public Pomo(PomoDTO dto) {
		this.id = dto.getId();
		this.description = dto.getDescription();
		this.date = dto.getDate();
		this.minutes = dto.getMinutes();
	}
	
	public Pomo(Long id, String description, int minutes, LocalDate date) {
		super();
		this.id = id;
		this.description = description;
		this.minutes = minutes;
		this.date = date;
	}
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
