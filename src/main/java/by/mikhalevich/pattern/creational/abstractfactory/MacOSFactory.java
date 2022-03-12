package by.mikhalevich.pattern.creational.abstractfactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
