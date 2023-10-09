public class StudentDerivationFromPerson {
   public static void main(String[] args) {
      Student courseStudent = new Student();
      
      // Assign values to the student object
      courseStudent.setName("Smith");
      courseStudent.setAge(20);
      courseStudent.setID(9999);
      
      // Use printAll() to print the student's data
      courseStudent.printAll();
      
      // Use a separate println() statement for formatting
      System.out.println(", ID: " + courseStudent.getID()); // Add a newline after printing student data
   }
}

