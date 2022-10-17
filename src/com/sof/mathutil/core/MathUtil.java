/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sof.mathutil.core;

/**
 *
 * @author kiety
 */
public class MathUtil {
    //trong class này ta sẽ viết các hàm tiện ích/dùng chung cho nhiều class khác
    //cái gì mà dùng chung cho các class khác thường sẽ thiết kế là STATIC 
    

    //tính giai n! = 1*2*3*4....n
    //qui ước: ko tính giai thừa âm
    //0! = 1! = 1
    //chỉ tính n từ 1...20 vì 21! vượt 18 con số 0, vượt long
    
    
    //CASE 1:
//    public static long getFactorial(int n){
//        
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. N must be between 0...20");
//        
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long product = 1;//biến tích lũy acc/accumulation
//        for (int i = 2; i <= n; i++) 
//            product *= i; //product * i
//        
//        return product;
//        
//        
//    }
    
    //viết hàm theo style đệ quy
    //n! = 1.2.3.4.5...n
    //5! = 5 * 4!
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. N must be between 0...20");
        
        if(n == 0 || n == 1)
            return 1;//chốt dừng đệ qui
        
        //từ 21 trở đi là đoạn code dưới đây
        return n * getFactorial(n - 1);
    }
    
    
    //học kỹ thuật viết code đc gọi là TDD - TEST DRIVEN DEVELOPEMENT
    //là kỹ thuật ngay khi viết code, ngay khi thiết kế ra tên hàm/CLASS
    //đã phải chuẩn bị luôn bộ kiểm thử - chuẩn bị luôn các TEST CASE
    //chuẩn bị luôn các tình huống(case) sẽ xài hàm này thế nào
    //chuẩn bị luôn các tình huống test các hàm để xác định hàm đúng/sai
    //viết code hướng về đảm bảo các bài kiểm thử đặt ra
    //các test case - các tình huống xài hamd 1 khi hàm viết xong
    //case 1: n = 0; getFactorial(0) -> expected hy vọng hàm sẽ trả ra: 1
    //case 2: n = -5; getFactorial(-5) -> expected value: CHỬI, KO HỢP LỆ n
    //case 3: n = 21; getFactorial(21) -> expected value: CHỬI, KO HỢP LỆ n
    //TEST CASE: là một tình huống kiểm thử phần mềm xem nó có chạy đúng hay ko, bằng cách
    //đưa ra data cụ thể nào đó, xem nó có output ra đúng như dự kiến hay ko
    //tức là đưa data, chờ app xử lý và so sánh kết quả actual với expected
    
    
}
