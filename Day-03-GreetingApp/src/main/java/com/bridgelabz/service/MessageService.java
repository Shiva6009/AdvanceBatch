package com.bridgelabz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.Message;
import com.bridgelabz.reposistory.MessageReposistory;


@Service
public class MessageService {

	@Autowired // Using AutoWired Internal create the object for dependent classes.
	MessageReposistory messageReposistory;
	
	// To Save a record in database we will use "save"  method of CURDreposistory or JPAReposistory 
	public void saveOrUpdate(Message msg)
	{
		messageReposistory.save(msg);
	}
	
	// To get a record from database we will use findByID method of CURDreposistory
	public Optional<Message> getMessageById(int msgid)
	{
		return messageReposistory.findById(msgid);
	}
	
	// To Delete a record from database we use deleteById method of CURDreposistory
	public void deleteMessageById(int msgid)
	{
		messageReposistory.deleteById(msgid);
	}
	
	// To Update a record a database we use save method of CURDreposistory
	public void updateMessage(Message obj)
	{
		messageReposistory.save(obj);
	
	}
	
	// To get All records from database we can use findByAllMethod CURDreposistory
	public List<Message> getAllMessage()
	{
		return (List<Message>) messageReposistory.findAll();
	}
	
	
}
