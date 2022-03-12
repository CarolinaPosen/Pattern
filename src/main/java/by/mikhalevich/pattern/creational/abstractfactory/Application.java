package by.mikhalevich.pattern.creational.abstractfactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */

public class Application {

    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint(){
        button.paint();
    }
}
