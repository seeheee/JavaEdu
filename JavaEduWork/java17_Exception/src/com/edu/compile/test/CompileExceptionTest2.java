package com.edu.compile.test;
/*
 * 컴파일 시 예외 발생 -> 예외처리 반드시 해야함
 */


import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String fileName) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
		}
		catch(FileNotFoundException e) {
		
	}
}
	}
	
public class CompileExceptionTest2 {

	public static void main(String[] args) {
		FileReading f = new FileReading();
		String fileName = "C:\\JavaEduWork\\workshop01\\src\\com\\edu\\self\\Account.java";
		f.readFile(fileName);
		
		System.out.println("파일을 잘 읽어들였습니다.");

	}

}
