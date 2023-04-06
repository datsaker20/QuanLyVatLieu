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
public class SanPhamTest {
    
    public SanPhamTest() {
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
     * Test of getMaHH method, of class SanPham.
     */
    @Test
    public void testGetMaHH() {
        System.out.println("getMaHH");
        SanPham instance = new SanPham();
        String expResult = "";
        String result = instance.getMaHH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaHH method, of class SanPham.
     */
    @Test
    public void testSetMaHH() {
        System.out.println("setMaHH");
        String MaHH = "";
        SanPham instance = new SanPham();
        instance.setMaHH(MaHH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenHH method, of class SanPham.
     */
    @Test
    public void testGetTenHH() {
        System.out.println("getTenHH");
        SanPham instance = new SanPham();
        String expResult = "";
        String result = instance.getTenHH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenHH method, of class SanPham.
     */
    @Test
    public void testSetTenHH() {
        System.out.println("setTenHH");
        String TenHH = "";
        SanPham instance = new SanPham();
        instance.setTenHH(TenHH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDVT method, of class SanPham.
     */
    @Test
    public void testGetDVT() {
        System.out.println("getDVT");
        SanPham instance = new SanPham();
        String expResult = "";
        String result = instance.getDVT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDVT method, of class SanPham.
     */
    @Test
    public void testSetDVT() {
        System.out.println("setDVT");
        String DVT = "";
        SanPham instance = new SanPham();
        instance.setDVT(DVT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGiaBan method, of class SanPham.
     */
    @Test
    public void testGetGiaBan() {
        System.out.println("getGiaBan");
        SanPham instance = new SanPham();
        int expResult = 0;
        int result = instance.getGiaBan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGiaBan method, of class SanPham.
     */
    @Test
    public void testSetGiaBan() {
        System.out.println("setGiaBan");
        int GiaBan = 0;
        SanPham instance = new SanPham();
        instance.setGiaBan(GiaBan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNCC method, of class SanPham.
     */
    @Test
    public void testGetMaNCC() {
        System.out.println("getMaNCC");
        SanPham instance = new SanPham();
        NhaCungCap expResult = null;
        NhaCungCap result = instance.getMaNCC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNCC method, of class SanPham.
     */
    @Test
    public void testSetMaNCC() {
        System.out.println("setMaNCC");
        NhaCungCap MaNCC = null;
        SanPham instance = new SanPham();
        instance.setMaNCC(MaNCC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SanPham.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SanPham instance = new SanPham();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
