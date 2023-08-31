package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project.model.Model;

public interface Repository extends JpaRepository<Model, Integer> {
	@Query(value="select * from cardetils  where owners=:s",nativeQuery = true)
	public List<Model>getowner(@Param("s")int own);
	
	@Query(value="select * from cardetils  where owners=:s",nativeQuery = true)
	public List<Model>getaddress(@Param("s")String address);
	
	@Query(value="select * from cardetils  where owners=:s",nativeQuery = true)
	public List<Model>getcarname(@Param("s")String carname);
	
	@Query(value="select * from cardetils  where owners=:s",nativeQuery = true)
	public List<Model>getowntype(@Param("s")int own ,@Param("sn")String ctype);
	

}
