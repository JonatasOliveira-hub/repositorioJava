package br.com.batch.jonatas.meuprojetobatch;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ApacheCamelPrincipal extends RouteBuilder  {
			//O método configure, permite fazer tranformações além de setar as rotas. 
			//Pelo fato da classe está como component, ele vira um Bean, que vai para a classe principal.
        	@Override
            public void configure() throws Exception {
                from("file:C:\\Users\\Desktop\\Documents\\Teste?noop=true").to("file:C:\\Users\\Desktop\\Documents");
            }
        }

