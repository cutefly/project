/**
 * 
 */
package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.person.Person;
import com.kpcard.jpa.person.PersonSummary;

/**
 * @author happymoney
 *
 */
public interface PersonManagementService {
	
	public Person createPerson(Person person);
	
	public boolean deletePerson(String personId);
	
	public List<PersonSummary> queryPeopleByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending);

	public List<PersonSummary> queryPeopleByEmailAddress(String email);
	
	public List<PersonSummary> queryPeopleByPhoneNumber(String phone);
	
	public Person readPerson(String personId);
	
	public Person updatePerson(String personId, Person person);

}
