/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Proccess;

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
public class KhachHangTest {
    
    public KhachHangTest() {
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
     * Test of getMaKH method, of class KhachHang.
     */
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        KhachHang instance = new KhachHang();
        String expResult = "";
        String result = instance.getMaKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaKH method, of class KhachHang.
     */
    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        String MaKH = "";
        KhachHang instance = new KhachHang();
        instance.setMaKH(MaKH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenKH method, of class KhachHang.
     */
    @Test
    public void testGetTenKH() {
        System.out.println("getTenKH");
        KhachHang instance = new KhachHang();
        String expResult = "";
        String result = instance.getTenKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenKH method, of class KhachHang.
     */
    @Test
    public void testSetTenKH() {
        System.out.println("setTenKH");
        String TenKH = "";
        KhachHang instance = new KhachHang();
        instance.setTenKH(TenKH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSDTKH method, of class KhachHang.
     */
    @Test
    public void testGetSDTKH() {
        System.out.println("getSDTKH");
        KhachHang instance = new KhachHang();
        String expResult = "";
        String result = instance.getSDTKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSDTKH method, of class KhachHang.
     */
    @Test
    public void testSetSDTKH() {
        System.out.println("setSDTKH");
        String SDTKH = "";
        KhachHang instance = new KhachHang();
        instance.setSDTKH(SDTKH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaChiKH method, of class KhachHang.
     */
    @Test
    public void testGetDiaChiKH() {
        System.out.println("getDiaChiKH");
        KhachHang instance = new KhachHang();
        String expResult = "";
        String result = instance.getDiaChiKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaChiKH method, of class KhachHang.
     */
    @Test
    public void testSetDiaChiKH() {
        System.out.println("setDiaChiKH");
        String DiaChiKH = "";
        KhachHang instance = new KhachHang();
        instance.setDiaChiKH(DiaChiKH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class KhachHang.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        KhachHang instance = new KhachHang();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
