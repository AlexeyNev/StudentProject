package edu.studentorder.dao;

import edu.studentorder.config.Config;
import edu.studentorder.domain.PassportOffice;
import edu.studentorder.domain.RegisterOffice;
import edu.studentorder.domain.Street;
import edu.studentorder.exception.DaoExeption;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImpl implements DictionaryDao {
    private static final String GET_STREET = "SELECT street_code, street_name " +
            "FROM jc_street WHERE UPPER(street_name) LIKE UPPER(?)";

    private static final String GET_PASSPORT = "SELECT * " +
            "FROM jc_passport_office WHERE p_office_area_id = ?";

    private static final String GET_REGISTER = "SELECT * " +
            "FROM jc_register_office WHERE r_office_area_id = ?";

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                Config.getProperty(Config.DB_URL),
                Config.getProperty(Config.DB_LOGIN),
                Config.getProperty(Config.DB_PASSWORD));
        return con;
    }

    public List<Street> findStreets(String pattern) throws DaoExeption {
        List<Street> result = new LinkedList<>();

        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(GET_STREET)) {

            statement.setString(1, "%" + pattern + "%");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Street str = new Street(rs.getLong("street_code"),
                        rs.getString("street_name"));
                result.add(str);
            }
        } catch (SQLException ex) {
            throw new DaoExeption(ex);
        }
        return result;
    }

    @Override
    public List<PassportOffice> findPassportOffices(String areaId) throws DaoExeption {
        List<PassportOffice> result = new LinkedList<>();

        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(GET_PASSPORT)) {

            statement.setString(1, areaId);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PassportOffice str = new PassportOffice(
                        rs.getLong("p_office_id"),
                        rs.getString("p_office_area_id"),
                        rs.getString("p_office_name"));
                result.add(str);
            }
        } catch (SQLException ex) {
            throw new DaoExeption(ex);
        }
        return result;
    }

    @Override
    public List<RegisterOffice> findRegisterOffices(String areaId) throws DaoExeption {
        List<RegisterOffice> result = new LinkedList<>();

        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(GET_REGISTER)) {

            statement.setString(1, areaId);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                RegisterOffice str = new RegisterOffice(
                        rs.getLong("r_office_id"),
                        rs.getString("r_office_area_id"),
                        rs.getString("r_office_name"));
                result.add(str);
            }
        } catch (SQLException ex) {
            throw new DaoExeption(ex);
        }
        return result;
    }
}