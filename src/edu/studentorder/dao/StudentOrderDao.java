package edu.studentorder.dao;

import edu.studentorder.domain.StudentOrder;

import java.util.List;

public interface StudentOrderDao
{
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
