package dao;

import models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements DAO<Student> {
    @Override
    public Student get(long id) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from student_book where id = ?"
            );
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(
                        rs.getLong(1), rs.getString(2), rs.getString(3)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public List<Student> getByLikePattern(String pattern) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from student_book where name like ?"
            );
            ps.setString(1, "%" + pattern + "%");
            ResultSet rs = ps.executeQuery();
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                students.add(new Student(
                        rs.getLong(1), rs.getString(2), rs.getString(3)
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from student_book"
            );
            ResultSet rs = ps.executeQuery();
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                students.add(new Student(
                        rs.getLong(1), rs.getString(2), rs.getString(3)
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public void save(Student x) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "insert into student_book(name, photo_path) values (?, ?)"
            );
            ps.setString(1, x.getName());
            ps.setString(2, x.getPhotoPath());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    @Override
    public void update(Student student, String[] params) {

    }

    @Override
    public void delete(long id) {

    }
}
