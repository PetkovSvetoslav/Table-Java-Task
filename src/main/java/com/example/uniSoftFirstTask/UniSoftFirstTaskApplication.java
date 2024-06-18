package com.example.uniSoftFirstTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class UniSoftFirstTaskApplication {

	private static final Logger logger = LoggerFactory.getLogger(UniSoftFirstTaskApplication.class);

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");

		SpringApplication.run(UniSoftFirstTaskApplication.class, args);

		if (!GraphicsEnvironment.isHeadless()) {
			SwingUtilities.invokeLater(TableApp::new);
		} else {
//			System.err.println("Cannot start GUI in a headless environment");
			logger.error("Cannot start GUI in a headless environment");
		}
	}
}
