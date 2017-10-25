package com.patterns.patterns;

import com.patterns.patterns.abstractFactory.ShoeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(PatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
	}

	@Autowired
	@Qualifier("nikeFactory")
	ShoeFactory nikeFactory;
	@Autowired
	@Qualifier("adidasFactory")
	ShoeFactory adidasFactory;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Abstract Factory");
		logger.info(nikeFactory.makeSandal().infos());
		logger.info(nikeFactory.makeSneaker().infos());
		logger.info(adidasFactory.makeSandal().infos());
		logger.info(adidasFactory.makeSneaker().infos());
	}
}
