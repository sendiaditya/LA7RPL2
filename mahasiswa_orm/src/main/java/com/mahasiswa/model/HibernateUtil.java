/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.model;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Jun
 */
public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
    static {
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("ada error. "+ ex);
            throw new ExceptionInInitializerError(ex);
            
        }
    }
   public static SessionFactory getSessionFactory(){
       return sessionFactory;
}

public static void testConnection(){
    try (Session session = sessionFactory.openSession()){
        System.out.println("koneksi Berhasil");
    } catch (Exception e){
            System.err.println("gagal konek. ");
            e.printStackTrace();
            }
}
    
}
