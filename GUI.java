public class GUI {
    public void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Buy Course");
        System.out.println("2. Add students");
        System.out.println("3. Add material to the course");
        System.out.println("4. Download the information about Online Course Platform");
        System.out.println("5. Exit");
    }
    public void showCourses() {
        System.out.println("\nChoose a course:");
        System.out.println("1. Calculus");
        System.out.println("2. Python Programming");
        System.out.println("3. Web Development");
        System.out.println("4. Exit");
    }
    public void showPaymentMethods() {
        System.out.println("\nHow will you pay?");
        System.out.println("1. Kaspi Pay");
        System.out.println("2. Halyk Pay");
        System.out.println("3. Qiwi Pay");
        System.out.println("4. Exit");
    }
    public void showFormats() {
        System.out.println("\nSelect the format in which you want to take the course:");
        System.out.println("1. Video Format");
        System.out.println("2. Text Format");
    }
    public void showVariants() {
        System.out.println("\nHow do you want to save:");
        System.out.println("1. TXT");
        System.out.println("2. HTML");
    }
}
