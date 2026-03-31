package com.joe.app.member;

public class MemberDTO {

	private String userId;
	private String password;
	private String name;
	private String email;

	public MemberDTO() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

/*
설명
- MemberDTO는 회원가입 입력값을 담는 클래스다.
- USER_ID, PASSWORD, NAME, EMAIL 값을 자바 변수로 들고 있다.
- Servlet에서 받은 값을 set 메서드로 저장하고 DAO로 넘긴다.

수정 직전 코드 보관

package com.joe.app.member;

// 회원가입 입력값을 담는 DTO 클래스
public class MemberDTO {

	// MEMBER.USER_ID 값을 담는 필드
	private String userId;

	// MEMBER.PASSWORD 값을 담는 필드
	private String password;

	// MEMBER.NAME 값을 담는 필드
	private String name;

	// MEMBER.EMAIL 값을 담는 필드
	private String email;

	// 기본 생성자
	public MemberDTO() {
	}

	// userId 값을 꺼내는 메서드
	public String getUserId() {
		return userId;
	}

	// userId 값을 저장하는 메서드
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// password 값을 꺼내는 메서드
	public String getPassword() {
		return password;
	}

	// password 값을 저장하는 메서드
	public void setPassword(String password) {
		this.password = password;
	}

	// name 값을 꺼내는 메서드
	public String getName() {
		return name;
	}

	// name 값을 저장하는 메서드
	public void setName(String name) {
		this.name = name;
	}

	// email 값을 꺼내는 메서드
	public String getEmail() {
		return email;
	}

	// email 값을 저장하는 메서드
	public void setEmail(String email) {
		this.email = email;
	}
}
*/
