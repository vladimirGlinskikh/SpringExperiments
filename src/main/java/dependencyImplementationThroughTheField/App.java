package dependencyImplementationThroughTheField;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context.xml");
        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();
        ctx.close();
    }
}
