package implementationOfSimpleValues;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    @Value("#{injectSimple.name}")
    private String name;

    @Value("#{injectSimple.age}")
    private int age;

    @Value("#{injectSimple.height}")
    private float height;

    @Value("#{injectSimple.programmer}")
    private boolean programmer;

    @Value("#{injectSimple.ageInSeconds}")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("app-context-xml.xml");
        context.refresh();

        InjectSimple simple = (InjectSimple) context.getBean("injectSimple");
        System.out.println(simple);
        context.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }
}
