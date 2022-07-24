package edu.studentorder.dao;

import edu.studentorder.domain.PassportOffice;
import edu.studentorder.domain.Street;
import edu.studentorder.exception.DaoExeption;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoExeption;
    List<PassportOffice> findPassportOffices(String pattern) throws DaoExeption;
}
