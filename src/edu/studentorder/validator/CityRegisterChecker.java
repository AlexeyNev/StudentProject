package edu.studentorder.validator;

import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponce checkPerson(Person person);
}
