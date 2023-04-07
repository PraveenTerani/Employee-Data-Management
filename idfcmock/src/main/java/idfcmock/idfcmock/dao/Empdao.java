package idfcmock.idfcmock.dao;

import java.util.Optional;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import idfcmock.idfcmock.dto.Empdto;
import idfcmock.idfcmock.repository.Userrepository;

@Component
public class Empdao {

	@Autowired
	Userrepository userrepository;

	public void insert(Empdto empdto) {
		userrepository.save(empdto);

	}

	public String remove(int emp_id) {
		userrepository.deleteById(emp_id);
		return "data deleted";
	}

	public Empdto fetch(int id) {
		Optional<Empdto> e1 = userrepository.findById(id);
//		Empdto empdto=e1.get();
//		System.out.println(e1);
	 Empdto empdto=e1.get();
	 return empdto;
	}

}
