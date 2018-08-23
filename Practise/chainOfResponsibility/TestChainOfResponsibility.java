package chainOfResponsibility;

import chainOfResponsibility.impl.RequestPreProcess;
import chainOfResponsibility.impl.RequestProcess;
import chainOfResponsibility.impl.RequestReceiver;
import chainOfResponsibility.impl.RequestValidator;
import chainOfResponsibility.intf.HandlerIf;

public class TestChainOfResponsibility {

	public TestChainOfResponsibility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HandlerIf receiver = new RequestReceiver("Request Receiver");
		HandlerIf validator = new RequestValidator("Request Validator");
		
		HandlerIf preProcessor = new RequestPreProcess("Pre Process");
		HandlerIf processor = new RequestProcess("Request Process");
		receiver.setHandler(validator);
		validator.setHandler(preProcessor);
		preProcessor.setHandler(processor);
		
		Request r = new Request();
		r.setRequestType("Validate");
		receiver.process(r);
		
		 r = new Request();
			r.setRequestType("Processor");
			receiver.process(r);
	}

}
