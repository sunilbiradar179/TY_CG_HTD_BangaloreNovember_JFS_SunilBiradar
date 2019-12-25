package com.tyss.fms.bean.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Contractor;

public class ContractorDAOImpl implements ContractorDAO {

		Scanner sc=new Scanner(System.in);
		List<Contractor> list=new ArrayList<Contractor>();
	@Override
	public List<Contractor> getAllContractor(Contractor cont) {
		// TODO Auto-generated method stub
		return list;
	}

	

	
	@Override
	public boolean deleteContractor(Contractor cont) {
		System.out.println("enter the index");
		int index=sc.nextInt();
		list.remove(index);
		return true;
	}

	@Override
	public boolean insertContractor(Contractor cont) {
		list.add(cont);
		return true;
	}

}
