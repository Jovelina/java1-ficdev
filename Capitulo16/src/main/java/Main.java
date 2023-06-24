
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[]args) {
        
StudentDao studDao = new StudentDaoImpl();
// Exemplo de uso do DAO
Student stud= studDao.findById(1);
stud.setName("João");
studDao.update(stud);
List<Student> studList = studDao.findAll();
for (Student s : studList) {
System.out.println(s.getName());
} 
}    
}
