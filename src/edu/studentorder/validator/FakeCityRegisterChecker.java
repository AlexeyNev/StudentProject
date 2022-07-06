package edu.studentorder.validator;

import edu.studentorder.domain.Child;
import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.Person;
import edu.studentorder.domain.other.AdultHuman;
import edu.studentorder.exception.CityRegisterException;

/**
 * final - это константа, которую нельзя менять
 */

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";

    public CityRegisterCheckerResponce checkPerson(Person person)
            throws CityRegisterException {

        CityRegisterCheckerResponce res = new CityRegisterCheckerResponce();

        if (person instanceof AdultHuman) {
            AdultHuman t = (AdultHuman) person;
            String ps = t.getPassportSeria();
            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setExisting(false);
            }
            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("Fake ERROR " + ps);
                throw ex;
            }
        }

        if(person instanceof Child) {
            res.setExisting(true);
            res.setTemporal(true);
        }

        System.out.println(res);

        return res;
    }
}