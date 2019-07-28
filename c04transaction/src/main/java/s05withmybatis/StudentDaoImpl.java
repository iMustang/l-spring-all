package s05withmybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * title: StudentDaoImpl
 * description:
 */
@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao
{
    private static final String NAMESPACE = "StudentMapper.";

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List<Student> selectAllStudents()
    {
        return getSqlSession().selectList(NAMESPACE + "selectAllStudents");
    }

    public int insertStudent(Student student)
    {
        return getSqlSession().insert(NAMESPACE + "insertStudent", student);
    }
}