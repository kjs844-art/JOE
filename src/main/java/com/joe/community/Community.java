package com.joe.community;

import java.util.Date;

/*
 * Community DTO (Data Transfer Object)
 * 메모장에 설계한 칼럼들을 담는 그릇 역할을 한다.
 * DB의 COMMUNITY 테이블 한 행(row) = 이 객체 1개
 */
public class Community {

	private int no;              // 글번호 (NUMBER, Primary Key)
	private String title;        // 제목 (VARCHAR2 300)
	private String name;         // 작성자 (VARCHAR2 100)
	private String contents;     // 내용 (VARCHAR2 4000)
	private Date regDate;        // 작성시간 (DATE)
	private int star;            // 중요도 (NUMBER 1)

	// ────────────────────────────────────────────
	// Getter / Setter : JSP에서 ${dto.no} 처럼 꺼내 쓸 때 필요
	// ────────────────────────────────────────────

	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getContents() { return contents; }
	public void setContents(String contents) { this.contents = contents; }

	public Date getRegDate() { return regDate; }
	public void setRegDate(Date regDate) { this.regDate = regDate; }

	public int getStar() { return star; }
	public void setStar(int star) { this.star = star; }
}
