package edu.studentorder.dao;

import edu.studentorder.domain.StudentOrder;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
