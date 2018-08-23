package chainOfResponsibility.impl;

import chainOfResponsibility.Request;
import chainOfResponsibility.intf.HandlerIf;

public class RequestValidator implements HandlerIf {

	private HandlerIf handler;
	private String handlerName;

	public RequestValidator(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(HandlerIf handler) {
		this.handler = handler;

	}

	@Override
	public void process(Request request) {
		if ("Validate".equals(request.getRequestType())) {
			System.out.println("Do Validate ....");
		} else if (handler != null) {
			System.out.println("Forward the request ....");
			handler.process(request);

		} else {
			System.out.println("Operation Not Supported ....");
		}

	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}
