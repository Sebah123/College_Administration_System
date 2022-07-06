package gui;

import bd.Data;
import java.awt.event.KeyEvent;
import static java.lang.Integer.getInteger;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import model.Alumno;
import model.Anotacion;
import model.Calificacion;
import model.Citacion;
import model.Curso;
import model.Reunion;
import model.Tarea;
import model.TipoAnotacion;
import tableModel.TMAlumno;
import tableModel.TMAnotacion;
import tableModel.TMCalificacion;
import tableModel.TMCitacion;
import tableModel.TMReunion;
import tableModel.TMTarea;

public class App extends javax.swing.JFrame {

    private Data d;
    Fechapro f = new Fechapro();

    public App() {
        initComponents();
        //cargarCBCEstado();
        cargarLabels();

        try {
            d = new Data();
        } catch (ClassNotFoundException ex) {
            System.out.println("123123123");
        } catch (SQLException ex) {
            System.out.println("SADFASDFASDF");
        }
        setLocationRelativeTo(null);
        setTitle("Software Colegio");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formMenu = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        btnNotas = new javax.swing.JButton();
        btnGeneral = new javax.swing.JButton();
        btnTareas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblProfesor = new javax.swing.JLabel();
        lblAsignaturaMenuPrincipal = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblFechaMenuPrincipal = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblHoraMenuPrincipal = new javax.swing.JLabel();
        formNotas = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        cbcCurso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlumnos = new javax.swing.JTable();
        btnIngresar = new javax.swing.JButton();
        formTareas = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdTarea = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionTarea = new javax.swing.JTextArea();
        txtAsignaturaTarea = new javax.swing.JTextField();
        cbcEstado = new javax.swing.JComboBox<>();
        btnCancelarTarea = new javax.swing.JButton();
        btnRegistrarTarea = new javax.swing.JButton();
        btnEditarTarea = new javax.swing.JButton();
        btnEliminarTarea = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        cbcCursoTarea = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabTarea = new javax.swing.JTable();
        txtBuscarTarea = new javax.swing.JTextField();
        formMenuGeneral = new javax.swing.JFrame();
        btnAnotaciones = new javax.swing.JButton();
        btnCitaciones = new javax.swing.JButton();
        btnReuniones = new javax.swing.JButton();
        btnVolverMenú = new javax.swing.JButton();
        formCitaciones = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtRazonCitacion = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescripcionCitacion = new javax.swing.JTextArea();
        btnCancelarCitacion = new javax.swing.JButton();
        btnRegistrarCitacion = new javax.swing.JButton();
        btnEditarCitacion = new javax.swing.JButton();
        btnBorrarCitacion = new javax.swing.JButton();
        cbcCursoCitacion = new javax.swing.JComboBox<>();
        cbcAlumnoCitacion = new javax.swing.JComboBox<>();
        jFechaCitacion = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabCitacion = new javax.swing.JTable();
        txtBuscarCitacion = new javax.swing.JTextField();
        formAnotacion = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabAnotacion = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtIDAnotacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbcAnotacion = new javax.swing.JComboBox<>();
        cbcAlumnoAnotacion = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescripcionAnotacion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btnRegistrarAnotacionn = new javax.swing.JButton();
        btnCancelarAnotacion = new javax.swing.JButton();
        btnEliminarAnotacion = new javax.swing.JButton();
        btnEditarAnotacion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cbcCursoAnotacion = new javax.swing.JComboBox<>();
        jFechaAnotacion = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtBuscarAnotacion = new javax.swing.JTextField();
        formReunion = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabReunion = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnAgregarReunion = new javax.swing.JButton();
        btnEliminarReunion = new javax.swing.JButton();
        btnCancelarReunion = new javax.swing.JButton();
        btnEditarReunion = new javax.swing.JButton();
        txtIDReunion = new javax.swing.JTextField();
        cbcCursoReunion = new javax.swing.JComboBox<>();
        jFechaReunion = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtBuscarReunion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnOlvidoPass = new javax.swing.JButton();

        formMenu.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formMenuWindowClosing(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNotas.setText("Gestión de Notas");
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });

