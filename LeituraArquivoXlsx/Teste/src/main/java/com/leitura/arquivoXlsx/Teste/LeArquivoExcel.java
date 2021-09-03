package com.leitura.arquivoXlsx.Teste;

import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@Configuration
public class LeArquivoExcel {

	@Bean
    ItemReader<AlunoDTO> excelStudentReader() {
        PoiItemReader<AlunoDTO> ler = new PoiItemReader<>();
        ler.setLinesToSkip(1);
        ler.setResource(new ClassPathResource("data/students.xlsx"));
        ler.setRowMapper(excelRowMapper());
        return ler;
    }
}
