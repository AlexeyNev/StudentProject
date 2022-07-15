package Training.Training5;

/**
 * super - ключевое слово, чтобы подклассу можно было сослаться на главный класс (иметь доступ ко всем методам).
 */
public class Straus extends Birds {

    public void hideHead() {
        System.out.println("Страус прячет голову");
    }

    @Override
    public void walk() {
        System.out.println("Теперь метод walk переопределился");
    }
}
