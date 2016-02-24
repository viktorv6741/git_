package jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String... args) throws MalformedObjectNameException, CloneNotSupportedException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {

        Circle circle = new Circle(1, new Circle(3));

        circle.createObjectFromBaseEntity();
        System.out.println(circle.getInformationAboutObject());

        initCircleJMX(circle);

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void initCircleJMX(Circle circle) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();

        CircleMBean circleMBean = circle;
        ObjectName name = new ObjectName("CircleMBean:name=circle");
        platformMBeanServer.registerMBean(circleMBean, name);

        while (true) ;
    }
}
