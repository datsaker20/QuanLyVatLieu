/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Proccess;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tran Dat
 */
public class NhanVienDaoTest {
    
    public NhanVienDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of InSert method, of class NhanVienDao.
     */
    @Test
    public void testInSert() throws Exception {
        System.out.println("InSert");
        NhanVie NV = null;
        NhanVienDao instance = new NhanVienDao();
        boolean expResult = false;
        boolean result = instance.InSert(NV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpDate method, of class NhanVienDao.
     */
    @Test
    public void testUpDate() throws Exception {
        System.out.println("UpDate");
        NhanVie NV = null;
        NhanVienDao instance = new NhanVienDao();
        boolean expResult = false;
        boolean result = instance.UpDate(NV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class NhanVienDao.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("Delete");
        String MaNV = "";
        NhanVienDao instance = new NhanVienDao();
        boolean expResult = false;
        boolean result = instance.Delete(MaNV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class NhanVienDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        NhanVienDao instance = new NhanVienDao();
        List<NhanVie> expResult = null;
        List<NhanVie> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByName method, of class NhanVienDao.
     */
    @Test
    public void testGetByName() {
        System.out.println("getByName");
        String MaNV = "";
        NhanVienDao instance = new NhanVienDao();
        NhanVie expResult = null;
        NhanVie result = instance.getByName(MaNV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
