package com.Backend.Test.Services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.multipart.MultipartFile;

import com.Backend.Test.Controllers.FileStorageProperties;
import com.Backend.Test.Model.Besoin;
import com.Backend.Test.Model.Cv;
import com.Backend.Test.Repositories.BesoinRepository;

@Service
public class BesoinService {
	
	@Autowired
	private BesoinRepository BesoinRepository;
	
	 Path root = Paths.get("src\\main\\resources\\static");
	 
	public Besoin save(Besoin besoin, MultipartFile file) throws IOException {
		Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		besoin.setCv(file.getOriginalFilename());
		return BesoinRepository.save(besoin);
	}
	
	public List<Besoin> findAll() 
	{
		return BesoinRepository.findAll();
	}
	
	public void Delete()
	{
		BesoinRepository.deleteAll();
	}
	
	
}
