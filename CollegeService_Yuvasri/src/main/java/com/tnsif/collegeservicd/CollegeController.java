package com.tnsif.collegeservicd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService col;
	@GetMapping("/collegeservice")
	public List<College> list()
	{
		return col.ListAll();
	}
	@PostMapping("/collegeservice")
	public void add(@RequestBody College col1)
	{
      col.save(col1);
	}
	
	@GetMapping("/collegeservice/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id)
	{
		try
		{
			College c=col.get(id);
			return new ResponseEntity<College>(c,HttpStatus.OK);
			
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
			
		}
	}
		@DeleteMapping("/collegeservice/{id}")
		public void delete(@PathVariable Integer id)
		{
			
			col.delete(id);
			
		}
		@PutMapping("/collegeservice/{id}")
		public ResponseEntity<College>update(@PathVariable Integer id,@RequestBody College update_c)
		{
			try
			{
				College exist_c=col.get(id);
				exist_c.setName(update_c.getName());
				exist_c.setAddress(update_c.getAddress());
				exist_c.setDept(update_c.getDept());
				exist_c.setMobileno(update_c.getMobileno());
				col.update(exist_c);
				return new ResponseEntity<College>(exist_c,HttpStatus.OK);
				
			}
			catch(NoResultException e)
			{
				return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
				
			}
		
	}
}
