package com.designpattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriterialFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
