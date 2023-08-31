package com.example.demo.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	
	@Autowired
	UserRepo pr;
	
	public User saveInfo(User p)
	{
		return pr.save(p);
	}
	public List<User> showAll()
	{
		return pr.findAll(); 
	}
	public User change(User p)
	{
		return pr.saveAndFlush(p);
	}
	public void deleteid(int id)
	{
		pr.deleteById(id);
	}
	
public List<User> sortInfo(String str) {
		
		return pr.findAll(Sort.by(Sort.DEFAULT_DIRECTION.DESC,str));
	}
	public List<User> pageInfo(int page ,int pagesize)
	{
		Page<User> pg = pr.findAll(PageRequest.of(page,pagesize));
		return pg.getContent();
	}
	public List<User> pageInfoSorted(int page ,int pagesize,String str)
	{
		Page<User> pg = pr.findAll(PageRequest.of(page,pagesize,Sort.by(Sort.DEFAULT_DIRECTION,str)));
		return pg.getContent();
	}

	public User getDetails(int id)
	{
		return pr.getInfo(id);
	}
	public User updateDetails(int id,int newid) {
		return pr.updateInfo(id, newid);
		
	}
	public User deleteDetails(int id)
	{
		return pr.deleteInfo(id);
		
	}


}
