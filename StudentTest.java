package online_tusur.unit_online_tusur;
import org.junit.Assert;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;


public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   

	@ParameterizedTest
	@CsvSource({"Alexandr, Ivanov, 20, Vladimir, Petrov, 18, Aleksey, Alekseev, 35"})
	
	public void testAgeAvg(ArgumentsAccessor args) {
		
		Student[] students = {
				new Student (args.getString(0), args.getString(1), Integer.parseInt(args.getString(2))),
				new Student (args.getString(3), args.getString(4), Integer.parseInt(args.getString(5))),
				new Student (args.getString(6), args.getString(7), Integer.parseInt(args.getString(8)))
		};
		
		int ecpAgeAvg = 24;
		int actAgeAvg = Student.avgAge(students);
		
		Assert.assertEquals(ecpAgeAvg, actAgeAvg);
	}
	
	
/* проверка возраста студента, 
 выходящего за диапазон */
	 /* @Test
	  void test_assert() {
		int age = 26;
		s.setAge(age);
	    int expectedAge = 26;
	    int actualsAge=s.getAge();
	    assertEquals(expectedAge, actualsAge);	

	  }*/
	  
}