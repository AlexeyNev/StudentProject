package edu.studentorder.validator;

import edu.studentorder.domain.AswerCityRegister;
import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.StudentOrder;
import edu.studentorder.exception.CityRegisterException;

/**
 * Полиморфизм - если назвать бульдога собакой, он не перестанет быть собакой.
 * бульдог - это собака
 * Интерфейс - это "Как профессия". Например, мы вызываем на дом врача, мы не знаем
 * мужчина это будет или женщина и т д, нам важно одно - что он лечит.
 */

public class CityRegisterValidator {

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponce hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponce wans = personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponce cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AswerCityRegister ans = new AswerCityRegister();
        return ans;
    }
}

