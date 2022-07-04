package edu.studentorder.validator;

import edu.studentorder.domain.AswerCityRegister;
import edu.studentorder.domain.StudentOrder;

/**
 * Полиморфизм - если назвать бульдога собакой, он не перестанет быть собакой.
 * бульдог - это собака
 * Интерфейс - это "Как профессия". Например, мы вызываем на дом врача, мы не знаем
 * мужчина это будет или женщина и т д, нам важно одно - что он лечит.
 */

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    public int password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AswerCityRegister rsl = new AswerCityRegister();
        return rsl;
    }
}

