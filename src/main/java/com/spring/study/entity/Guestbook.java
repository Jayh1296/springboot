package com.spring.study.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@SequenceGenerator(
		name = "BOOK_SEQ_GEN",
		sequenceName = "book_seq",
		initialValue = 1,
		allocationSize = 1
)
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guestbook extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "BOOK_SEQ_GEN")
	private Long gno;
	
	@Column(length = 100, nullable = false)
	private String title;
	
	@Column(length = 1500, nullable = false)
	private String content;
	
	@Column(length = 50, nullable = false)
	private String writer;
	
	public void changeTitle(String title) {
		this.title = title;
	}
	
	public void changeContent(String content) {
		this.content = content;
	}
	
	public void deleteContent(Long gno) {
		this.gno = gno;
	}
	
}
