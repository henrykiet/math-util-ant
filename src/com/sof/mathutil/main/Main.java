/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sof.mathutil.main;

import com.sof.mathutil.core.MathUtil;

/**
 *
 * @author kiety
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case 1: n = 0 -> expected getF(0) -> trả về 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! status: expected = " + expected + " | actual = " + actual);

        //Test case 2: n = 1 -> expected getF(1) -> trả về 1
        System.out.println("1! status: expected = 1 | actual = " + MathUtil.getFactorial(1));

        //Test case 3: n = 5 -> expected getF(5) -> trả về 120
        System.out.println("5! status: expected = 120 | actual = " + MathUtil.getFactorial(5));

        //Test case 4: n = -5 -> expected getF(-5) -> CHỬI 
        //System.out.println("-5! status: expected = EXCEPTION | actual = " + MathUtil.getFactorial(-5));
        //có ngoại lệ xảy ra, Mừng rơi nc mắt
        System.out.println("-5! status: expected = EXCEPTION" + " | actual = ");
        MathUtil.getFactorial(-5);
        

        //việc chạy bộ TEST / xem từng kết quả đc in ra, để suy luận, so sánh, để K/L đúng sai -> mất sức
        //vì phải dùng mắt + suy luận -> MANUAL TEST,rất thủ công
        //ko hiệu quả nếu CODE đc chỉnh sửa, ta lai phải luận lại kết quả bằng thủ công: mắt quét các kết quả,
        //tự so sánh, tự kết luận
        
        //KỸ THUẬT THỨ 2 XUẤT HIỆN
        //TEST AUTOMATION : tức là vẫn chạy bộ test như MANUAL, nhưng ko cần mắt nhìn từng kết quả để so sánh
        // máy sư sức so sánh, máy kết luận dùm luôn, ta chỉ nhìn 2 thứ duy nhất sau khi chạy qua 1 đám test case:
        // đúng/sai
        
    }

}
