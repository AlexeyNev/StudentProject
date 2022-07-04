package edu.studentorder.exception;

/**
 * Exception - наследование от класса Exception
 * помещает объект как бы в группу объектов которые могут быть исключениями
 *
 * Exception - когда хотите создать объект/класс описывающий какую то проблему,
 * то этот класс наследуется от Exception
 */
public class CityRegisterException extends Exception {


    public CityRegisterException() {
    }

    public CityRegisterException(String message) {
        super(message);
    }

    public CityRegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
