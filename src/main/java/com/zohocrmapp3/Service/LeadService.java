package com.zohocrmapp3.Service;

import java.util.List;

import com.zohocrmapp3.Entity.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteLead(long id);

	public List<Lead> listLead();
}
