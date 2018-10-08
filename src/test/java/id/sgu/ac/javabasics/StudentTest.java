package id.sgu.ac.javabasics;

import static org.junit.Assert.*;
public class StudentTest {

 public void testAdultPrice() {
  Student student = new Student();
  String studentName = student.displayStudentName("Anshuman", "Nain");
  
  assertEquals("AnshumanNain", studentName);
 }
}
