/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sof.mathutil.core;

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//vd cách cũ, không có-DDT:
//assertEquals(0, getF(0))
//assertEquals(1, getF(1))
//assertEquals(2, getF(2))
//assertEquals(6, getF(3))
//cách này dễ viết nhưng khó kiểm tra đủ các tập test cases
//nó trộn lẫn data đưa vào và câu lệnh gọi hàm kiểm thử
//kỹ thuật tách data 00, 11, 22, 63, 244, 1205
//để riêng ra 1 chỗ sau đó nhồi fill/feed nạp chúng vào

@RunWith(value = Parameterized.class) //class này chuẩn bị chơi trò tách data
//ra khỏi câu lệnh xanh đỏ cho dễ kiểm soát các test case
//Thư viện JUnit sẽ tự generate thêm code phía hậu trường, lúc biên dịch
//để giúp thực hiện hóa ý tưởng DDT
//vd nó sẽ tự biết lấy data ở mảng 2 chiều nào đó nhồi vào hàm assertEquals()
//ép ta phải viết code theo cách nào đó định trước mới chạy đc
//thư đó đc gọi tên mới: FRAMEWORK
public class MathUtilDDTTest {
    
    public MathUtilDDTTest() {
        
        //ta tự tạo ra 1 hàm, tên tùy ý, trả về mảng hai chiều
        //chứa danh sách data dự định nhồi vào hàm getF() và assertE()
        //phần duyệt mảng để nhồi vào hàm test, FRAMEWORK tự lo coder ko cần lo
        
        
    }
    @Parameterized.Parameters //bộ data
        public static Object[][] initData() {
            //int a[] = {5, 10, 15, 20, 25};
            //mảng có giá trị ngay lúc khai báo, thì dùng { các phần tử
            //cách nhau dấu ,}
            
           return new Integer[][] {
                                    {1, 0}, 
                                    {1, 1}, 
                                    {2, 2}, 
                                    {6, 3}, 
                                    {24, 4}, 
                                    {120, 5}, 
                                    {720, 6}};  
        }
    @Parameterized.Parameter(value = 0)
    public long expected; //biến này sẽ lưu giá trị kỳ vọng khi 
    //dùng hàm getFactorial() -> expected
    
    @Parameterized.Parameter(value = 1)
    public int n; //biến này sẽ lưu giá trị đưa cho hàm getF() để check
    //ta sẽ map/ánh xạ 2 biến này ứng với 2 cột của từng dòng của 2 mảng trên!!
    //ta phải quy ước biến expected map vào cột nào mình muốn
    //thứ tự biến ko quan trọng, thứ tự cột trong mảng ko quan trọng
    // vì ta sẽ cấu hình việc map tương ứng này!!
    
    //test các test case
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}


//DDT (Data Driven Testing, là 1 kỹ thuật viết code kiểm thử
//dùng trong Unit Test, dùng để viết code để test các hàm/class
//một cách dễ đọc hơn bằng cách tách data kiểm thử và câu lệnh test hàm
//thành 2 nơi khác nhau

//lệnh gọi hàm assertEquals(?, getF(?))
//giúp code trong sáng dễ hiểu
//kỹ thuật này gọi là   DATA        DRIVEN         TESTING
//                      TÁCH DATA   HƯỚNG VỀ    CODE KIỂM THỬ 
//THAM SỐ HÓA DATA - BIẾN DATA RA 1 NƠI, ĐẶT CHO CHÚNG TÊN BIẾN
//LÁT HỒI NHỒI VÀO LỆNH SO SÁNH
//THAM SỐ HÓA - BIẾN DATA THÀNH BIẾN THAM SỐ - PARAMETERIZED

//JUNIT sẽ tự tách mảng ra thành các test case
//chạy so sánh XANH ĐỎ của từng test case và đưa ra kq chung!!
//Xanh khi tất cả xanh
//Chỉ 1 thằng đỏ -> tất cả đỏ (hàm ý hàm phải đúng hết)

//Khi đỏ, chỉ có 2 tình huống
//ĐỎ: Do != giữa expected và actual
//Đỏ. Do expected != actual, vậy ko bằng vì lý do gì?
//1. EXPECTED LÀ GIÁ TRỊ TÍNH TOÁN TRƯỚC, HÀM PHẢI TRẢ VỀ BẰNG ĐC GIÁ TRỊ NÀY
//VÀ GIÁ TRỊ MÌNH TÍNH = TAY KHI CHƯA XÀI APP, PHẢI TÍNH ĐÚNG MÀU ĐỎ LÀ DO
//ACTUAL KO GIỐNG HAY CODE SAI, BUG!!

//2. EXPECTED MÌNH TÍNH BẰNG TAY, VÀ BỊ SAI, KỲ VỌNG ĐÃ SAI TRƯỚC
//KHI ĐÓ HÀM TRẢ VỀ CHO DÙ CÓ ĐÚNG THÌ CŨNG BỊ MÀU ĐỎ
//KỲ VỌNG SAI THÌ KO THỂ KẾT LUẬN ĐC HÀM CÓ BUG HAY KO?!!

//BTVN: HÃY CHỌN 1 UNIT TEST FRAMEWORK VÀ THUYẾT TRÌNH VỀ NÓ
//JAVA: JUNIT, TESTNG
//C#: NUnit, xUnit, MSTest (NuGet)
//search Google "Unit Test Framework for NNLT???" ra tên thư viện
//Thứ 3 của tuần thứ 6 demo