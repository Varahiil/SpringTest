import by.itstep.HelloWorld;
import by.itstep.student.Group;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import by.itstep.student.Student;

public class App {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("app.xml");
        HelloWorld helloWorld = appContext.getBean("helloWorld", HelloWorld.class);
        helloWorld.setHelloMessage("Hello ITStep");

        System.out.println(helloWorld);

        Student student = appContext.getBean("by/itstep/student", Student.class);
        student.setName("Jack");
        student.setGroup("it");
        student.setRate(5.0);

        System.out.println(student);

        Group groupJ1022 = appContext.getBean("group", Group.class);
        for (int i = 0; i < 10; i++) {
            Student stud = appContext.getBean("student", Student.class);
            stud.setName("Petrov" + i);
            stud.setGroup("J1022");
            stud.setRate(100. + i);
            groupJ1022.addStudent(stud);
        }
        System.out.println(groupJ1022.toString());
    }
}
