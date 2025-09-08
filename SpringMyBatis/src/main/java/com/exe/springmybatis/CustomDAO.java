package com.exe.springmybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;


public class CustomDAO {
	
	
	//의존성 주입
	private SqlSessionTemplate sessionTemplate;
	
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	public void insertData(CustomDTO dto) {
		
		sessionTemplate.insert("com.custom.insert",dto);
		
	}
	
	public void UpdateData(CustomDTO dto) {
			
		sessionTemplate.update("com.custom.update",dto);
			
		}
	
	
	public void deleteData(int id) {
		
		sessionTemplate.delete("com.custom.delete",id);
		
	}

	public List<CustomDTO> getLists() {
		
		List<CustomDTO> lists = 
				sessionTemplate.selectList("com.custom.list");
		
		return lists;
	}
	
	public CustomDTO getReadData(int id) {
			
			CustomDTO dto = 
					sessionTemplate.selectOne("com.custom.listOne",id);

					return dto;
		}


}
