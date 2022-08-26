package com.zohocrmapp3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp3.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
