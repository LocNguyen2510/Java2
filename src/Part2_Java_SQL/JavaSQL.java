package Part2_Java_SQL;

public class JavaSQL {

	public static void main(String[] args) {
		System.out.println("kết thúc quá trình học cấu trúc dữ liệu giải thuật với java");
//		những công cụ: Eclipse, Xampp (MySQL), HeidiSQL
		System.out.println("Ngày 1 sẽ ôn tập lại SQL và dùng Xampp để kết nối sql");

//		
//		CREATE DATABASE ontap            khởi tạo 1 database mới       
//		CHARACTER SET UTF8MB4
//		COLLATE utf8mb4_unicode_ciontap;
//		
//		
//		CREATE TABLE Persons(                          khởi tạo 1 table mới      
//				person_id INT NOT NULL AUTO_INCREMENT,        
//				last_name VARCHAR(20) NOT NULL,
//				first_name VARCHAR(20) NOT NULL,
//				gender VARCHAR(1),
//				dob DATE,
//				income DOUBLE,
//				PRIMARY KEY(person_id));persons
//				
//				
//				INSERT INTO persons(last_name,first_name,gender,dob,income)                 thêm dữ liệu vào table persons
//				VALUES 
//				("Vu","Nguyen Dinh","Male","2001-10-25",20000000),
//				("Minh","Nguyen Van","Male","2000-5-18",15000000),
//				("Toan","Pham Dinh","Female","2005-12-15",19000000)
//
//				 ;
//				
//				
//				-- UPDATE persons AS p                   cập nhật dữ liệu với lương thêm 5 triệu vào  table persons
//				-- SET income =income+5000000;
//				UPDATE persons
//				SET income = income+200000
//				WHERE last_name="Loc";
//				
//				
//				DELETE FROM persons                     xóa dữ liệu khác với last_name tên loc
//				WHERE last_name<> "Loc";
//
//				
//				
//				SELECT * FROM persons;                in ra tất cả dữ liệu có trong table

//				SELECT * FROM persons                    in ra tất cả dữ liệu có lương hơn 19 triệu trong table
//				WHERE income >19000000;
	}
}
