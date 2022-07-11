package edu.studentorder.validator;

import edu.studentorder.domain.Person;
import edu.studentorder.domain.register.AnswerCityRegisterItem;
import edu.studentorder.domain.register.AswerCityRegister;
import edu.studentorder.domain.Child;
import edu.studentorder.domain.register.CityRegisterResponce;
import edu.studentorder.domain.StudentOrder;
import edu.studentorder.exception.CityRegisterException;
import edu.studentorder.exception.TransportException;

import java.util.List;

/**
 * Полиморфизм - если назвать бульдога собакой, он не перестанет быть собакой.
 * бульдог - это собака
 * Интерфейс - это "Как профессия". Например, мы вызываем на дом врача, мы не знаем
 * мужчина это будет или женщина и т д, нам важно одно - что он лечит.
 */

public class CityRegisterValidator {

    private CityRegisterChecker personChecker;

    public static final String IN_CODE = "No GRN";

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
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponce tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ? AnswerCityRegisterItem.CityStatus.Yes : AnswerCityRegisterItem.CityStatus.No;
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.Error;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        } catch (TransportException e) {
            e.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.Error;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, e.getMessage());
        }

        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(status, person, error);

        return ans;
    }
}

