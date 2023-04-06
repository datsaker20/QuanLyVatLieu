/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Proccess;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tran Dat
 */
public class HoaDonTest {
    
    public HoaDonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaHD method, of class HoaDon.
     */
    @Test
    public void testGetMaHD() {
        System.out.println("getMaHD");
        HoaDon instance = new HoaDon();
        String expResult = "";
        String result = instance.getMaHD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaHD method, of class HoaDon.
     */
    @Test
    public void testSetMaHD() {
        System.out.println("setMaHD");
        String MaHD = "";
        HoaDon instance = new HoaDon();
        instance.setMaHD(MaHD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayHD method, of class HoaDon.
     */
    @Test
    public void testGetNgayHD() {
        System.out.println("getNgayHD");
        HoaDon instance = new HoaDon();
        Date expResult = null;
        Date result = instance.getNgayHD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayHD method, of class HoaDon.
     */
    @Test
    public void testSetNgayHD() {
        System.out.println("setNgayHD");
        Date NgayHD = null;
        HoaDon instance = new HoaDon();
        instance.setNgayHD(NgayHD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKH method, of class HoaDon.
     */
    @Test
    public void testGetKH() {
        System.out.println("getKH");
        HoaDon instance = new HoaDon();
        KhachHang expResult = null;
        KhachHang result = instance.getKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKH method, of class HoaDon.
     */
    @Test
    public void testSetKH() {
        System.out.println("setKH");
        KhachHang KH = null;
        HoaDon instance = new HoaDon();
        instance.setKH(KH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNV method, of class HoaDon.
     */
    @Test
    public void testGetNV() {
        System.out.println("getNV");
        HoaDon instance = new HoaDon();
        NhanVie expResult = null;
        NhanVie result = instance.getNV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNV method, of class HoaDon.
     */
    @Test
    public void testSetNV() {
        System.out.println("setNV");
        NhanVie NV = null;
        HoaDon instance = new HoaDon();
        instance.setNV(NV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HoaDon.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HoaDon instance = new HoaDon();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
