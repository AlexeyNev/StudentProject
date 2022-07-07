package edu.studentorder.domain.register;

/**
 * Boolean - с большой буквы, это класс "обертка", они есть для каждого элементарного типа,
 * он может быть даже null
 *
 * Исключения - специальный объект, который обладает несколькими важными возможностями.
 * 1) Это полноценный объект, который может иметь в себе множество информации
 * 2) Возвращается такой объект не с помощью return, а с помощью другого механизма
 */
public class CityRegisterResponce {
    boolean existing;
    Boolean temporal;


    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterResponce{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
