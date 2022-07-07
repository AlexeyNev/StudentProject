package edu.studentorder.validator;

import edu.studentorder.domain.register.CityRegisterResponce;
import edu.studentorder.domain.Person;
import edu.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterResponce checkPerson(Person person) throws CityRegisterException;
}
