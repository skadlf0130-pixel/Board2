package com.green.board2.application;

import com.green.board2.application.model.Board2PostReq;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Board2MapperImpl {
    private final DataSource dataSource;

    public Board2MapperImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public int save(Board2PostReq req) {
        String sql = "INSERT INTO board2 SET title = ?, contents = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, req.getTitle());
            pstmt.setString(2, req.getContents());

            return pstmt.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException("SQL 실행 중 오류 발생", e);
        } finally {
            close(pstmt);
            close(conn);
        }
    }

    private void close (AutoCloseable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (Exception e) {
            }
        }
    }
}

