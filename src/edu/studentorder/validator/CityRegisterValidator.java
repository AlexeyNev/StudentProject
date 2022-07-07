package edu.studentorder.validator;

import edu.studentorder.domain.Person;
import edu.studentorder.domain.register.AnswerCityRegisterItem;
import edu.studentorder.domain.register.AswerCityRegister;
import edu.studentorder.domain.Child;
import edu.studentorder.domain.register.CityRegisterResponce;
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
        AswerCityRegister ans = new AswerCityRegister();
        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));

        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        try {
            CityRegisterResponce cans = personChecker.checkPerson(person);
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}

