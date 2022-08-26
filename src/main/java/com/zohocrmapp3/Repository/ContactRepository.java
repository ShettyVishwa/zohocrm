package com.zohocrmapp3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp3.Entity.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
