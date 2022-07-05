package edu.studentorder.validator;

import edu.studentorder.domain.Child;
import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.Person;
import edu.studentorder.domain.other.AdultHuman;
import edu.studentorder.exception.CityRegisterException;

/**
 * final - это константа, которую нельзя менять
 */

public class FakeCityRegisterChecker implements CityRegisterChecker {

    private static final String Good_1 = "1000";
    private static final String Good_2 = "2000";
    private static final String Bad_1 = "1001";
    private static final String Bad_2 = "2001";
    private static final String Error_1 = "1002";
    private static final String Error_2 = "2002";

    public CityRegisterCheckerResponce checkPerson(Person person)
            throws CityRegisterException {

        CityRegisterCheckerResponce res = new CityRegisterCheckerResponce();

        if (person instanceof AdultHuman) {
            AdultHuman t = (AdultHuman) person;
            String ps = t.getPassportSeria();
            if (ps.equals(Good_1) || ps.equals(Good_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ps.equals(Bad_1) || ps.equals(Bad_2)) {
                res.setExisting(false);
            }
            if (ps.equals(Error_1) || ps.equals(Error_2)) {
                CityRegisterException ex = new CityRegisterException("Fake Error" + ps);
                throw ex;
            }
        }
        if (person instanceof Child) {
            res.setExisting(true);
            res.setTemporal(true);
        }
        System.out.println(res);
        return res;
    }
}
