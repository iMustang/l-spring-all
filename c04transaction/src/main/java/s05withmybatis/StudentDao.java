package s05withmybatis;

import java.util.List;

/**
 * title: StudentDao
 * description:
 */
public interface StudentDao {
    List<Student> selectAllStudents();

    int insertStudent(Student student);
}
