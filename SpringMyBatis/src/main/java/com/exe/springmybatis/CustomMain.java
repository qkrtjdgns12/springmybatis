package com.exe.springmybatis;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("app-context.xml");
		
		CustomDAO dao = (CustomDAO)context.getBean("customDAO");
		
		CustomDTO dto;
		
//		//insert
//		dto = new CustomDTO();
//		
//		dto.setId(444);
//		dto.setName("������");
//		dto.setAge(33);
//		
//		dao.insertData(dto);
//		
//		System.out.println("insert �Ϸ�...");
//		
//		//select
//		List<CustomDTO> lists = dao.getLists();
//		
//		for(CustomDTO vo : lists) {
//			System.out.printf("%d %s %d\n",
//					vo.getId(),vo.getName(),vo.getAge());
//		}
//		
//		System.out.println("select �Ϸ�...");
//		
//		//oneSelect
//		dto = dao.getReadData(444);
//		
//		if(dto!=null) {
//			System.out.printf("%d %s %d\n",
//					dto.getId(),dto.getName(),dto.getAge());
//		}
//		
//		System.out.println("oneSelect �Ϸ�...");
		
//		//update
//		dto = new CustomDTO();
//		
//		dto.setId(444);
//		dto.setName("������");
//		dto.setAge(20);
//		
//		dao.UpdateData(dto);
//		
//		System.out.println("update �Ϸ�..");
		
//		//delete
//		dao.deleteData(111);
//		
//		System.out.println("delete �Ϸ�...");

	}

}
