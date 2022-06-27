package edu.studentorder.validator;

import edu.studentorder.domain.AswerCityRegister;
import edu.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    public int password;

    public AswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("Проверка в городском реестре населения: " + hostName + "," + login + "," + password);
        AswerCityRegister rsl = new AswerCityRegister();
        rsl.success = false;
        return rsl;
    }
}
