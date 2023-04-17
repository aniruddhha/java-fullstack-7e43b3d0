package com.ani.mapping.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.mapping.domain.ContactDetails;
import com.ani.mapping.domain.IdentityDoc;
import com.ani.mapping.domain.Person;
import com.ani.mapping.repository.ContactDetailsRepository;
import com.ani.mapping.repository.IdentityDocRepository;
import com.ani.mapping.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private IdentityDocRepository identityDocRepository;

    @Autowired
    private ContactDetailsRepository contactDetailsRepository;

    public void insertPerson(String name, LocalDate dob, String docType, boolean isActive, String mobile, String email) {
        // Create a new Person object and set its properties
        Person person = new Person();
        person.setName(name);
        person.setDob(dob);

        // Save the Person object to the database and retrieve its generated ID
        person = personRepository.save(person);

        // Create a new IdentityDoc object and set its properties
        IdentityDoc identityDoc = new IdentityDoc();
        identityDoc.setType(docType);
        identityDoc.setIsActive(isActive);
        identityDoc.setPerson(person);

        // Save the IdentityDoc object to the database
        identityDocRepository.save(identityDoc);

        // Create a new ContactDetails object and set its properties
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setMobile(mobile);
        contactDetails.setEmail(email);
        contactDetails.setPerson(person);

        // Save the ContactDetails object to the database
        contactDetailsRepository.save(contactDetails);
    }

    public void insertPersonOnly(String name, LocalDate dob) {
        Person person = new Person();
        person.setName(name);
        person.setDob(dob);

        // Save the Person object to the database and retrieve its generated ID
        personRepository.save(person);
    }

    public void addContactDetails(long personId, String mob, String eml) {

        Optional<Person> op = personRepository.findById(personId);
        // Person person = op.orElseThrow(() -> new RuntimeException());
        Person person = op.orElseThrow(RuntimeException::new);

        ContactDetails details = new ContactDetails();
        details.setEmail(eml);
        details.setMobile(mob);
        details.setPerson(person);

        contactDetailsRepository.save(details);
    }

    public List<Person> listAll() {
        return personRepository.findAll();
    }

}
