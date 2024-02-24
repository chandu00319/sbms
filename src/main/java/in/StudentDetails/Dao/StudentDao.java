package in.StudentDetails.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.StudentDetails.Service.Student;

public interface StudentDao  extends JpaRepository<Student, Integer>
{
	

	
}
