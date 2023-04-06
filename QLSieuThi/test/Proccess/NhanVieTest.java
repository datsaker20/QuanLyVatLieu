/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Proccess;

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
public class NhanVieTest {
    
    public NhanVieTest() {
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
     * Test of getMaNV method, of class NhanVie.
     */
    @Test
    public void testGetMaNV() {
        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setMaNV method, of class NhanVie.
     */
    @Test
    public void testSetMaNV() {
      
        String MaNV = "NV01";
        NhanVie instance = new NhanVie();
        instance.setMaNV(MaNV);
        String expected="NV01";
        assertEquals(expected,instance.getMaNV());

    }

    /**
     * Test of getTenNV method, of class NhanVie.
     */
    @Test
    public void testGetTenNV() {

        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getTenNV();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setTenNV method, of class NhanVie.
     */
    @Test
    public void testSetTenNV() {
     
        String TenNV = "Giang";
        NhanVie instance = new NhanVie();
        instance.setTenNV(TenNV);
        String expected="Giang";
        assertEquals(expected,instance.getTenNV());

    }

    /**
     * Test of getNamSinh method, of class NhanVie.
     */
    @Test
    public void testGetNamSinh() {
     
        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getNamSinh();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNamSinh method, of class NhanVie.
     */
    @Test
    public void testSetNamSinh() {
     
        String NamSinh = "1998";
        NhanVie instance = new NhanVie();
        instance.setNamSinh(NamSinh);
        String expected="1998";
        assertEquals(expected,instance.getNamSinh());
    }

    /**
     * Test of getSDT method, of class NhanVie.
     */
    @Test
    public void testGetSDT() {
    
        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getSDT();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSDT method, of class NhanVie.
     */
    @Test
    public void testSetSDT() {
  
        String SDT = "4444666             ";
        NhanVie instance = new NhanVie();
        instance.setSDT(SDT);
         String expected="4444666             ";
        assertEquals(expected,instance.getSDT());
     
    }

    /**
     * Test of getDiaChi method, of class NhanVie.
     */
    @Test
    public void testGetDiaChi() {
      
        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDiaChi method, of class NhanVie.
     */
    @Test
    public void testSetDiaChi() {
        String DiaChi = "Hai Phong";
        NhanVie instance = new NhanVie();
        instance.setDiaChi(DiaChi);
    String expected="Hai Phong";
        assertEquals(expected,instance.getDiaChi());
    }

    /**
     * Test of getGioiTinh method, of class NhanVie.
     */
    @Test
    public void testGetGioiTinh() {
        System.out.println("getGioiTinh");
        NhanVie instance = new NhanVie();
        String expResult = "";
        String result = instance.getGioiTinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioiTinh method, of class NhanVie.
     */
    @Test
    public void testSetGioiTinh() {
      
        String GioiTinh = "Nu   ";
        NhanVie instance = new NhanVie();
        instance.setGioiTinh(GioiTinh);
         String expected="Nu";
        assertEquals(expected,instance.getGioiTinh());
    }

    /**
     * Test of toString method, of class NhanVie.
     */
    
}
