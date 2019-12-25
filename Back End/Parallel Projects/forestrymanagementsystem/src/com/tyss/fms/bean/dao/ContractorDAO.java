package com.tyss.fms.bean.dao;

import java.util.List;

import com.tyss.fms.bean.Contractor;
import com.tyss.fms.bean.Customer;

public interface ContractorDAO 
{
	public List<Contractor> getAllContractor(Contractor cont);
	public boolean deleteContractor(Contractor cont);
	public boolean insertContractor(Contractor cont);

}
