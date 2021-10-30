package com.brideglabz.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Message;
import com.bridgelabz.service.MessageService;

@RestController
public class MessageController {

	/*
	// GET - Used to Reterive the Data.
	// POST - used to Save  the Data
	// PUT - Used to Update the existing data
	// DELETE - Used to delete the Data.
	*/
	
	// 1. API
	// JPA  Java Presistant API => used to write some DB Queries.
	
	
	@Autowired
	MessageService messageService;
	
	@PostMapping("/savemessage")
	public void saveMessage(@RequestBody Message msg)
	{
		 messageService.saveOrUpdate(msg);
	}
	
	@DeleteMapping("/deletemessage")
	public void deleteMessage(@RequestBody int msgid)
	{
		messageService.deleteMessageById(msgid);
	}
	
    @PutMapping("/updatemessage")
	public void updateMessage(@RequestBody Message obj)
	{
		messageService.updateMessage(obj);
	}
	
    @GetMapping("/getsinglemessage")
	public Optional<Message> getMessage(@RequestBody int msgid)
	{
		Optional<Message> result = messageService.getMessageById(msgid);
	    return result;
	}
	
    @GetMapping("/getallmessage")
	public List<Message> getAllMessage()
	{
	     return messageService.getAllMessage();
	}

	
}
