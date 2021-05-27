package br.com.batch.jonatas.meuprojetobatch;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class ApacheCamelPrincipal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteBuilder() {
            public void configure() throws Exception {
                from("file:C:\\Users\\Desktop\\Documents\\Teste?noop=true").
                        to("file:C:\\\\Users\\\\Desktop\\\\Documents");
            }
        });

        camelContext.start();
        Thread.sleep(5000);
        camelContext.stop();
	}

}
