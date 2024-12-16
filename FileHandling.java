import java.io.*;
import java.util.*;

class Student {
    int studentId;
    String name;
    int rollNo;
    String className;
    int marks;
    String address;

    // Convert Student object to a CSV string

    //it convert object to string for storing the file 
    public String toString() {
        return studentId + "," + name + "," + rollNo + "," + className + "," + marks + "," + address;
    }

    //it convert stirng to object  for reading the file 
    public static Student fromString(String line) {
        String[] parts = line.split(",");
        Student student = new Student();
        student.studentId = Integer.parseInt(parts[0]);
        student.name = parts[1];
        student.rollNo = Integer.parseInt(parts[2]);
        student.className = parts[3];
        student.marks = Integer.parseInt(parts[4]);
        student.address = parts[5];
        return student;
    }
}

public class FileHandling{

    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Database Management System");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Search Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> createDatabase(sc);
                    case 2 -> displayDatabase();
                    case 3 -> searchRecord(sc);
                    case 4 -> deleteRecord(sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid option! Please try again.");
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    // Create or append to the database
    private static void createDatabase(Scanner sc) throws IOException {
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            for (int i = 0; i < n; i++) {
                Student student = getStudentDetails(sc, i + 1);
                bw.write(student.toString());
                bw.newLine();
            }
        }
        System.out.println("Database updated successfully!");
    }

    // Display all student records
    private static void displayDatabase() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\nStudent Records:");
            String line;
            while((line=br.readLine())!=null){
                System.out.println(""+line);
            }
        }
    }

 // Search for a student by ID
    private static void searchRecord(Scanner sc) throws IOException {
        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                Student student = Student.fromString(line);
                if (student.studentId == searchId) {
                    System.out.println("Record found: " + line);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Record not found.");
            }
        }
    }


    // Delete a student record by ID
    private static void deleteRecord(Scanner sc) throws IOException {
        System.out.print("Enter Student ID to delete: ");
        int deleteId = sc.nextInt();

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        boolean deleted = false;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            String line; 
            while((line = br.readLine()) != null)  {
                Student student = Student.fromString(line);
                if (student.studentId == deleteId) {
                    deleted = true;
                    System.out.println("Record deleted: " + student);
                    continue;
                } else {
                    bw.write(line);
                    bw.newLine();
                }
            }
        }

        if (deleted) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Record deleted successfully!");
        } else {
            tempFile.delete();
            System.out.println("Record not found.");
        }
    }

    // Helper method to get student details
    private static Student getStudentDetails(Scanner sc, int index) {
        Student student = new Student();
        System.out.println("\nEnter details for student " + index + ":");
        System.out.print("Student ID: ");
        student.studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        student.name = sc.nextLine(); 
        System.out.print("Roll No: ");
        student.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Class: ");
        student.className = sc.nextLine();
        System.out.print("Marks: ");
        student.marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        student.address = sc.nextLine();
        return student;
}
}