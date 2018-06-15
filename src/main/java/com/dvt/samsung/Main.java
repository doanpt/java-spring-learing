package com.dvt.samsung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.dvt.samsung" })
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
// Entity là các POJO, ánh xạ từ các bảng CSDL
// Repository là các interface trực tiếp truy cập và thao tác với CSDL
// Service là các lớp có nhiệm vụ xử lý business logic, không trực tiếp truy cập
// vào CSDL mà sẽ lấy dữ liệu từ Repository, rồi chuyển cho Controller
// Controller là các lớp chỉ quan tâm đến request của người dùng: đọc input, xử
// lý input, lấy dữ liệu từ Service đổ ra View. Mỗi một Controller sẽ có nhiều
// phương thức tương ứng với các use case riêng
// View là các file html - giao diện người dùng
// https://kipalog.com/posts/Lap-trinh-Spring-voi-ung-dung-MyContact