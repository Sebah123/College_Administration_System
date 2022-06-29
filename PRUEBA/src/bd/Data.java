/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import model.Anotacion;
import model.Asignatura;
import model.Calificacion;
import model.Citacion;
import model.Curso;
import model.Profesor;
import model.Reunion;
import model.Tarea;
import model.TipoAnotacion;

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

    public Profesor getPassProfesor(String pass) throws SQLException {
        Profesor p = null;

        ResultSet rs = con.ejecutar("SELECT count(nombre) FROM profesor WHERE rut = '" + pass + "';");

        if (rs.next()) {

            p = new Profesor();

            p.setNombre(rs.getString(1));
        }
        con.close();

        return p;
    }

    public List<Tarea> getTareas() throws SQLException {
        List<Tarea> lista = new ArrayList<>();

        String query = "SELECT tarea.id, tarea.titulo, tarea.descripcion, asignatura.nombre, estado_tarea.estado "
                + "FROM tarea INNER JOIN asignatura ON asignatura.id = tarea.asignatura_id_fk "
                + "INNER JOIN estado_tarea ON estado_tarea.id = tarea.estado_id_fk;";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Tarea t = new Tarea();

            t.setId(rs.getInt(1));
            t.setTitulo(rs.getString(2));
            t.setDescripcion(rs.getString(3));
            t.setAsignatura(rs.getString(4));
            t.setEstado(rs.getString(5));

            lista.add(t);

        }

        con.close();

        return lista;
    }

    public List<Reunion> getReunion() throws SQLException {
        List<Reunion> lista = new ArrayList<>();
        String query = "SELECT reunion.id , curso.curso , reunion.fecha FROM reunion "
                + "INNER JOIN curso ON curso.id = reunion.curso_id_fk;";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Reunion r = new Reunion();
            r.setId(rs.getInt(1));
            r.setCurso(rs.getString(2));
            r.setHora(rs.getString(3));

            lista.add(r);
        }
        con.close();
        return lista;

    }

    public List<Citacion> getCitacion() throws SQLException {
        List<Citacion> lista = new ArrayList<>();
        String query = "SELECT citacion.id, curso.curso, alumno.nombre_completo,"
                + "citacion.razon, citacion.descripcion, citacion.fecha "
                + "FROM citacion "
                + "INNER JOIN curso "
                + "ON curso.id = citacion.curso_id_fk "
                + "INNER JOIN alumno "
                + "ON alumno.id = citacion.alumno_id_fk "
                + "ORDER BY citacion.id;";
        ResultSet rs = con.ejecutar(query);
        while(rs.next()){
            Citacion c = new Citacion();
            
            c.setId(rs.getInt(1));
            c.setCurso(rs.getString(2));
            c.setAlumno(rs.getString(3));
            c.setRazon(rs.getString(4));
            c.setDescripcion(rs.getString(5));
            c.setFecha(rs.getString(6));
            
            lista.add(c);
        }
        con.close();
        return lista;

    }

    public Tarea getTareaByID(String id) throws SQLException {
        Tarea t = null;

        String query = "SELECT tarea.id, tarea.titulo, tarea.descripcion, asignatura.nombre, estado_tarea.estado "
                + "FROM tarea INNER JOIN asignatura ON asignatura.id = tarea.asignatura_id_fk "
                + "INNER JOIN estado_tarea ON estado_tarea.id = tarea.estado_id_fk "
                + "WHERE tarea.id = " + id + "";

        ResultSet rs = con.ejecutar(query);

        if (rs.next()) {
            t = new Tarea();

            t.setId(rs.getInt(1));
            t.setTitulo(rs.getString(2));
            t.setDescripcion(rs.getString(3));
            t.setAsignatura(rs.getString(4));
            t.setEstado(rs.getString(5));
        }
        con.close();

        return t;
    }

    public List<Tarea> getEstadoTarea() throws SQLException {
        List<Tarea> lista = new ArrayList<>();

        ResultSet rs = con.ejecutar("SELECT estado FROM estado_tarea");

        while (rs.next()) {
            Tarea t = new Tarea();

            t.setEstado(rs.getString(1));

            lista.add(t);
        }
        con.close();
        return lista;

    }

    public List<Tarea> getEstadoTareaByID(String id) throws SQLException {
        List<Tarea> lista = new ArrayList<>();

        ResultSet rs = con.ejecutar("SELECT estado FROM estado_tarea WHERE id = " + id + "");

        while (rs.next()) {
            Tarea t = new Tarea();

            t.setEstado(rs.getString(1));

            lista.add(t);
        }
        con.close();
        return lista;

    }

    public void crearTarea(Tarea t) throws SQLException {
        String insert = "insert into tarea values(null,"
                + "'" + t.getTitulo() + "','" + t.getDescripcion() + "',"
                + "(SELECT id FROM asignatura WHERE nombre = '" + t.getAsignatura() + "'),"
                + "(SELECT id FROM estado_tarea WHERE estado = '" + t.getEstado() + "'))";
        con.ejecutar(insert);
    }

    public void crearAnotacion(Anotacion a) throws SQLException {
        String insert = "insert into anotacion values(null,"
                + "(SELECT id FROM tipo_anotacion WHERE nombre = '" + a.getTipo() + "'),"
                + "(SELECT id FROM curso WHERE curso = '" + a.getCurso() + "'),"
                + "(SELECT id FROM alumno WHERE nombre_completo = '" + a.getAlumno() + "'),"
                + "'" + a.getDescripcion() + "',"
                + "'" + a.getA() + "')";
        con.ejecutar(insert);
    }

    public void eliminarTarea(int id) throws SQLException {
        String delete = "DELETE FROM tarea WHERE id = " + id + "";
        con.ejecutar(delete);
    }

    public void eliminarAnotacion(int id) throws SQLException {
        String delete = "DELETE FROM anotacion WHERE id = " + id + "";
        con.ejecutar(delete);
    }

    public void editarTarea(Tarea t) throws SQLException {
        String update = "UPDATE tarea "
                + "SET titulo = '" + t.getTitulo() + "', "
                + "descripcion = '" + t.getDescripcion() + "', "
                + "asignatura_id_fk = (SELECT id FROM asignatura WHERE nombre = '" + t.getAsignatura() + "'), "
                + "estado_id_fk = (SELECT id FROM estado_tarea WHERE estado = '" + t.getEstado() + "')"
                + "WHERE id = " + t.getId() + " ";
        con.ejecutar(update);
    }

    public void editarAnotacion(Anotacion a) throws SQLException {
        String update = "UPDATE anotacion SET "
                + "tipo_id_fk = (SELECT id FROM tipo_anotacion WHERE nombre = '" + a.getTipo() + "'), "
                + "curso_id_fk = (SELECT id FROM curso WHERE curso = '" + a.getCurso() + "'), "
                + "alumno_id_fk = (SELECT id FROM alumno WHERE nombre_completo = '" + a.getAlumno() + "'), "
                + "descripcion =  '" + a.getDescripcion() + "', "
                + "fecha = '" + a.getA() + "' "
                + "WHERE anotacion.id = '" + a.getId() + "'";
        con.ejecutar(update);
    }

    public List<TipoAnotacion> getAnotacionByNombre() throws SQLException {
        List<TipoAnotacion> lista = new ArrayList<>();

        ResultSet rs = con.ejecutar("SELECT nombre FROM tipo_anotacion");

        while (rs.next()) {
            TipoAnotacion t = new TipoAnotacion();

            t.setNombre(rs.getString(1));

            lista.add(t);
        }
        con.close();
        return lista;
    }

    public List<Anotacion> getAnotacion() throws SQLException {
        List<Anotacion> lista = new ArrayList<>();

        String query = "SELECT anotacion.id, tipo_anotacion.nombre, curso.curso, alumno.nombre_completo, anotacion.descripcion, anotacion.fecha FROM anotacion "
                + "INNER JOIN tipo_anotacion ON tipo_anotacion.id = anotacion.tipo_id_fk "
                + "INNER JOIN curso ON curso.id = anotacion.curso_id_fk "
                + "INNER JOIN alumno ON alumno.id = anotacion.alumno_id_fk "
                + "ORDER BY anotacion.id";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Anotacion a = new Anotacion();

            a.setId(rs.getInt(1));
            a.setTipo(rs.getString(2));
            a.setCurso(rs.getString(3));
            a.setAlumno(rs.getString(4));
            a.setDescripcion(rs.getString(5));
            a.setA(rs.getDate(6));

            lista.add(a);
        }

        con.close();
        return lista;

    }

    public List<Anotacion> getAnotacionByID(String id) throws SQLException {
        List<Anotacion> lista = new ArrayList<>();

        ResultSet rs = con.ejecutar("SELECT anotacion.id , tipo_anotacion.nombre, curso.curso,  alumno.nombre_completo, anotacion.descripcion, anotacion.fecha "
                + "FROM anotacion "
                + "INNER JOIN tipo_anotacion "
                + "ON tipo_anotacion.id = anotacion.tipo_id_fk "
                + "INNER JOIN alumno "
                + "ON alumno.id = anotacion.alumno_id_fk "
                + "INNER JOIN curso "
                + "ON curso.id = anotacion.curso_id_fk "
                + "WHERE anotacion.id = '" + id + "'");

        while (rs.next()) {
            Anotacion a = new Anotacion();

            a.setId(rs.getInt(1));
            a.setTipo(rs.getString(2));
            a.setCurso(rs.getString(3));
            a.setAlumno(rs.getString(4));
            a.setDescripcion(rs.getString(5));
            a.setA(rs.getDate(6));

            lista.add(a);
        }

        con.close();
        return lista;

    }

    public Anotacion getAnotacionByID2(String id) throws SQLException {
        Anotacion a = null;

        ResultSet rs = con.ejecutar("SELECT anotacion.id , tipo_anotacion.nombre, curso.curso,  alumno.nombre_completo, anotacion.descripcion, anotacion.fecha "
                + "FROM anotacion "
                + "INNER JOIN tipo_anotacion "
                + "ON tipo_anotacion.id = anotacion.tipo_id_fk "
                + "INNER JOIN alumno "
                + "ON alumno.id = anotacion.alumno_id_fk "
                + "INNER JOIN curso "
                + "ON curso.id = anotacion.curso_id_fk "
                + "WHERE anotacion.id = '" + id + "'"
                + "ORDER BY anotacion.id");

        if (rs.next()) {
            a = new Anotacion();

            a.setId(rs.getInt(1));
            a.setTipo(rs.getString(2));
            a.setCurso(rs.getString(3));
            a.setAlumno(rs.getString(4));
            a.setDescripcion(rs.getString(5));
            a.setA(rs.getDate(6));
        }
        con.close();

        return a;
    }

    public List<Curso> getCurso() throws SQLException {
        List<Curso> lista = new ArrayList<>();

        ResultSet rs = con.ejecutar("SELECT curso FROM curso");

        while (rs.next()) {
            Curso c = new Curso();

            c.setNombre(rs.getString(1));
            lista.add(c);
        }
        con.close();
        return lista;
    }

    public List<Alumno> getAlumnoByCurso(String id) throws SQLException {
        List<Alumno> lista = new ArrayList<>();

        String query = "SELECT nombre_completo "
                + "FROM alumno "
                + "WHERE curso_id_fk = (SELECT id FROM curso WHERE curso = '" + id + "')";

        ResultSet rs = con.ejecutar(query);

        while (rs.next()) {
            Alumno a = new Alumno();

            a.setNombre(rs.getString(1));

            lista.add(a);
        }

        con.close();
        return lista;
    }

}
