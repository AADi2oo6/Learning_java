import java.sql.*;
import java.util.Scanner;

public class Assignment7 {

    // Database connection details. Assumes a database named 'school_db'
    private static final String URL = "jdbc:mysql://localhost:3306/school_db?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "202510"; // CHANGE THIS!

    // Private method to get connection
    private static Connection getConnection() throws Exception {
        // 1. Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. Get the connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // INSERT a new student record
    private static void insertStudent() {
        String sql = "INSERT INTO students (roll_no, name, percentage) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name (e.g., Rohan, Priya): ");
            String name = sc.nextLine();
            System.out.print("Enter Percentage: ");
            double percentage = sc.nextDouble();

            ps.setInt(1, rollNo);
            ps.setString(2, name);
            ps.setDouble(3, percentage);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY all student records
    private static void displayStudents() {
        String sql = "SELECT * FROM students";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- All Student Records ---");
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.printf("Roll No: %d | Name: %s | Percentage: %.2f%%%n",
                        rs.getInt("roll_no"),
                        rs.getString("name"),
                        rs.getDouble("percentage"));
            }
            if (!found) {
                System.out.println("No records found.");
            }
            System.out.println("---------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE a student's percentage by roll_no
    private static void updateStudentPercentage() {
        String sql = "UPDATE students SET percentage = ? WHERE roll_no = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to update: ");
            int rollNo = sc.nextInt();
            System.out.print("Enter new Percentage: ");
            double newPercentage = sc.nextDouble();

            ps.setDouble(1, newPercentage);
            ps.setInt(2, rollNo);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated!");
            } else {
                System.out.println("No student found with that Roll No.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE a student record by roll_no
    private static void deleteStudent() {
        String sql = "DELETE FROM students WHERE roll_no = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to delete: ");
            int rollNo = sc.nextInt();

            ps.setInt(1, rollNo);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted!");
            } else {
                System.out.println("No student found with that Roll No.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Student Database Menu ===");
            System.out.println("1. Add New Student (Insert)");
            System.out.println("2. Show All Students (Display)");
            System.out.println("3. Update Student Percentage (Update)");
            System.out.println("4. Remove Student (Delete)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    updateStudentPercentage();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
