package chainOfResponsibility.impl;

import chainOfResponsibility.Request;
import chainOfResponsibility.intf.HandlerIf;

public class RequestPreProcess implements HandlerIf{
	private HandlerIf handler;
	private String handlerName;

	public RequestPreProcess(String handlerName) {
		this.handlerName = handlerName;

	}

	@Override
	public void setHandler(HandlerIf handler) {
		this.handler = handler;

	}

	@Override
	public void process(Request req) {
		if ("PreProcessor".equals(req.getRequestType())) {
			System.out.println("RequestPreProcess ....");
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
