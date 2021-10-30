package com.bridgelabz.reposistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Message;  

@Repository
public interface MessageReposistory extends CrudRepository <Message,Integer>{

	
}
