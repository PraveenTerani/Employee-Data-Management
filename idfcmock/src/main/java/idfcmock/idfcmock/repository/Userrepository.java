package idfcmock.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idfcmock.idfcmock.dto.Empdto;
@Repository
public interface Userrepository extends JpaRepository<Empdto, Integer>{

}