        btnGeneral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeneral.setText("Gestión General");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });

        btnTareas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTareas.setText("Gestión de Tareas");
        btnTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Menú Principal");

        jLabel5.setText("Profesor/a:");

        jLabel29.setText("Asignatura:");

        lblProfesor.setText("jLabel30");

        lblAsignaturaMenuPrincipal.setText("jLabel31");

        jLabel32.setText("Fecha: ");

        lblFechaMenuPrincipal.setText("jLabel33");

        jLabel33.setText("Hora: ");

        lblHoraMenuPrincipal.setText("jLabel34");

        javax.swing.GroupLayout formMenuLayout = new javax.swing.GroupLayout(formMenu.getContentPane());
        formMenu.getContentPane().setLayout(formMenuLayout);
        formMenuLayout.setHorizontalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formMenuLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(173, 173, 173))
            .addGroup(formMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formMenuLayout.createSequentialGroup()
                        .addGroup(formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formMenuLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAsignaturaMenuPrincipal)
                                .addGap(216, 216, 216)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHoraMenuPrincipal)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(formMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaMenuPrincipal)
                        .addGap(51, 51, 51))))
        );
        formMenuLayout.setVerticalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblProfesor)
                    .addComponent(jLabel32)
                    .addComponent(lblFechaMenuPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblAsignaturaMenuPrincipal)
                    .addComponent(jLabel33)
                    .addComponent(lblHoraMenuPrincipal))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        formNotas.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formNotasWindowClosing(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblAsignatura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAsignatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        cbcCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbcCursoMouseReleased(evt);
            }
        });

        jLabel6.setText("Curso: ");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabAlumnosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabAlumnos);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formNotasLayout = new javax.swing.GroupLayout(formNotas.getContentPane());
        formNotas.getContentPane().setLayout(formNotasLayout);
        formNotasLayout.setHorizontalGroup(
            formNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formNotasLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formNotasLayout.createSequentialGroup()
                        .addGroup(formNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbcCurso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formNotasLayout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIngresar)))
                        .addContainerGap())))
        );
        formNotasLayout.setVerticalGroup(
            formNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(cbcCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnIngresar))
                .addContainerGap())
        );

        formTareas.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formTareasWindowClosing(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Tarea"));

        jLabel8.setText("ID: ");

        jLabel9.setText("Titulo: ");

        jLabel10.setText("Descripción: ");

        jLabel11.setText("Asignatura: ");

        jLabel12.setText("Estado: ");

        txtIdTarea.setEditable(false);

        txtDescripcionTarea.setColumns(20);
        txtDescripcionTarea.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionTarea);

        txtAsignaturaTarea.setEditable(false);

        cbcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcEstadoActionPerformed(evt);
            }
        });

        btnCancelarTarea.setText("Cancelar");
        btnCancelarTarea.setEnabled(false);
        btnCancelarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTareaActionPerformed(evt);
            }
        });

        btnRegistrarTarea.setText("Registrar");
        btnRegistrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTareaActionPerformed(evt);
            }
        });

        btnEditarTarea.setText("Editar");
        btnEditarTarea.setEnabled(false);
        btnEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTareaActionPerformed(evt);
            }
        });

        btnEliminarTarea.setText("Eliminar");
        btnEliminarTarea.setEnabled(false);
        btnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaActionPerformed(evt);
            }
        });

        jLabel31.setText("Curso: ");

        cbcCursoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtTitulo)))
                    .addComponent(cbcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAsignaturaTarea)
                    .addComponent(btnEditarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCancelarTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarTarea))
                    .addComponent(cbcCursoTarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel31))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbcCursoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAsignaturaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarTarea)
                    .addComponent(btnRegistrarTarea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarTarea)
                .addGap(10, 10, 10)
                .addComponent(btnEliminarTarea))
        );

        tabTarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabTareaMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabTarea);

        txtBuscarTarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTareaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtBuscarTarea))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtBuscarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout formTareasLayout = new javax.swing.GroupLayout(formTareas.getContentPane());
        formTareas.getContentPane().setLayout(formTareasLayout);
        formTareasLayout.setHorizontalGroup(
            formTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formTareasLayout.setVerticalGroup(
            formTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formMenuGeneral.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formMenuGeneralWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formMenuGeneralWindowClosing(evt);
            }
        });

        btnAnotaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnotaciones.setText("Anotaciones");
        btnAnotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnotacionesActionPerformed(evt);
            }
        });

        btnCitaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCitaciones.setText("Citaciones");
        btnCitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitacionesActionPerformed(evt);
            }
        });

        btnReuniones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReuniones.setText("Reuniones");
        btnReuniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReunionesActionPerformed(evt);
            }
        });

        btnVolverMenú.setText("Volver");
        btnVolverMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenúActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formMenuGeneralLayout = new javax.swing.GroupLayout(formMenuGeneral.getContentPane());
        formMenuGeneral.getContentPane().setLayout(formMenuGeneralLayout);
        formMenuGeneralLayout.setHorizontalGroup(
            formMenuGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMenuGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formMenuGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnotaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(formMenuGeneralLayout.createSequentialGroup()
                        .addComponent(btnVolverMenú)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnReuniones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        formMenuGeneralLayout.setVerticalGroup(
            formMenuGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMenuGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnReuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnVolverMenú)
                .addGap(28, 28, 28))
        );

        formCitaciones.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formCitacionesWindowClosing(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("ID:");

        jLabel20.setText("Curso:");

        jLabel21.setText("Alumno/a:");

        jLabel22.setText("Razon:");

        jLabel23.setText("Descripción:");

        jLabel24.setText("Fecha:");

        jTextField1.setEditable(false);

        txtDescripcionCitacion.setColumns(20);
        txtDescripcionCitacion.setRows(5);
        jScrollPane6.setViewportView(txtDescripcionCitacion);

        btnCancelarCitacion.setText("Cancelar");
        btnCancelarCitacion.setEnabled(false);
        btnCancelarCitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCitacionActionPerformed(evt);
            }
        });

        btnRegistrarCitacion.setText("Registrar");
        btnRegistrarCitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCitacionActionPerformed(evt);
            }
        });

        btnEditarCitacion.setText("Editar");
        btnEditarCitacion.setEnabled(false);

        btnBorrarCitacion.setText("Borrar");
        btnBorrarCitacion.setEnabled(false);
        btnBorrarCitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCitacionActionPerformed(evt);
            }
        });

        cbcCursoCitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcCursoCitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcCursoCitacionActionPerformed(evt);
            }
        });

        cbcAlumnoCitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbcAlumnoCitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btnCancelarCitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCitacion))
                    .addComponent(btnBorrarCitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRazonCitacion)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcCursoCitacion, 0, 136, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFechaCitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel20)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcCursoCitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbcAlumnoCitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazonCitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarCitacion)
                            .addComponent(btnRegistrarCitacion))
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarCitacion)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jFechaCitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabCitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tabCitacion);

        txtBuscarCitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCitacionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(txtBuscarCitacion)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtBuscarCitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout formCitacionesLayout = new javax.swing.GroupLayout(formCitaciones.getContentPane());
        formCitaciones.getContentPane().setLayout(formCitacionesLayout);
        formCitacionesLayout.setHorizontalGroup(
            formCitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formCitacionesLayout.setVerticalGroup(
            formCitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        formAnotacion.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formAnotacionWindowClosing(evt);
            }
        });

        tabAnotacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabAnotacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabAnotacionMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabAnotacion);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel14.setText("ID: ");

        txtIDAnotacion.setEditable(false);

        jLabel15.setText("Tipo: ");

        cbcAnotacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbcAlumnoAnotacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Alumno/a :");

        jLabel17.setText("Descripción: ");

        txtDescripcionAnotacion.setColumns(20);
        txtDescripcionAnotacion.setRows(5);
        jScrollPane5.setViewportView(txtDescripcionAnotacion);

        jLabel18.setText("Fecha: ");

        btnRegistrarAnotacionn.setText("Registrar");
        btnRegistrarAnotacionn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnotacionnActionPerformed(evt);
            }
        });

        btnCancelarAnotacion.setText("Cancelar");
        btnCancelarAnotacion.setEnabled(false);
        btnCancelarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAnotacionActionPerformed(evt);
            }
        });

        btnEliminarAnotacion.setText("Eliminar");
        btnEliminarAnotacion.setEnabled(false);
        btnEliminarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnotacionActionPerformed(evt);
            }
        });

        btnEditarAnotacion.setText("Editar");
        btnEditarAnotacion.setEnabled(false);
        btnEditarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAnotacionActionPerformed(evt);
            }
        });

        jLabel19.setText("Curso: ");

        cbcCursoAnotacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcCursoAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcCursoAnotacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarAnotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarAnotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtIDAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbcAnotacion, 0, 190, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnCancelarAnotacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarAnotacionn))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(cbcAlumnoAnotacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbcCursoAnotacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFechaAnotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbcCursoAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(cbcAlumnoAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarAnotacion)
                            .addComponent(btnRegistrarAnotacionn))
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAnotacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAnotacion))
                    .addComponent(jFechaAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtBuscarAnotacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAnotacionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(txtBuscarAnotacion)))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtBuscarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formAnotacionLayout = new javax.swing.GroupLayout(formAnotacion.getContentPane());
        formAnotacion.getContentPane().setLayout(formAnotacionLayout);
        formAnotacionLayout.setHorizontalGroup(
            formAnotacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAnotacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formAnotacionLayout.setVerticalGroup(
            formAnotacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAnotacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formReunion.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formReunionWindowClosing(evt);
            }
        });

        tabReunion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tabReunion);

        jLabel25.setText("ID:");

        jLabel26.setText("Curso: ");

        jLabel27.setText("Fecha: ");

        btnAgregarReunion.setText("Agregar");
        btnAgregarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReunionActionPerformed(evt);
            }
        });

        btnEliminarReunion.setText("Eliminar");
        btnEliminarReunion.setToolTipText("");
        btnEliminarReunion.setEnabled(false);
        btnEliminarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReunionActionPerformed(evt);
            }
        });

        btnCancelarReunion.setText("Cancelar");
        btnCancelarReunion.setToolTipText("");
        btnCancelarReunion.setEnabled(false);

        btnEditarReunion.setText("Editar");
        btnEditarReunion.setToolTipText("");
        btnEditarReunion.setEnabled(false);

        txtIDReunion.setEditable(false);

        cbcCursoReunion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setText("Hora:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtBuscarReunion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarReunionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout formReunionLayout = new javax.swing.GroupLayout(formReunion.getContentPane());
        formReunion.getContentPane().setLayout(formReunionLayout);
        formReunionLayout.setHorizontalGroup(
            formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formReunionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(formReunionLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcCursoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFechaReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formReunionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarReunion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarReunion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarReunion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarReunion))
                    .addComponent(txtBuscarReunion))
                .addContainerGap())
        );
        formReunionLayout.setVerticalGroup(
            formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formReunionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27)
                        .addComponent(txtIDReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbcCursoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFechaReunion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtBuscarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formReunionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarReunion)
                    .addComponent(btnEliminarReunion)
                    .addComponent(btnCancelarReunion)
                    .addComponent(btnEditarReunion))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio de Sesión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("RUT:");

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnOlvidoPass.setText("Olvidé la contraseña");
        btnOlvidoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRut)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnOlvidoPass, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(btnOlvidoPass)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            String rut, pass, nombre;
            rut = txtRut.getText();
            pass = new String(txtPass.getPassword());
            nombre = d.getNombreProfesor(rut, pass);

            if (nombre == null) {
                txtRut.selectAll();
                txtRut.requestFocus();
                txtPass.setText("");
                lblMensaje.setText("Error de inicio: Verifique los datos");
            } else {
                lblMensaje.setText("");
                nombre = d.getAsignaturaProfesor(rut);
                lblAsignaturaMenuPrincipal.setText(nombre);
                String nombreA = d.getNombreProfesor2(rut);
                lblProfesor.setText(nombreA);

                this.setVisible(false);

                formMenu.setBounds(0, 0, 480, 490);
                formMenu.setLocationRelativeTo(null);
                formMenu.setResizable(false);
                formMenu.setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnOlvidoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoPassActionPerformed
        String verificarRut = JOptionPane.showInputDialog("Ingrese el RUT: ");
        try {
            String rut = d.verificarRut(verificarRut);
            if (rut == null) {
                JOptionPane.showMessageDialog(this, "Error, rut no existe");
            } else {
                JPasswordField pf = new JPasswordField();
                int okCxl = JOptionPane.showConfirmDialog(null, pf, "Ingrese su Nueva Contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (okCxl == JOptionPane.OK_OPTION) {
                    String password = new String(pf.getPassword());
                    d.cambiarPassViaRut(rut, password);
                    System.err.println("You entered: " + password);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnOlvidoPassActionPerformed

    private void formMenuWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formMenuWindowClosing
        this.setVisible(true);
        txtPass.setText(null);
        txtRut.selectAll();
        txtRut.requestFocus();
    }//GEN-LAST:event_formMenuWindowClosing

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIniciarSesion.doClick();
        }
    }//GEN-LAST:event_txtRutKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIniciarSesion.doClick();
        }
    }//GEN-LAST:event_txtPassKeyReleased

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        btnIngresar.setEnabled(false);
        String rut, nombre;

        rut = txtRut.getText();

        try {
            formMenu.setVisible(false);
            nombre = d.getAsignaturaProfesor(rut);
            lblAsignatura.setText(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        formNotas.setBounds(0, 0, 960, 520);
        formNotas.setLocationRelativeTo(null);
        formNotas.setResizable(false);
        cargarTablaAlumnos();

        formNotas.setVisible(true);
    }//GEN-LAST:event_btnNotasActionPerformed

    private void cbcCursoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbcCursoMouseReleased
        if (evt.getClickCount() == 1) {

            //cargarTablaNotas();
        }
    }//GEN-LAST:event_cbcCursoMouseReleased

    private void formNotasWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formNotasWindowClosing
        formMenu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formNotasWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        formNotas.setVisible(false);
        formMenu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tabAlumnosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnosMouseReleased
        if (evt.getClickCount() == 1) {
            btnIngresar.setEnabled(true);

            int fila = tabAlumnos.getSelectedRow();
            int a = tabAlumnos.getSelectedColumn();
            int columna = 1;

            //String id = tabAlumnos.getValueAt(fila, a).toString(); ENTREGA LA ID
            String id = tabAlumnos.getValueAt(fila, columna).toString();
            System.out.println("ID: " + id);

            try {
                //Calificacion c = d.
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tabAlumnosMouseReleased

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formTareasWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formTareasWindowClosing
        formMenu.setVisible(true);
    }//GEN-LAST:event_formTareasWindowClosing

    private void btnTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasActionPerformed
        String nombre = txtRut.getText();

        try {
            nombre = d.getAsignaturaProfesor(nombre);
            txtAsignaturaTarea.setText(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        formMenu.setVisible(false);
        formTareas.setBounds(0, 0, 850, 550);
        formTareas.setLocationRelativeTo(null);
        formTareas.setVisible(true);
        formTareas.setResizable(false);
        cargarCBCCursoTarea();
        cargarCBCEstado();
        cargarTablaTareas();
    }//GEN-LAST:event_btnTareasActionPerformed

    private void tabTareaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTareaMouseReleased

        if (evt.getClickCount() == 2) {
            btnEliminarTarea.setEnabled(true);
            btnEditarTarea.setEnabled(true);
            btnRegistrarTarea.setEnabled(false);
            btnIngresar.setEnabled(true);
            btnCancelarTarea.setEnabled(true);

            int fila = tabTarea.getSelectedRow();
            int a = tabTarea.getSelectedColumn();
            int columna = 1;

            //String id = tabAlumnos.getValueAt(fila, a).toString(); ENTREGA LA ID
            String id = tabTarea.getValueAt(fila, 0).toString();
            System.out.println("ID: " + id);

            try {
                Tarea t = d.getTareaByID(id);
                List<Tarea> lista = d.getEstadoTarea();

                txtIdTarea.setText(id);
                txtTitulo.setText(t.getTitulo());
                txtDescripcionTarea.setText(t.getDescripcion());
                txtAsignaturaTarea.setText(t.getAsignatura());
                cbcEstado.removeAllItems();

                for (int i = 0; i < lista.size(); i++) {
                    cbcEstado.addItem(lista.get(i).getEstado());
                }
                //cbcEstado.add(hola);

                txtIdTarea.setEditable(false);
                txtAsignaturaTarea.setEditable(false);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }
    }//GEN-LAST:event_tabTareaMouseReleased

    private void btnCancelarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTareaActionPerformed
        limpiarTablaTarea();
    }//GEN-LAST:event_btnCancelarTareaActionPerformed

    private void btnRegistrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTareaActionPerformed
        String titulo, descripcion, asignatura, estado, curso;

        titulo = txtTitulo.getText();
        descripcion = txtDescripcionTarea.getText();
        asignatura = txtAsignaturaTarea.getText();
        estado = (String) cbcEstado.getSelectedItem();
        curso = (String) cbcCursoTarea.getSelectedItem();

        Tarea t = new Tarea();

        t.setTitulo(titulo);
        t.setDescripcion(descripcion);
        t.setAsignatura(asignatura);
        t.setCurso(curso);
        t.setEstado(estado);

        try {
            if (!titulo.isEmpty() && !descripcion.isEmpty()) {

                d.crearTarea(t);

                txtTitulo.setText(null);
                txtDescripcionTarea.setText(null);
                cargarTablaTareas();

            } else {
                JOptionPane.showMessageDialog(this, "Campos Vacíos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarTareaActionPerformed

    private void cbcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcEstadoActionPerformed

    private void btnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaActionPerformed
        int id = Integer.parseInt(txtIdTarea.getText());

        try {
            d.eliminarTarea(id);
            limpiarTablaTarea();
            cargarTablaTareas();
            JOptionPane.showMessageDialog(this, "Tarea eliminada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarTareaActionPerformed

    private void btnEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTareaActionPerformed
        Tarea t = new Tarea();

        t.setId(Integer.parseInt(txtIdTarea.getText()));
        t.setTitulo(txtTitulo.getText());
        t.setDescripcion(txtDescripcionTarea.getText());
        t.setAsignatura(txtAsignaturaTarea.getText());
        t.setEstado((String) cbcEstado.getSelectedItem());

        try {
            d.editarTarea(t);
            limpiarTablaTarea();
            cargarTablaTareas();
            JOptionPane.showMessageDialog(this, "Datos modificados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarTareaActionPerformed

    private void btnEliminarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnotacionActionPerformed
        /* 
        int id = Integer.parseInt(txtIdTarea.getText());

        try {
            d.eliminarTarea(id);
            limpiarTablaTarea();
            cargarTablaTareas();
            JOptionPane.showMessageDialog(this, "Tarea eliminada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         */

        int id = Integer.parseInt(txtIDAnotacion.getText());

        try {
            d.eliminarAnotacion(id);
            cargarTablaAnotacion();
            txtIDAnotacion.setText(null);
            txtDescripcionAnotacion.setText(null);
            JOptionPane.showMessageDialog(this, "Anotación eliminada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarAnotacionActionPerformed

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        formMenu.setVisible(false);

        formMenuGeneral.setBounds(0, 0, 355, 450);
        formMenuGeneral.setLocationRelativeTo(null);
        formMenuGeneral.setResizable(false);
        formMenuGeneral.setVisible(true);
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void formMenuGeneralWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formMenuGeneralWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMenuGeneralWindowClosed

    private void formMenuGeneralWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formMenuGeneralWindowClosing
        formMenu.setVisible(true);
    }//GEN-LAST:event_formMenuGeneralWindowClosing

    private void btnAnotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnotacionesActionPerformed
        formMenuGeneral.setVisible(false);

        formAnotacion.setBounds(0, 0, 890, 570);
        formAnotacion.setLocationRelativeTo(null);
        formAnotacion.setResizable(false);
        formAnotacion.setVisible(true);

        cargarCBCTipoAnotacion();
        cargarCBCCursoAnotacion();
        cargarTablaAnotacion();
        try {
            cargarJDateChooser();
        } catch (ParseException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAnotacionesActionPerformed

    private void formAnotacionWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formAnotacionWindowClosing
        formMenuGeneral.setVisible(true);
    }//GEN-LAST:event_formAnotacionWindowClosing

    private void cbcCursoAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcCursoAnotacionActionPerformed
        String v = (String) cbcCursoAnotacion.getSelectedItem();
        System.out.println(v);

        try {
            List<Alumno> lista = d.getAlumnoByCurso(v);

            cbcAlumnoAnotacion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcAlumnoAnotacion.addItem(lista.get(i).getNombre());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbcCursoAnotacionActionPerformed

    private void tabAnotacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAnotacionMouseReleased
        if (evt.getClickCount() == 2) {
            btnEliminarAnotacion.setEnabled(true);
            btnEditarAnotacion.setEnabled(true);
            btnRegistrarAnotacionn.setEnabled(false);
            btnIngresar.setEnabled(true);
            btnCancelarAnotacion.setEnabled(true);

            int fila = tabAnotacion.getSelectedRow();
            //int a = tabAnotacion.getSelectedColumn();
            //int columna = 1;

            //String id = tabAlumnos.getValueAt(fila, a).toString(); ENTREGA LA ID
            String id = tabAnotacion.getValueAt(fila, 0).toString();
            System.out.println("ID: " + id);

            try {
                Anotacion a = d.getAnotacionByID2(id);
                //List<Tarea> lista = d.getEstadoTarea();

                txtIDAnotacion.setText(id);
                txtDescripcionAnotacion.setText(a.getDescripcion());
                //cbcEstado.removeAllItems();
                //for (int i = 0; i < lista.size(); i++) {
                //  cbcEstado.addItem(lista.get(i).getEstado());
                //}
                //cbcEstado.add(hola);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }
    }//GEN-LAST:event_tabAnotacionMouseReleased

    private void btnReunionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReunionesActionPerformed
        formMenuGeneral.setVisible(false);
        formReunion.setBounds(0, 0, 850, 460);
        formReunion.setLocationRelativeTo(null);
        formReunion.setVisible(true);
        formReunion.setResizable(false);
        cargarCBCCursoReunion();
        cargarTablarReunion();

        try {
            cargarJDateChooserReunion();
        } catch (ParseException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnReunionesActionPerformed

    private void btnCitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitacionesActionPerformed
        /* 
        formMenuGeneral.setVisible(false);
        formReunion.setBounds(0, 0, 850, 460);
        formReunion.setLocationRelativeTo(null);
        formReunion.setVisible(true);
        formReunion.setResizable(false);
        cargarCBCCursoReunion();
        cargarTablarReunion();

        try {
            cargarJDateChooserReunion();
        } catch (ParseException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
         */

        formMenuGeneral.setVisible(false);
        formCitaciones.setBounds(0, 0, 800, 500);
        formCitaciones.setLocationRelativeTo(null);
        formCitaciones.setResizable(false);
        formCitaciones.setVisible(true);
        cargarCBCCursoCitacion();
        cargarTablaCitacion();

        try {
            cargarJDateChooserCitacion();
        } catch (ParseException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCitacionesActionPerformed

    private void btnRegistrarCitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCitacionActionPerformed

    private void btnBorrarCitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarCitacionActionPerformed

    private void btnCancelarCitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCitacionActionPerformed

    private void btnRegistrarAnotacionnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnotacionnActionPerformed
        /* 
        String titulo, descripcion, asignatura, estado;

        titulo = txtTitulo.getText();
        descripcion = txtDescripcionTarea.getText();
        asignatura = txtAsignaturaTarea.getText();
        estado = (String) cbcEstado.getSelectedItem();

        Tarea t = new Tarea();

        t.setTitulo(titulo);
        t.setDescripcion(descripcion);
        t.setAsignatura(asignatura);
        t.setEstado(estado);

        try {
            if (!titulo.isEmpty() && !descripcion.isEmpty()) {

                d.crearTarea(t);

                txtTitulo.setText(null);
                txtDescripcionTarea.setText(null);
                cargarTablaTareas();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Campos Vacíos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         */

        String tipo, curso, alumno, descripcion, id;

        Date date = jFechaAnotacion.getDate();
        long da = date.getTime();
        java.sql.Date fecha = new java.sql.Date(da);

        id = txtIDAnotacion.getText();
        tipo = (String) cbcAnotacion.getSelectedItem();
        curso = (String) cbcCursoAnotacion.getSelectedItem();
        alumno = (String) cbcAlumnoAnotacion.getSelectedItem();
        descripcion = txtDescripcionAnotacion.getText();

        Anotacion a = new Anotacion();

        a.setTipo(tipo);
        a.setCurso(curso);
        a.setAlumno(alumno);
        a.setDescripcion(descripcion);
        //a.setFecha(fecha);
        a.setA(fecha);

        try {
            if (!descripcion.isEmpty() && !date.toString().isEmpty()) {
                d.crearAnotacion(a);
                cargarTablaAnotacion();
                txtDescripcionAnotacion.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Campos Vacíos, por favor, verifique");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        System.out.println(fecha);
    }//GEN-LAST:event_btnRegistrarAnotacionnActionPerformed

    private void btnEliminarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarReunionActionPerformed

    private void formReunionWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formReunionWindowClosing
        formMenuGeneral.setVisible(true);
    }//GEN-LAST:event_formReunionWindowClosing

    private void btnEditarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAnotacionActionPerformed
        /*
        Tarea t = new Tarea();

        t.setId(Integer.parseInt(txtIdTarea.getText()));
        t.setTitulo(txtTitulo.getText());
        t.setDescripcion(txtDescripcionTarea.getText());
        t.setAsignatura(txtAsignaturaTarea.getText());
        t.setEstado((String) cbcEstado.getSelectedItem());

        try {
            d.editarTarea(t);
            limpiarTablaTarea();
            cargarTablaTareas();
            JOptionPane.showMessageDialog(this, "Datos modificados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }*/

        Anotacion a = new Anotacion();

        a.setId(Integer.parseInt(txtIDAnotacion.getText()));
        a.setTipo((String) cbcAnotacion.getSelectedItem());
        a.setCurso((String) cbcCursoAnotacion.getSelectedItem());
        a.setAlumno((String) cbcAlumnoAnotacion.getSelectedItem());
        a.setDescripcion(txtDescripcionAnotacion.getText());

        Date date = jFechaAnotacion.getDate();
        long da = date.getTime();
        java.sql.Date fecha = new java.sql.Date(da);

        a.setA(fecha);

        try {
            d.editarAnotacion(a);
            cargarTablaAnotacion();
            JOptionPane.showMessageDialog(this, "Datos modificados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarAnotacionActionPerformed

    private void btnCancelarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAnotacionActionPerformed
        limpiarTablaAnotacion();
    }//GEN-LAST:event_btnCancelarAnotacionActionPerformed

    private void btnAgregarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReunionActionPerformed
        /* 
        String titulo, descripcion, asignatura, estado;

        titulo = txtTitulo.getText();
        descripcion = txtDescripcionTarea.getText();
        asignatura = txtAsignaturaTarea.getText();
        estado = (String) cbcEstado.getSelectedItem();

        Tarea t = new Tarea();

        t.setTitulo(titulo);
        t.setDescripcion(descripcion);
        t.setAsignatura(asignatura);
        t.setEstado(estado);

        try {
            if (!titulo.isEmpty() && !descripcion.isEmpty()) {

                d.crearTarea(t);

                txtTitulo.setText(null);
                txtDescripcionTarea.setText(null);
                cargarTablaTareas();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Campos Vacíos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        Date date = jFechaAnotacion.getDate();
        long da = date.getTime();
        java.sql.Date fecha = new java.sql.Date(da);

        a.setA(fecha);
         */

        String curso;

        curso = (String) cbcCursoReunion.getSelectedItem();

        Date date = jFechaReunion.getDate();
        long da = date.getTime();
        java.sql.Date fechaa = new java.sql.Date(da);

        Reunion r = new Reunion();
        r.setCurso(curso);
        r.setFecha(fechaa);

        if (Validar_CampoHora(jFormattedTextField1.getText()) == true) {
            System.out.println("La hora es correcta");
        } else {
            JOptionPane.showMessageDialog(this, "Error, verifique la hora");
        }
    }//GEN-LAST:event_btnAgregarReunionActionPerformed

    private void btnVolverMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenúActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMenúActionPerformed

    private void formCitacionesWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formCitacionesWindowClosing
        formMenuGeneral.setVisible(true);
    }//GEN-LAST:event_formCitacionesWindowClosing

    private void cbcCursoCitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcCursoCitacionActionPerformed
        String v = (String) cbcCursoCitacion.getSelectedItem();
        System.out.println(v);

        try {
            List<Alumno> lista = d.getAlumnoByCurso(v);

            cbcAlumnoCitacion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcAlumnoCitacion.addItem(lista.get(i).getNombre());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbcCursoCitacionActionPerformed

    private void txtBuscarTareaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTareaKeyReleased
        /*
        String filtro = txtBuscar.getText();
        
        try {
            List<Producto> lista = d.getProductos(filtro);
            TMProducto model = new TMProducto(lista);
            tabProductos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         */
        String filtro = txtBuscarTarea.getText();

        try {
            List<Tarea> lista = d.getTareasByFiltro(filtro);
            TMTarea model = new TMTarea(lista);
            tabTarea.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarTareaKeyReleased

    private void txtBuscarCitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCitacionKeyReleased
        String filtro1 = txtBuscarCitacion.getText();

        try {
            List<Citacion> lista = d.getCitacionByFiltro(filtro1);
            TMCitacion model = new TMCitacion(lista);
            tabCitacion.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarCitacionKeyReleased

    private void txtBuscarAnotacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAnotacionKeyReleased
        String filtro2 = txtBuscarAnotacion.getText();

        try {
            List<Anotacion> lista = d.getAnotacionByFiltro(filtro2);
            TMAnotacion model = new TMAnotacion(lista);
            tabAnotacion.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarAnotacionKeyReleased

    private void txtBuscarReunionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarReunionKeyReleased
        String filtro3 = txtBuscarReunion.getText();
        try {
            List<Reunion> lista = d.getReunionByFiltro(filtro3);
            TMReunion model = new TMReunion(lista);
            tabReunion.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarReunionKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarReunion;
    private javax.swing.JButton btnAnotaciones;
    private javax.swing.JButton btnBorrarCitacion;
    private javax.swing.JButton btnCancelarAnotacion;
    private javax.swing.JButton btnCancelarCitacion;
    private javax.swing.JButton btnCancelarReunion;
    private javax.swing.JButton btnCancelarTarea;
    private javax.swing.JButton btnCitaciones;
    private javax.swing.JButton btnEditarAnotacion;
    private javax.swing.JButton btnEditarCitacion;
    private javax.swing.JButton btnEditarReunion;
    private javax.swing.JButton btnEditarTarea;
    private javax.swing.JButton btnEliminarAnotacion;
    private javax.swing.JButton btnEliminarReunion;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JButton btnGeneral;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnOlvidoPass;
    private javax.swing.JButton btnRegistrarAnotacionn;
    private javax.swing.JButton btnRegistrarCitacion;
    private javax.swing.JButton btnRegistrarTarea;
    private javax.swing.JButton btnReuniones;
    private javax.swing.JButton btnTareas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverMenú;
    private javax.swing.JComboBox<String> cbcAlumnoAnotacion;
    private javax.swing.JComboBox<String> cbcAlumnoCitacion;
    private javax.swing.JComboBox<String> cbcAnotacion;
    private javax.swing.JComboBox<String> cbcCurso;
    private javax.swing.JComboBox<String> cbcCursoAnotacion;
    private javax.swing.JComboBox<String> cbcCursoCitacion;
    private javax.swing.JComboBox<String> cbcCursoReunion;
    private javax.swing.JComboBox<String> cbcCursoTarea;
    private javax.swing.JComboBox<String> cbcEstado;
    private javax.swing.JFrame formAnotacion;
    private javax.swing.JFrame formCitaciones;
    private javax.swing.JFrame formMenu;
    private javax.swing.JFrame formMenuGeneral;
    private javax.swing.JFrame formNotas;
    private javax.swing.JFrame formReunion;
    private javax.swing.JFrame formTareas;
    private com.toedter.calendar.JDateChooser jFechaAnotacion;
    private com.toedter.calendar.JDateChooser jFechaCitacion;
    private com.toedter.calendar.JDateChooser jFechaReunion;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblAsignaturaMenuPrincipal;
    private javax.swing.JLabel lblFechaMenuPrincipal;
    private javax.swing.JLabel lblHoraMenuPrincipal;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JTable tabAlumnos;
    private javax.swing.JTable tabAnotacion;
    private javax.swing.JTable tabCitacion;
    private javax.swing.JTable tabReunion;
    private javax.swing.JTable tabTarea;
    private javax.swing.JTextField txtAsignaturaTarea;
    private javax.swing.JTextField txtBuscarAnotacion;
    private javax.swing.JTextField txtBuscarCitacion;
    private javax.swing.JTextField txtBuscarReunion;
    private javax.swing.JTextField txtBuscarTarea;
    private javax.swing.JTextArea txtDescripcionAnotacion;
    private javax.swing.JTextArea txtDescripcionCitacion;
    private javax.swing.JTextArea txtDescripcionTarea;
    private javax.swing.JTextField txtIDAnotacion;
    private javax.swing.JTextField txtIDReunion;
    private javax.swing.JTextField txtIdTarea;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRazonCitacion;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaNotas() {
        try {
            List<Calificacion> lista = d.getCalificaciones();
            TMCalificacion model = new TMCalificacion(lista);
            tabAlumnos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarTablaAlumnos() {
        try {
            List<Alumno> lista = d.getAlumnos();
            TMAlumno model = new TMAlumno(lista);
            tabAlumnos.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarTablaTareas() {
        try {
            List<Tarea> lista = d.getTareas();
            TMTarea model = new TMTarea(lista);
            tabTarea.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarTablaAnotacion() {
        try {
            List<Anotacion> lista = d.getAnotacion();
            TMAnotacion model = new TMAnotacion(lista);
            tabAnotacion.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void limpiarTablaTarea() {
        btnEditarTarea.setEnabled(false);
        btnEliminarTarea.setEnabled(false);
        btnRegistrarTarea.setEnabled(true);

        txtIdTarea.setText(null);
        txtTitulo.setText(null);
        txtDescripcionTarea.setText(null);
        //txtAsignaturaTarea.setText(null);
    }

    private void limpiarTablaAnotacion() {
        btnRegistrarAnotacionn.setEnabled(true);
        btnEditarAnotacion.setEnabled(false);
        btnEliminarAnotacion.setEnabled(false);
        txtIDAnotacion.setText(null);
        txtDescripcionAnotacion.setText(null);
    }

    private void cargarCBCEstado() {
        try {
            List<Tarea> lista = d.getEstadoTarea();

            cbcEstado.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcEstado.addItem(lista.get(i).getEstado());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCBCTipoAnotacion() {
        try {
            List<TipoAnotacion> lista = d.getAnotacionByNombre();

            cbcAnotacion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcAnotacion.addItem(lista.get(i).getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCBCCursoAnotacion() {
        try {
            List<Curso> lista = d.getCurso();

            cbcCursoAnotacion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcCursoAnotacion.addItem(lista.get(i).getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCBCCursoReunion() {
        try {
            List<Curso> lista = d.getCurso();

            cbcCursoReunion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcCursoReunion.addItem(lista.get(i).getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCBCCursoCitacion() {
        try {
            List<Curso> lista = d.getCurso();

            cbcCursoCitacion.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcCursoCitacion.addItem(lista.get(i).getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarJDateChooser() throws ParseException {
        Calendar ca = new GregorianCalendar();
        String day = ca.get(Calendar.DAY_OF_MONTH) + "";
        String month = ca.get(Calendar.MONTH) + 1 + "";
        String year = ca.get(Calendar.YEAR) + "";

        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }

        String dd = year + "-" + month + "-" + day;

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
        jFechaAnotacion.setDate(date);
    }

    public void cargarLabels() {
        lblFechaMenuPrincipal.setText(f.fechacomp);
        lblHoraMenuPrincipal.setText(f.horacomp);

    }

    private void cargarJDateChooserCitacion() throws ParseException {
        Calendar ca = new GregorianCalendar();
        String day = ca.get(Calendar.DAY_OF_MONTH) + "";
        String month = ca.get(Calendar.MONTH) + 1 + "";
        String year = ca.get(Calendar.YEAR) + "";

        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }

        String dd = year + "-" + month + "-" + day;

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
        jFechaCitacion.setDate(date);
    }

    private void cargarJDateChooserReunion() throws ParseException {
        Calendar ca = new GregorianCalendar();
        String day = ca.get(Calendar.DAY_OF_MONTH) + "";
        String month = ca.get(Calendar.MONTH) + 1 + "";
        String year = ca.get(Calendar.YEAR) + "";

        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }

        String dd = year + "-" + month + "-" + day;

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
        jFechaReunion.setDate(date);
    }

    public Boolean Validar_CampoHora(String hora) {
        boolean b;
        char[] a = hora.toString().toCharArray();
        String[] c = hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ')
                || (a[3] == ' ') || (a[4] == ' ')
                || (getInteger(c[0]) > 24 || (getInteger(c[1]) > 59))) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }

    private void cargarTablarReunion() {
        /*try {
            List<Anotacion> lista = d.getCitacion();
            TMAnotacion model = new TMAnotacion(lista);
            tabAnotacion.setModel(model);
        } catch (SQLException ) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }*/
        try {
            List<Reunion> lista = d.getReunion();
            TMReunion model = new TMReunion(lista);
            tabReunion.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarTablaCitacion() {

        try {
            List<Citacion> lista = d.getCitacion();
            TMCitacion model = new TMCitacion(lista);
            tabCitacion.setModel(model);

        } catch (Exception e) {
        }
    }

    private void cargarCBCCursoTarea() {
        try {
            List<Curso> lista = d.getCurso();

            cbcCursoTarea.removeAllItems();

            for (int i = 0; i < lista.size(); i++) {
                cbcCursoTarea.addItem(lista.get(i).getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
