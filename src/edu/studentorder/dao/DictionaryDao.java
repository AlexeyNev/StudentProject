package edu.studentorder.dao;

import edu.studentorder.domain.CountryArea;
import edu.studentorder.domain.PassportOffice;
import edu.studentorder.domain.RegisterOffice;
import edu.studentorder.domain.Street;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws  DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;
}
