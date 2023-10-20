package utn.tienda_libros.vista;

import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;

import utn.tienda_libros.servicio.LibroServicio;

public class LibroForm extends JFrame{
    LibroServicio libroServicio;
    private JPanel panel;

    @Autowired
    public LibroForm(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
    }
}
