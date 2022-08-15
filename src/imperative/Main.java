package imperative;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static imperative.Person.Gender.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		List<Person> people = main.getList();
		//declarative approach 1
		people
			.stream()
			.filter(ak -> FEMALE.equals(ak.getGender()))
			.forEach(System.out::println);	
		
		//declarative approach 2
		List<Person> females = people.stream().filter(ak -> FEMALE.equals(ak.getGender())).collect(Collectors.toList());
		females.forEach(System.out::println);
		
		//Function functional interface and has apply() abstract method
		int res = multiplyByTwo.apply(5);
		System.out.println(res);
		
		//BiFunction functional interface and has apply() abstract method
		int res2 = multiplyByTwoAndAddTen.apply(12, 10);
		System.out.println(res2);
		
		//Cnsumer func interface and has accept() abstract method
		customerConsumer.accept(new Person("vivek",MALE));
		
		//optional is a class having methods to avoid NPE
		Optional<Person> per = Optional.ofNullable(null);
		System.out.println(per.isPresent());
		
		//BiConsumer
		customerBiConsumer.accept(new Person("pournima",FEMALE), false);
		
		//Predicate
		if(isValidMobileNo.test("919172311474"))
			System.out.println("mobile number is valid");
		else
			System.out.println("mobile number is invalid");
		
		//Supplier
		System.out.println(getJDBCConnUrlSupplier.get());
	}
	
	static Function<Integer,Integer> multiplyByTwo = a -> a*2; //takes 2 args, 1.input arg 2.return arg type
	
	static BiFunction<Integer,Integer,Integer> multiplyByTwoAndAddTen = (a,b) -> (a*2) + b; //takes 3 args 1 and 2 are input args and 3rd is return type arg

	//below is  consumer functional interface which accepts 1 input arg and returns no result, it has accept() abstract method
	static Consumer<Person> customerConsumer = customer -> System.out.println("this is profile of " + customer.getName() +" & has gender " + customer.getGender());
	
	//below is BiConsumer func int and accepts 2 args & returns no result
	static BiConsumer<Person, Boolean> customerBiConsumer = (a,b) -> 
		System.out.println("this is profile of " + a.getName() +" & has gender " + (b ? a.getGender() : " STOP U SEXIST!!"));
	
	//Predicate represents a predicate(boolean-valued func) of one argument and has test() as abstract method
	static Predicate<String> isValidMobileNo = number -> number.startsWith("91") && number.length() == 12;
	//BiPredicate is similar to above except it accepts 2 input args	
	
	//Supplier represents a supplier of results and takes the return type as the argument and abstract method is get()
	static Supplier<String> getJDBCConnUrlSupplier = () -> "jdbc://localhost/5432/users";
	
	public List<Person> getList(){
		List<Person> ak = Arrays.asList(
				new Person("akshay", MALE),
				new Person("rohit", MALE),
				new Person("nilu", FEMALE),
				new Person("archana", FEMALE));
		return ak;
	}
}
