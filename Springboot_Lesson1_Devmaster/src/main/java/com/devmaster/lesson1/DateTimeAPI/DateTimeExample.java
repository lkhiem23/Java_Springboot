package com.devmaster.lesson1.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // 1. Lấy ngày giờ hiện tại
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Ngày hôm nay: " + currentDate);
        System.out.println("Giờ hiện tại: "+ currentTime);
        System.out.println("Ngày giờ hôm nay: " + currentDateTime);

        // 2. Định dạng ngày giờ
        // Định dạng ngày giờ theo mẫu dd/MM/yyyy HH:mm:ss
        DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Lấy ngày giờ hiện tại
        LocalDateTime ngayGioHienTai = LocalDateTime.now();
        // Định dạng ngày giờ
        String ngayGioDinhDang = ngayGioHienTai.format(dinhDang);
        // In ra ngày giờ đã định dạng
        System.out.println("Ngày giờ hiện tại: " + ngayGioDinhDang);

        // 3. Phân tích chuỗi ngày
        String dateString = "27/11/2024";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Ngày đã phân tích: " + parsedDate);

        // 4. Thêm và trừ thời gian (1 tuần tới và 1 tuần trước)
        LocalDate nextWeek = currentDate.plusWeeks(1);
        LocalDate previosWeek = currentDate.minusWeeks(1);

        System.out.println("Tuần tới: " + nextWeek);
        System.out.println("Tuần trước: " + previosWeek);

        // 5. Làm việc với múi giờ
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("Ngày giờ tại Seoul: " + zonedDateTime);

        // 6. Khoảng cách giữa hai ngày:
        LocalDate startDate = LocalDate.of(2024, 12,01);
        LocalDate endDate = LocalDate.of(2024, 12,06);

        // Tính khoảng cách giữa 2 ngày:
        Period period = Period.between(startDate, endDate);

        // Hiển thị kết quả:
        System.out.println("Khoảng cách giữa hai ngày: "+
                period.getYears() + "năm, "+
                period.getMonths() + "tháng, "+
                period.getDays() + "ngày, "
        );
    }
}
