package constructorConfusion;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusionApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("app-context-xml.xml");
        context.refresh();
        ConstructorConfusion constructorConfusion = (ConstructorConfusion) context.getBean("constructorConfusion");
        System.out.println(constructorConfusion);
        context.close();
    }
}
