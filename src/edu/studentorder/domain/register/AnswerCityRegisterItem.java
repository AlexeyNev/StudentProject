package edu.studentorder.domain.register;

import edu.studentorder.domain.Person;

/**
 * 1) Должен быть статус ответа - да или нет и т д
 * 2) Нужно показать, что конкретная проверка произошла для определенной персоны
 * 3) Класс для описания ошибки (текст ошибки и код ошибки) и ошибка возможной связи с ГРН(вдруг проблема у них)
 *
 *  enum - тип данных перечисление
 */
public class AnswerCityRegisterItem {

    private Person person;      // 2) конкретная персона
    private CityStatus status;

    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {

    }

    public enum CityStatus { // 1) статус ответа
         Yes, No, Error;
    }

    public static class CityError { // 3) класс для ошибки
        private String code;
        private String text;
        private CityError error;

        public CityError(String code, String text, CityError error) {
            this.code = code;
            this.text = text;
            this.error = error;
        }

        public CityError(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public CityError getError() {
            return error;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

}
