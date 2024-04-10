package com.tnsif.collegeservicd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService
{
@Autowired
private CollegeRepository repo;
public List<College> ListAll()
{
	return repo.findAll();
}
public void save(College col)
{
	repo.save(col);
	
}
public College get(Integer id)
{
	return repo.findById(id).get();
	
}
public void delete(Integer id)
{
	
repo.deleteById(id);
}
public void update(College col)
{
	repo.save(col);
	

}
}
