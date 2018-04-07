package com.corejava.assignments.spring.sampleapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Spring container is at the core of the Spring Framework. The container will create the objects, wire them
 * together, configure them, and manage their complete life cycle from creation till destruction. The Spring container
 * uses DI to manage the components that make up an application. These objects are called Spring Beans.
 * https://www.tutorialspoint.com/spring/spring_ioc_containers.html
 *
 * The org.springframework.beans.factory.BeanFactory and the org.springframework.context.ApplicationContext interfaces
 * acts as the IoC container.
 * The main tasks performed by IoC container are:
 * 1. to instantiate the application class
 * 2. to configure the object
 * 3. to assemble the dependencies between the objects
 * <p>
 * The Resource object represents the information of applicationContext.xml file. The Resource is the interface and the
 * ClassPathResource is the implementation class of the Reource interface. The BeanFactory is responsible to return the
 * bean. The XmlBeanFactory is the implementation class of the BeanFactory. There are many methods in the BeanFactory
 * interface. One method is getBean(), which returns the object of the associated class.
 * <p>
 * Simple steps to create the spring application
 * create the class
 * create the xml file to provide the values
 * create the test class
 * Load the spring jar files
 * Run the test class
 */

public class ClientTest {
    public static void main(String[] args) {
//        Use of XmlBeanFactory is deprecated. ApplicationContext is a sub-interface of BeanFactory.

//        Resource resource=new ClassPathResource("applicationContext.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);

//        **Keep the configuration file to src/main/resources**
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("studentbean");
        student.displayInfo();

//      Constructor Injection when objects are dependent of each other (Inheritance(Is-Aautowiring)/aggregation(Has-Aautowiring))
        ApplicationContext constructorInjectionContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeConstructorInjection employee = (EmployeeConstructorInjection) constructorInjectionContext.getBean("employeebean");
        employee.show();

//      Setter Injection when objects are dependent of each other (Inheritance(Is-Aautowiring)/aggregation(Has-Aautowiring))
        ApplicationContext setterInjectionContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeSetterInjection employeeSetter = (EmployeeSetterInjection) constructorInjectionContext.getBean("employeesetterbean");
        employeeSetter.show();

//      Constructor Injection with Collection(List of objects-aggregation(Has-Aautowiring))
        ApplicationContext constructorInjectionCollectionContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        QuestionListObjectConstructorInjection question = (QuestionListObjectConstructorInjection) constructorInjectionCollectionContext.getBean("questionbeanconstructordi");
        question.displayInfo();

//      Constructor Injection with Collection(List of objects-aggregation(Has-Aautowiring))
        ApplicationContext setterInjectionCollectionContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        QuestionListObjectSetterInjection questionsetter = (QuestionListObjectSetterInjection) setterInjectionCollectionContext.getBean("questionbeansetterdi");
        question.displayInfo();

//      Implicit Object Dependency Injection(i.e. xml configuration file doesn't require propery element to identify the
//      bean to be injected for the property initialization in current bean)autowiring
        ApplicationContext setterAutowiringContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Aautowiring aautowiring = setterAutowiringContext.getBean("aautowiring", Aautowiring.class);
        aautowiring.display();

        //      Implicit Object Dependency Injection(i.e. xml configuration file doesn't require propery element to identify the
//      bean to be injected for the property initialization in current bean)autowiring
        ApplicationContext setterAutowiringTypeContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Aautowiring aautowiringtype = setterAutowiringTypeContext.getBean("aautowiringtype", Aautowiring.class);
        aautowiringtype.display();

//      Implicit Object Dependency Injection(i.e. xml configuration file doesn't require propery element to identify the
//      bean to be injected for the property initialization in current bean) using @autowiring annotation on setter
//      It will work with non primitive & non string type object dependency (Bean objects as property of the current bean i.e. aggregation)
        ApplicationContext annotationAutowiringContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEditorAnnotationAutowiring textEditorAnnotationAutowiring = (TextEditorAnnotationAutowiring) annotationAutowiringContext.getBean("texteditorautowiring");
        textEditorAnnotationAutowiring.spellCheck();
    }

}
