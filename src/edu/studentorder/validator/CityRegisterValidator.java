package edu.studentorder.validator;

import edu.studentorder.domain.AswerCityRegister;
import edu.studentorder.domain.Child;
import edu.studentorder.domain.CityRegisterCheckerResponce;
import edu.studentorder.domain.StudentOrder;
import edu.studentorder.exception.CityRegisterException;

import java.util.List;

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

            List<Child> children = so.getChildren();

            for (int i = 0; i < children.size(); i++) {
                CityRegisterCheckerResponce cans = personChecker.checkPerson(so.getChildren().get(i));
            }
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AswerCityRegister ans = new AswerCityRegister();
        return ans;
    }
}

