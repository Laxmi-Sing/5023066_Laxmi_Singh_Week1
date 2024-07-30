package DesignPatterns.DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        this.sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println("SMS notification: "+msg);
    }
}
