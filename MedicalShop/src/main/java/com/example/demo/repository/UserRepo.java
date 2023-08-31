package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query(value = "select * from user_details where user_id=:s ",nativeQuery = true)
	public User getInfo(@Param("s") int id);
	
	@Modifying
	@Transactional
	@Query(value="delete from user_details where user_id=:s",nativeQuery = true)
	public User deleteInfo(@Param("s") int id);
	
	@Modifying
	@Transactional
	@Query(value="update user_details m set m.user_id=:s1 where m.user_id=:s2",nativeQuery = true)
	public User updateInfo(@Param("s1") int id,@Param("s2") int newid);

}
