package by.mikhalevich.pattern.creational.abstractfactory;

public class Runner {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */

    private static Application configureApplication(){

        GUIFactory factory;
        Button button;
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("windows")){
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        button = factory.createButton();

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

}
