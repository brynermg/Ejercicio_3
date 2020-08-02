package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryner
 */
public class ClsLibro implements Comparable<ClsLibro>{
    String titulo;
    String autor;
    int numpag;
    int num;
    
    public ClsLibro(String titulo, String autor, int numpag, int num) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
        this.num = num;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(ClsLibro t) {
        if (num< t.num) {
            return -1;
        }
        if (num> t.num) {
            return 1;
        }
    return 0;    
    }
    
    
    
}
