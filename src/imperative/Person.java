package imperative;

import static imperative.Person.Gender.FEMALE;
import static imperative.Person.Gender.MALE;

import java.util.Arrays;
import java.util.List;

public class Person {
	private final String name;
	private final Gender gender;
	
	Person() {
		this.name = "";
		this.gender = null;
		}
	
	Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	enum Gender{
		MALE,FEMALE;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}
	
	public List<Person> getListOfPersons(){
		List<Person> ak = Arrays.asList(
				new Person("akshay", MALE),
				new Person("rohit", MALE),
				new Person("nilu", FEMALE),
				new Person("archana", FEMALE));
		return ak;
	}
}
