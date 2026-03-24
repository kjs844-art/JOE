package com.joe.app.test.util;

import java.sql.Connection;

import com.joe.app.countries.CountryDAO;
import com.joe.app.departments.DepartmentDAO;
import com.joe.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		CountryDAO countryDAO = new CountryDAO();
		try {
			countryDAO.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
