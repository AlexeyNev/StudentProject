public class CityRegisterValidator {

    String hostName;
    String login;
    int password;

    AswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("Проверка в городском реестре населения " + hostName + " логин" + " " + login + " " + "пароль" + " " + password);
        AswerCityRegister rsl = new AswerCityRegister();
        rsl.success = false;
        return rsl;
    }
}
