package com.capgemini.onlinetestmanagement.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.onlinetestmanagement.dao.Testdao;
import com.capgemini.onlinetestmanagement.entity.Test1;

@Service

public class TestService {
	@Autowired
	private Testdao testdao;
	@Transactional
	public boolean addtest(Test1 test)
	{
		return testdao.save(test) !=null;
	}
	@Transactional
	public List<Test1>show()
	{
		return testdao.findAll();
	}
	@Transactional
	public void deletetest(int testId)
	{
		testdao.deleteById(testId);
		
	}

}
