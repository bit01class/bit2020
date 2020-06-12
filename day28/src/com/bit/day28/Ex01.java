package com.bit.day28;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ex01 {

	public static void main(String[] args) {
		capture();
		System.out.println("(��ũ����)ȭ���� ĸ���Ͽ����ϴ�");
	}
	public static void capture() {
		try {
			// ��ü ȭ�� Capture
			BufferedImage screencapture = new Robot()
					.createScreenCapture(new Rectangle(Toolkit
							.getDefaultToolkit().getScreenSize()));

			// JPEG ����.
			File file = new File(
					"capture.jpg");
			ImageIO.write(screencapture, "jpg", file);
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
