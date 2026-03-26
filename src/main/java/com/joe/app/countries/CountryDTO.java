package com.joe.app.countries;

public class CountryDTO {

	private String countryId;
	// 나라 코드 1개를 담는 변수다. 예: KR, US
	private String countryName;
	// 나라 이름 1개를 담는 변수다. 예: Korea, United States

	public String getCountryId() {
		return countryId;
		// countryId 값을 꺼내서 돌려준다.
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
		// 브라우저나 DB에서 받은 나라 코드를 DTO에 저장한다.
	}

	public String getCountryName() {
		return countryName;
		// countryName 값을 꺼내서 돌려준다.
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
		// 브라우저나 DB에서 받은 나라 이름을 DTO에 저장한다.
	}
}
