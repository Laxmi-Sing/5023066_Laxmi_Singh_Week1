package DesignPatterns.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void display() {
        System.out.println("This is an excel document file");
    }
}
