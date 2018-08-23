package chainOfResponsibility.intf;

import chainOfResponsibility.Request;

public interface HandlerIf {

	public void setHandler(HandlerIf handler);

	public void process(Request request);

	public String getHandlerName();
}
