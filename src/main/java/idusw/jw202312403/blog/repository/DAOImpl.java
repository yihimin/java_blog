package idusw.jw202312403.blog.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOImpl implements DAO {
    @Override
    public Connection getConnection() {
        Connection conn = null;
        // DB 연결을 위한 정보
        String jdbcUrl = "jdbc:mysql://localhost:3306/blog_db";
        String dbUser = "blog_db";
        String dbPw = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로딩
            conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPw);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void closeResources(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet rs) throws SQLException {
        if (conn != null) conn.close();
        if (stmt != null) stmt.close();
        if (pstmt != null) pstmt.close();
        if (rs != null) rs.close();
    }
}
