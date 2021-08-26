package repository;

import model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IStudentRepo  extends PagingAndSortingRepository<Student,Long> {
}
