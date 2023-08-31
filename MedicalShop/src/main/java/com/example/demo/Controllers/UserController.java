package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserService fs;
	
@PostMapping("addUser")
	
	public User add(@RequestBody  User se)
	{
		return fs.saveInfo(se);
	}

	@GetMapping("showUser")
	public List<User> show()
	{
		return fs.showAll();
	}

	@PutMapping("updateUser")
	public User modify(@RequestBody User se)
	{
		return fs.change(se);
	}

	@DeleteMapping("deleteUserid/{id}")
	public String delId(@PathVariable int id)
	{
		fs.deleteid(id);
		return "Deleted Id: "+id;
	}
	@GetMapping("sort/{str}")
	public List<User> sorting(@PathVariable String str)
	{
		return fs.sortInfo(str);
	}
	@GetMapping("page/{page}/{pagesize}")
	public List<User> paging(@PathVariable int page,@PathVariable int pagesize)
	{
		return fs.pageInfo(page, pagesize);
	}
	@GetMapping("pageSort/{page}/{pagesize}/{str}")
	public List<User> pagingAndSorting(@PathVariable int page,@PathVariable int pagesize,@PathVariable String str)
	{
		return fs.pageInfoSorted(page, pagesize, str);
		
	}
	
	@GetMapping("query/get/{id}")
	public User getdetails(@PathVariable int  id)
	{
		return fs.getDetails(id);
	}
	@PutMapping("query/update/{id}/{newid}")
	public String updatedetails(@PathVariable int id,@PathVariable  int newid)
	{
		fs.updateDetails(id, newid);
		return "Updated";
	}
	@DeleteMapping("query/delete/{id}")
	public String deletedetails(@PathVariable  int id)
	{
		fs.deleteDetails(id);
		return "Deleted "+id;
	}
	

}
