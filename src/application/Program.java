package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char resp = sc.next().charAt(0);
            if (resp == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                shapes.add(shape);
            }
            else if (resp == 'c') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());

                System.out.print("radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);
                shapes.add(shape);
            }
        }

        System.out.println("SHAPES AREAS:");
        for (Shape s : shapes) {
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();
    }
}
