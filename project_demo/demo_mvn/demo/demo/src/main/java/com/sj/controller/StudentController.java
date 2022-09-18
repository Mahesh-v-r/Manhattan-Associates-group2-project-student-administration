package com.sj.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.model.Application;
import com.sj.model.Course;
import com.sj.model.Payment;
import com.sj.model.Student;
import com.sj.service.StudentService;

@RestController
@RequestMapping("/admin")
public class StudentController {
@Autowired
StudentService studentService;
//view all records
@GetMapping("/students/AllStudents")
public List<Student> StudentviewAll(){
	return studentService.studentviewAll();
}
//createStudent
@PostMapping("/students/createStudent")
public Student createStudent(@RequestBody Student student) {
	return studentService.createStudent(student);
}
//getStudent
@GetMapping("/students/ById/{id}")
public Student studentGetById(@PathVariable int id) {
	return studentService.studentGetById(id);
}
//update-application
@PutMapping("/applications/updateApplication/{id}")
public Application updateApplication(@PathVariable int id,@RequestBody Application toUpdate) {
	return studentService.updateApplication(id,toUpdate);
}
//Get-Application-by-id
@GetMapping("/applications/ById/{id}")
public Application getByApplicationId(@PathVariable int id) {
	return studentService.getByApplicationId(id);
}
//create-course
@PostMapping("/courses/createCourse")
public Course createCourse(@RequestBody Course course) {
	return studentService.createCourse(course);
}
//get-course
@GetMapping("/courses/byId/{id}")
public Course courseGetById(@PathVariable int id) {
	return studentService.courseGetById(id);
	
 
}
//updating course by id
@PutMapping("/courses/update/byId/{id}")
public Course courseUpdateById(@PathVariable int id, @RequestBody Course toUpdate) {
	return studentService.courseUpdateById(id,toUpdate);
	
}
//getting payment record by id
@GetMapping("/payments/byId/{id}")
public Payment paymentGetById(@PathVariable int id) {
	return studentService.paymentGetById(id);
}

//getting application  by using status
  @GetMapping("/applications/byStatus/{Status}") public
  List<Application> getByApplicationStatus (@PathVariable String Status)
  { return studentService.getByApplicationStatus(Status); }
 
 //updating student by id
@PutMapping("/students/update/byId/{id}")
public  Student updateStudent(@PathVariable int id,@RequestBody  Student toUpdate) {
	return studentService.updateStudent(id,toUpdate);
}
//getting record using student name
@GetMapping("/students/byName/{StudentName}")
public List<Student> getByStudentName(@PathVariable  String StudentName){
	return studentService.getByStudentName(StudentName);
}
//getting record using mail
@GetMapping("/students/byMail/{StudentMail}")
public List<Student> getByStudentMail(@PathVariable  String StudentMail){
	return studentService.getByStudentMail(StudentMail);
}
//getting record using by contact
@GetMapping("/students/byContact/{StudentContact}")
public List<Student> getByStudentContact(@PathVariable  long StudentContact){
	return studentService.getByStudentContact(StudentContact);
}
//view all applications
@GetMapping("/applications/allApplications")
public List<Application> applicationviewAll(){
	return studentService.applicationviewAll();
}

}
