package com.Backend.Shema.Services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Backend.Shema.Model.refResp;
import com.Backend.Shema.Repositories.RespRepository;






@Service
public class RespService {

	@Autowired
	private RespRepository mr;
	
	public refResp addrefResp (refResp user) {
	
		return mr.save(user);
	}

	public refResp uprefResp (refResp user) {
	
		return mr.save(user);
	}
	public List<refResp> FindAllrefResps()
	{
		return mr.findAll();
	}
 
	
	

}
