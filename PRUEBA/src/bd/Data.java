/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import model.Asignatura;
import model.Calificacion;
import model.Profesor;

/**
 *
 * @author User
 */
public class Data {

    private Conexion con;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("colegio");
    }

    public String getNombreProfesor(String rut, String pass) throws SQLException {
        String nombre = null;

        String query = "SELECT nombre FROM profesor WHERE rut = '" + rut + "' AND pass = '" + pass + "';";

        ResultSet rs = con.ejecutar(query);

        if (rs.next()) {
            nombre = rs.getString(1);
        }

        con.close();

        return nombre;
    }

    public List<Profesor> getProfesores() throws SQLException {

        List<Profesor> lista = new ArrayList<>();

        String query = "SELECT * FROM profesor;";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Profesor pro = new Profesor();

            pro.setId(rs.getInt(1));
            pro.setNombre(rs.getString(2));
            pro.setApellido(rs.getString(3));
            pro.setRut(rs.getString(4));
            pro.setPass(rs.getString(5));
            pro.setEmail(rs.getString(6));
            pro.setAsignatura(rs.getString(7));

            lista.add(pro);
        }

        con.close();

        return lista;

    }

    public String getAsignaturaProfesor(String rut) throws SQLException {

        String nombre = null;

        String query = "SELECT asignatura.nombre "
                + "FROM profesor "
                + "INNER JOIN asignatura "
                + "ON asignatura.id = profesor.asignatura_id_fk WHERE rut = '" + rut + "'; ";

        ResultSet rs = con.ejecutar(query);

        if (rs.next()) {
            nombre = rs.getString(1);

        }
        con.close();

        return nombre;
    }

    public List<Alumno> getAlumnos() throws SQLException {
        List<Alumno> lista = new ArrayList<>();

        String query = "SELECT alumno.id, alumno.nombre_completo, alumno.rut, alumno.telefono, curso.curso "
                + "FROM alumno INNER JOIN curso ON curso.id = alumno.curso_id_fk;";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Alumno a = new Alumno();

            a.setId(rs.getInt(1));
            a.setNombre(rs.getString(2));
            a.setRut(rs.getString(3));
            a.setTelefono(rs.getInt(4));
            a.setCurso(rs.getString(5));

            lista.add(a);
        }
        con.close();

        return lista;
    }

    public List<Calificacion> getCalificaciones() throws SQLException {
        List<Calificacion> lista = new ArrayList<>();

        String query = "SELECT calificacion.id, alumno.nombre_completo, asignatura.nombre, calificacion.nota "
                + "FROM calificacion "
                + "INNER JOIN alumno "
                + "ON alumno.id = calificacion.alumno_id_fk "
                + "INNER JOIN asignatura "
                + "ON asignatura.id = calificacion.asignatura_id_fk";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {

            Calificacion c = new Calificacion();

            c.setId(rs.getInt(1));
            c.setAlumno(rs.getString(2));
            c.setAsignatura(rs.getString(3));
            c.setNota(rs.getFloat(4));

            lista.add(c);
        }

        con.close();

        return lista;
    }

    public Calificacion getAlumnoByNombre(String id) throws SQLException {
        Calificacion c = null;

        String query = "";

        ResultSet rs = con.ejecutar(query);

        if (rs.next()) {

            c = new Calificacion();

            c.setNombre_trabajo(rs.getString(1));
            c.setNota(rs.getFloat(2));
            c.setAsignatura(rs.getString(3));
            c.setAlumno(rs.getString(4));
        }
        con.close();

        return c;
    }

    public Alumno getRutAlumno(String id) throws SQLException {
        Alumno a = null;

        ResultSet rs = con.ejecutar("SELECT rut FROM alumno WHERE id = '" + id + "'");

        if (rs.next()) {

            a = new Alumno();

            a.setRut(rs.getString(1));
        }
        con.close();

        return a;
    }

    public void crearNuevaNota(String a) throws SQLException {

        String insert = "ALTER TABLE calificacion ADD " + a + " INT;";

        con.ejecutar(insert);
    }
}
