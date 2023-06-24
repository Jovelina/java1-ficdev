
import static java.lang.ProcessBuilder.Redirect.from;
import static java.lang.management.LockInfo.from;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Timestamp.from;
import static java.util.Date.from;
import java.util.List;
import javax.sql.DataSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
class StudentDao {
    
    private DataSource ds;
public void setDataSource(DataSource ds) {
this.ds = ds;
}
public Student findByNameStudent(String string) {
Connection con = null;
PreparedStatement ps = null;
try {
con = ds.getConnection();
ps = con.prepareStatement( ̈select * from estudante where
nome_estudante = ? ̈);
ps.setString(1, string);
ResultSet rs = ps.executeQuery();
if (rs.next()) {
Student stud = new Student();
stud.setId(rs.getInt(ïd ̈));
stud.setNameStudent(rs.getString(nome_estudante  ̈
 ̈));

stud.setCity(rs.getString( ̈cidade ̈));
return stud;
}else { return null; }
} catch (SQLException e) {
e.printStackTrace();
throw new RuntimeException(e);
} finally { if (con != null) {
try { con.close();
} catch (SQLException e) {
e.printStackTrace(); } } } }

    Student findById(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void update(Student stud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
}
