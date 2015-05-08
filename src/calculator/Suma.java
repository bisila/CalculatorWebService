package calculator;

import java.util.Scanner;
public class Suma {

    public static void main(String[] args) {
        System.out.println(hello("tu nombre"));
        System.out.println(suma(5, 5));
        System.out.println(substraction(3, 8));
        System.out.println(division(10, 2));
        System.out.println(multiplication(5, 3));
    }

    private static String hello(java.lang.String name) {
        package2.Service_Service service = new package2.Service_Service();
        package2.Service port = service.getServicePort();
        return port.hello(name);
    }

    private static int suma(int num1, int num2) {
        package2.Service_Service service = new package2.Service_Service();
        package2.Service port = service.getServicePort();
        return port.suma(num1, num2);
    }

    private static int substraction(int parameter1, int parameter2) {
        package2.Service_Service service = new package2.Service_Service();
        package2.Service port = service.getServicePort();
        return port.substraction(parameter1, parameter2);
    }

    private static int multiplication(int num1, int num2) {
        package2.Service_Service service = new package2.Service_Service();
        package2.Service port = service.getServicePort();
        return port.multiplication(num1, num2);
    }

    private static int division(int num1, int num2) {
        package2.Service_Service service = new package2.Service_Service();
        package2.Service port = service.getServicePort();
        return port.division(num1, num2);
    }

}
