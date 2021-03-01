package com.jspider.hibernate.tester;

import com.jspider.hibernate.dao.PubDAO;
import com.jspider.hibernate.dto.PubDTO;

public class MainRunner {
	public static void main(String[] args) {
		PubDTO pubDTO=new PubDTO();
		pubDTO.setPubId(2);
		pubDTO.setPubName("Jsider");
		pubDTO.setEnteryFee(999.99);
		pubDTO.setDrinkType("water");
		PubDAO dao= new PubDAO();

		dao.savePub(pubDTO);


	}

}
