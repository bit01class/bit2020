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
		System.out.println("(스크린샷)화면을 캡쳐하였습니다");
	}
	public static void capture() {
		try {
			// 전체 화면 Capture
			BufferedImage screencapture = new Robot()
					.createScreenCapture(new Rectangle(Toolkit
							.getDefaultToolkit().getScreenSize()));

			// JPEG 저장.
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
