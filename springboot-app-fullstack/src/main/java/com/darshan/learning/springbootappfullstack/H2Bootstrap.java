package com.darshan.learning.springbootappfullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.darshan.learning.springbootappfullstack.entity.RoomEntity;
import com.darshan.learning.springbootappfullstack.repository.RoomRepository;


@Component
public class H2Bootstrap implements CommandLineRunner{

	@Autowired
	RoomRepository roomRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		roomRepository.save(new RoomEntity(10, 120));
		roomRepository.save(new RoomEntity(11, 121));
		roomRepository.save(new RoomEntity(12, 122));
		roomRepository.save(new RoomEntity(13, 123));
		roomRepository.save(new RoomEntity(14, 124));
		
		System.out.println("Data Saved");
		
	}

}
