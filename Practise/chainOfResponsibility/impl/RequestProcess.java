package chainOfResponsibility.impl;

import chainOfResponsibility.Request;
import chainOfResponsibility.intf.HandlerIf;

public class RequestProcess implements HandlerIf{
	private HandlerIf handler;
	private String handlerName;

	public RequestProcess(String handlerName) {
		this.handlerName = handlerName;

	}

	@Override
	public void setHandler(HandlerIf handler) {
		this.handler = handler;

	}

	@Override
	public void process(Request req) {
		if ("Processor".equals(req.getRequestType())) {
			System.out.println("RequestProcess ....");
		} else if (handler != null) {
			System.out.println("Forward the request ....");
			handler.process(req);

		} else {
			System.out.println("Operation Not Supported ....");
		}

	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}
