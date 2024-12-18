package idusw.jw202312403.blog.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface DAO {
    //DAO : Data Access Object - 데이터 소스(데이터의 출처, DBMS, XML, JSON, CSV, txt파일)를 접근하여 처리하는 객체
    Connection getConnection(); //연결 객체를 가져오는 메서드 선언
    //자원 회수 메서드 선언
    void closeResources(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet rs)
            throws SQLException;
}
