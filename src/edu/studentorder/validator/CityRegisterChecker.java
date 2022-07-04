package edu.studentorder.validator;

import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.Person;
import edu.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponce checkPerson(Person person) throws CityRegisterException;
}
