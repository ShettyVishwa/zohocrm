package com.zohocrmapp3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp3.Entity.Contacts;
import com.zohocrmapp3.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository conRepo;
	
	@Override
	public void convertLead(Contacts contact) {
      conRepo.save(contact);
	}

}
