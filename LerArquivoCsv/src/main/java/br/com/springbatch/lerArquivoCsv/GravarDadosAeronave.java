package br.com.springbatch.lerArquivoCsv;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.stereotype.Component;

@Component
public class GravarDadosAeronave extends JdbcBatchItemWriter<Aeronave> {

	private static final String SQL_COMMAND =
		      "INSERT INTO aeronave (record_key, iata_codigo, icao_codigo, nome) " +
		          "VALUES (:recordKey, :iataCodigo, :icaoCodigo, :nome) " +
		          "ON DUPLICATE KEY " +
		          "UPDATE iata_codigo = :iataCodigo, icao_codigo = :icaoCodigo, nome = :nome";
	
	
	public GravarDadosAeronave(DataSource dataSource) {
	    this.setDataSource(dataSource);
	    this.setSql(SQL_COMMAND);
	    this.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
	    this.afterPropertiesSet();
	  }
}
