package com.darshan.learning.springbootappfullstack.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darshan.learning.springbootappfullstack.entity.RoomEntity;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Integer>{
	
	default void fingById(Integer id){
		
	}
		
	
	
	
}
