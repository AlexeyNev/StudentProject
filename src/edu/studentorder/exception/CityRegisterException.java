package edu.studentorder.exception;

/**
 * Exception - наследование от класса Exception
 * помещает объект как бы в группу объектов которые могут быть исключениями
 * <p>
 * Exception - когда хотите создать объект/класс описывающий какую то проблему,
 * то этот класс наследуется от Exception
 */
public class CityRegisterException extends Exception {

    private String code;

    public CityRegisterException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CityRegisterException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
