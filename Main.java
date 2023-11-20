import Adapter.DownloadMaterial;
import Adapter.DownloadMaterialToHtmlAdapter;
import Adapter.DownloadMaterialToTxt;
import Adapter.HTMLDownloader;
import Factory.*;
import Decorator.*;
import Strategy.*;
import Observer.*;
import Singleton.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        boolean isAuthenticated = userManager.authenticateUser("admin", "123456");

        GUI gui = new GUI();
        Scanner scanner = new Scanner(System.in);
        if (isAuthenticated) {
            System.out.println("Welcome to the Online Course Platform!");
            while (true) {
                gui.showMenu();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        gui.showCourses();
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            gui.showPaymentMethods();
                            System.out.print("Enter your choice: ");
                            choice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter your credit card: ");
                            String card = scanner.nextLine();
                            switch (choice) {
                                case 1:
                                    PaymentStrategy paymentStrategy = new KaspiPayStrategy(card);
                                    PaymentContext paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    CourseFactory courseFactory = new CalculusCourseFactory();
                                    Course calculusCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(calculusCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(calculusCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 2:
                                    paymentStrategy = new HalykPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new CalculusCourseFactory();
                                    calculusCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(calculusCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(calculusCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 3:
                                    paymentStrategy = new QiwiPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new CalculusCourseFactory();
                                    calculusCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(calculusCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(calculusCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 4:
                                    System.out.println("Exiting the program. Goodbye!");
                                    System.exit(0);
                            }
                        }
                        if (choice == 2) {
                            gui.showPaymentMethods();
                            System.out.print("Enter your choice: ");
                            choice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter your credit card: ");
                            String card = scanner.nextLine();
                            switch (choice) {
                                case 1:
                                    PaymentStrategy paymentStrategy = new KaspiPayStrategy(card);
                                    PaymentContext paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    CourseFactory courseFactory = new PythonCourseFactory();
                                    Course pythonCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(pythonCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(pythonCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 2:
                                    paymentStrategy = new HalykPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new PythonCourseFactory();
                                    pythonCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(pythonCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(pythonCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 3:
                                    paymentStrategy = new QiwiPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new PythonCourseFactory();
                                    pythonCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(pythonCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(pythonCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 4:
                                    System.out.println("Exiting the program. Goodbye!");
                                    System.exit(0);
                            }
                        }
                        if (choice == 3) {
                            gui.showPaymentMethods();
                            System.out.print("Enter your choice: ");
                            choice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter your credit card: ");
                            String card = scanner.nextLine();
                            switch (choice) {
                                case 1:
                                    PaymentStrategy paymentStrategy = new KaspiPayStrategy(card);
                                    PaymentContext paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    CourseFactory courseFactory = new WebDevelopmentCourseFactory();
                                    Course webCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(webCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(webCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 2:
                                    paymentStrategy = new HalykPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new WebDevelopmentCourseFactory();
                                    webCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(webCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(webCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 3:
                                    paymentStrategy = new QiwiPayStrategy(card);
                                    paymentContext = new PaymentContext(paymentStrategy);
                                    paymentContext.executePayment(100);
                                    courseFactory = new WebDevelopmentCourseFactory();
                                    webCourse = courseFactory.createCourse();

                                    gui.showFormats();
                                    System.out.print("Enter your choice: ");
                                    choice = scanner.nextInt();
                                    if (choice == 1) {
                                        Course videoDecorator = new VideoCourseDecorator(webCourse);
                                        videoDecorator.enroll();
                                    } else if (choice == 2) {
                                        Course textDecorator = new TextCourseDecorator(webCourse);
                                        textDecorator.enroll();
                                    }
                                    break;
                                case 4:
                                    System.out.println("Exiting the program. Goodbye!");
                                    System.exit(0);
                            }
                        }
                        if (choice == 4) {
                            System.out.println("Exiting the program. Goodbye!");
                            System.exit(0);
                        }
                        break;
                    case 2:
                        System.out.println("How many students do you want to add: ");
                        int students = scanner.nextInt();
                        scanner.nextLine();

                        CourseSubject courseSubject = new CourseSubject();
                        String studentName;
                        for (int i = 0; i < students; i++) {
                            System.out.println("Student name: ");
                            studentName = scanner.nextLine();
                            courseSubject.addObserver(new Student(studentName));
                        }
                        courseSubject.notifyObservers("Welcome!");
                        break;
                    case 3:
                        break;
                    case 4:
                        gui.showVariants();
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            DownloadMaterial downloader = new DownloadMaterialToTxt("C:\\Users\\tleuk\\IdeaProjects\\Final_Project\\src\\courseinformation.txt");
                            downloader.saveMaterial();
                        } else if (choice == 2) {
                            DownloadMaterial downloader = new DownloadMaterialToHtmlAdapter(new HTMLDownloader("C:\\Users\\tleuk\\IdeaProjects\\Final_Project\\src\\courseinformation.html"));
                            downloader.saveMaterial();
                        }
                        break;
                    case 5:
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Authentication failed");
        }
    }
}