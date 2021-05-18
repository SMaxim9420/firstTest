package online_tusur.unit_online_tusur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;


public class TestFactorys {
	Student s = new Student();
	
	@TestFactory
	//Collection<DynamicNode> dynamicTestFirstName() {
	Collection<DynamicTest> dynamicTestFirstNamePoz() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<String> actFirstNamePoz = Arrays.asList("Alexandr", "Vladimir", "Aleksey");
	List<String> expFirstNamePoz = Arrays.asList("Alexandr", "Vladimir", "Aleksey");

	//ArrayList<DynamicNode> res = new ArrayList<>();
	ArrayList<DynamicTest> resFistNamePoz = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка actFirstName
	for (int j = 0; j < actFirstNamePoz.size(); j++) {

	String firstNamePoz1, firstNamePoz2;
	s.setFirstName(actFirstNamePoz.get(j));
	firstNamePoz2 = s.getFirstName();
	firstNamePoz1 = expFirstNamePoz.get(j);

	// создаем на каждой итерации выполнение теста
	Executable execFirstNamePoz = () -> assertEquals(firstNamePoz1, firstNamePoz2);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestFirstNamePoz = dynamicTest("test"+j+". firstName="+firstNamePoz1+"}",execFirstNamePoz);

	//записываем тест в коллецию res на каждой итерации цикла
	resFistNamePoz.add(dTestFirstNamePoz);
	}

	return resFistNamePoz;
	}
	
	@TestFactory
	//Collection<DynamicNode> dynamicTestFirstName() {
	Collection<DynamicTest> dynamicTestFirstNameNeg() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<String> actFirstNameNeg = Arrays.asList("Alexandr", "Vladimir", "Aleksey");
	List<String> expFirstNameNeg = Arrays.asList("Alexandr", "Владимир", "Aleksey");

	//ArrayList<DynamicNode> res = new ArrayList<>();
	ArrayList<DynamicTest> resFistNameNeg = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка actFirstName
	for (int j = 0; j < actFirstNameNeg.size(); j++) {

	String firstNameNeg1, firstNameNeg2;
	s.setFirstName(actFirstNameNeg.get(j));
	firstNameNeg2 = s.getFirstName();
	firstNameNeg1 = expFirstNameNeg.get(j);

	// создаем на каждой итерации выполнение теста
	Executable execFirstNameNeg = () -> assertEquals(firstNameNeg1, firstNameNeg2);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestFirstNameNeg = dynamicTest("test"+j+". firstName="+firstNameNeg1+"}",execFirstNameNeg);

	//записываем тест в коллецию res на каждой итерации цикла
	resFistNameNeg.add(dTestFirstNameNeg);
	}

	return resFistNameNeg;
	}
	
	
	@TestFactory
	Collection<DynamicTest> dynamicTestLastNamePoz() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<String> actLastNamePoz = Arrays.asList("Ivanov", "Petrov", "Alekseev");
	List<String> expLastNamePoz = Arrays.asList("Ivanov", "Petrov", "Alekseev");

	//ArrayList<DynamicNode> res = new ArrayList<>();
	ArrayList<DynamicTest> resLastNamePoz = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка actFirstName
	for (int f = 0; f < actLastNamePoz.size(); f++) {

	String lastNamePoz1, lastNamePoz2;
	s.setLastName(actLastNamePoz.get(f));
	lastNamePoz2 = s.getLastName();
	lastNamePoz1 = expLastNamePoz.get(f);

	// создаем на каждой итерации выполнение теста
	Executable execLastNamePoz = () -> assertEquals(lastNamePoz1, lastNamePoz2);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestLastNamePoz = dynamicTest("test"+f+". lastName="+lastNamePoz1+"}",execLastNamePoz);

	//записываем тест в коллецию res на каждой итерации цикла
	resLastNamePoz.add(dTestLastNamePoz);
	}

	return resLastNamePoz;
	}
	
	
	@TestFactory
	Collection<DynamicTest> dynamicTestLastNameNeg() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<String> actLastNameNeg = Arrays.asList("Ivanov", "Petrov", "Alekseev");
	List<String> expLastNameNeg = Arrays.asList("Sidorov", "Petrov", "Alekseev");

	//ArrayList<DynamicNode> res = new ArrayList<>();
	ArrayList<DynamicTest> resLastNameNeg = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка actFirstName
	for (int f = 0; f < actLastNameNeg.size(); f++) {

	String lastNameNeg1, lastNameNeg2;
	s.setLastName(actLastNameNeg.get(f));
	lastNameNeg2 = s.getLastName();
	lastNameNeg1 = expLastNameNeg.get(f);

	// создаем на каждой итерации выполнение теста
	Executable execLastNameNeg = () -> assertEquals(lastNameNeg1, lastNameNeg2);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestLastNameNeg = dynamicTest("test"+f+". lastName="+lastNameNeg1+"}",execLastNameNeg);

	//записываем тест в коллецию res на каждой итерации цикла
	resLastNameNeg.add(dTestLastNameNeg);
	}

	return resLastNameNeg;
	}

	@TestFactory
	Collection<DynamicTest> dynamicTestAgePoz() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<Integer> actAgePoz = Arrays.asList(18,34,48);
	List<Integer> expAgePoz = Arrays.asList(18,34,48);

	//ArrayList<DynamicNode> resAge = new ArrayList<>();
	ArrayList<DynamicTest> resAgePoz = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка act
	for (int i = 0; i < actAgePoz.size(); i++) {

	int x,y;
	s.setAge(actAgePoz.get(i));
	y=s.getAge();
	x=expAgePoz.get(i);

	// создаем на каждой итерации выполнение теста
	Executable execAgePoz = () -> assertEquals(x, y);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestAgePoz = dynamicTest("test"+i+". age="+x+"}",execAgePoz);

	//записываем тест в коллецию res на каждой итерации цикла
	resAgePoz.add(dTestAgePoz);
	}

	return resAgePoz;
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTestAgeNeg() {

	//наш тестовый студент - s- экземпляр (объект) класса Student.
	//Student s = new Student();

	List<Integer> actAgeNeg = Arrays.asList(55,34,48);
	List<Integer> expAgeNeg = Arrays.asList(18,40,48);

	//ArrayList<DynamicNode> resAge = new ArrayList<>();
	ArrayList<DynamicTest> resAgeNeg = new ArrayList<>();

	//перебираем в цикле все элементы коллекции-списка act
	for (int i = 0; i < actAgeNeg.size(); i++) {

	int x,y;
	s.setAge(actAgeNeg.get(i));
	y=s.getAge();
	x=expAgeNeg.get(i);

	// создаем на каждой итерации выполнение теста
	Executable execAgeNeg = () -> assertEquals(x, y);

	//здесь формируем один тест из отображаемого имени, которое мы будем видеть в отчете JUnit и расширения Executable на каждой итерации, итого у нас в примере будет 3 таких теста
	DynamicTest dTestAgeNeg = dynamicTest("test"+i+". age="+x+"}",execAgeNeg);

	//записываем тест в коллецию res на каждой итерации цикла
	resAgeNeg.add(dTestAgeNeg);
	}

	return resAgeNeg;
	}
	
	
	
	}


