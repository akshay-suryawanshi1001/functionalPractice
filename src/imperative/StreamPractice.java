package imperative;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		Person person = new Person();
		List<Person> people = person.getListOfPersons();
		
		//printing distinct genders
		people.stream()
			.map(currPerson -> currPerson.getGender()) //map performs transformation on data
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		people.forEach(
				user -> System.out.print("\n" +user.getName() + " " + user.getGender())
				);
	}
		
	
}
