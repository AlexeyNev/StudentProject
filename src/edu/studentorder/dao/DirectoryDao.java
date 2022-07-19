package edu.studentorder.dao;

import edu.studentorder.domain.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao {
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres", "As147846");
        return con;
    }

    public List<Street> findStreets(String pattern) throws Exception {
        List<Street> result = new LinkedList<>();
        Connection con = getConnection();
        Statement statement = con.createStatement();
        String sql = "SELECT street_code, street_name " +
                "FROM jc_street WHERE UPPER(street_name) LIKE UPPER('%" + pattern + "%')";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
            result.add(str);
        }
        return result;
    }
}
