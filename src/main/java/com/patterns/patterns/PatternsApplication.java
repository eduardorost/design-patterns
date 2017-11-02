package com.patterns.patterns;

import com.patterns.patterns.abstractFactory.ShoeFactory;
import com.patterns.patterns.adapter.InternalTransferAdapter;
import com.patterns.patterns.adapter.models.Transfer;
import com.patterns.patterns.adapter.services.TransferService;
import com.patterns.patterns.bridge.services.BlueCircleService;
import com.patterns.patterns.bridge.services.RedCircleService;
import com.patterns.patterns.bridge.model.Circle;
import com.patterns.patterns.bridge.model.Shape;
import com.patterns.patterns.builder.CamaraBuilder;
import com.patterns.patterns.builder.CamaraMaker;
import com.patterns.patterns.builder.OpticalZoomCamaraBuilder;
import com.patterns.patterns.builder.models.Camara;
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
	private ShoeFactory nikeFactory;
	@Autowired
	@Qualifier("adidasFactory")
	ShoeFactory adidasFactory;

	@Autowired
	private InternalTransferAdapter internalTransferAdapter;
	@Autowired
	TransferService transferService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Abstract Factory");
		logger.info(nikeFactory.makeSandal().infos());
		logger.info(nikeFactory.makeSneaker().infos());
		logger.info(adidasFactory.makeSandal().infos());
		logger.info(adidasFactory.makeSneaker().infos());

		logger.info("Adapter");
		Transfer transfer = new Transfer(10, "1", "9999-9");
		internalTransferAdapter.doTransfer(transfer);
		transferService.doTransfer(transfer);

		logger.info("Bridge");
		Shape redCircle = new Circle(100,100, 10, new RedCircleService());
		Shape greenCircle = new Circle(100,100, 10, new BlueCircleService());
		redCircle.draw();
		greenCircle.draw();

		logger.info("Adapter");
		CamaraMaker cm = new CamaraMaker();
		CamaraBuilder opticalZoomCamaraBuilder = new OpticalZoomCamaraBuilder();
		cm.setCamaraBuilder(opticalZoomCamaraBuilder);
		cm.constructCamara();
		logger.info(String.valueOf(cm.getCamara()));
	}
}
