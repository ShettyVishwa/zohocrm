package com.zohocrmapp3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp3.Entity.Contacts;
import com.zohocrmapp3.Entity.Lead;
import com.zohocrmapp3.Service.ContactService;
import com.zohocrmapp3.Service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService conService;
	
	@RequestMapping("/")
	public String createLeadPage() {
		return "CreateLead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "LeadInfo";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id) {
		Lead lead = leadService.getOneLead(id);
		Contacts c=new Contacts();
		
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		
		conService.convertLead(c);
		leadService.deleteLead(id);
		return "";
	}
	
	@RequestMapping("/listAllLead")
	public String listAllLead(ModelMap model) {
		List<Lead> leads = leadService.listLead();
		model.addAttribute("leads", leads);
		return "ListResults";
		
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "LeadInfo";
		
	}
}
