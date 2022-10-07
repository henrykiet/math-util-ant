/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sof.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kiety
 */
//framwork 
public class MathUtilTest {

    //farmwork ép dev phải viết code theo 1 khung dựng sẵn nào đó
    //thường khung đc ký hiệu = @..., annotation - fag đánh dấu 1 điều gì đó sẽ diễn ra lúc biên dịch
    @Test //test thử 2 giá trị expected và actual, má tự so sánh giùm, ko nhìn bằng mắt như bên hàm main
    //dùng sout() mà FW Junit tự generate ra code so sánh giá trị, tự dùng bằng màu xanh, đỏ mang ý nghĩa PASSED FAILED
    public void tryAssert() {
        Assert.assertEquals(100, 100);
    }

    //test hàm getFactorial() như bên main() nhưng chơi kiểu XANH ĐỎ
    @Test //quy tắc đặc tên hàm cho kiểm thử
    // tên hàm bao hàm ngữ nghĩa của vc kiểm thử
    //test này ktra tính gt với tham số từ 0...20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //test case 1: 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        //test case 2:
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        //test case 3:
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //test case 4:
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //test case 5:
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    //kiểm thử ngoại lệ khi đưa data cà chớn
    //n < 0, ko tính giai thừa
    //n > 20, ko tính giai thừa vì kiểu long
    //hàm đc thiết kế nén ra ngoại lệ tên là Illegal-Argument-Excepted
    //Thay vì nhận về 1 giá trị thì nhận về 1 câu chửi
    //ta đo lường có câu chửi xuất hiện khi n = -5
    //Thấy ngoại lệ mừng rơi nc mắt
    
    //nếu -5 mà app ném ra ngoại lệ nghĩa là hàm ổn, chạy như thiết kế, như kỳ vọng
    //vậy nghĩa là hàm passed màu xanh
    //ĐÚng kỳ vọng
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
        
        //Test case 6: n = -5, hy vọng thấy ngoại lệ tên là IllegalArgumentException
        
    }
}

//@Test là 1 ký hiệu automation báo vs Junit và JVM để generate cái hàm Assert() thành main truyển fthoongs
//và gửi cho JVM để chạy, app chạy từ main()
//thiếu @Test tương đương app thiếu main() no-runable


//CHỐT DEAL XANH ĐỎ: 
//Nếu tất cả test case đều màu xanh -> kết luận hàm đúng cho những thứ mình đã test, xanh khi tất cả @Test cùng xanh 
//nếu trong các @Test có ít nhất 1 thg đỏ, xem như tất cả là đỏ, ý nghĩa là ĐÚNG thì phải ĐÚNG HẾT, có 1 thg sai 
//hàm ko ổn định về kết quả -> phải gọi là hàm sai

//2. ĐỎ khi có ít nhất 1 thg đỏ
//EXPECTED đã tính đúng, ACTUAL trả về sai -> BUG của hàm
//EXPECTED đã tính/gõ sai, ACTUAL sai -> đúng