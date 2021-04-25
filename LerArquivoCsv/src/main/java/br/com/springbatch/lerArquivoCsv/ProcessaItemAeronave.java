package br.com.springbatch.lerArquivoCsv;

import java.util.Optional;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.util.StringUtils;

@Component
public class ProcessaItemAeronave implements ItemProcessor<Aeronave, Aeronave> {

	public Aeronave processa(final Aeronave aer) {
		String recordKey = !StringUtils.isEmpty(aer.getIataCodigo()) ? aer.getIataCodigo() : aer.getIcaoCodigo();
		if (StringUtils.isEmpty(recordKey)) {
			return null;
		} else {
			aer.setRecordKey(recordKey);
			aer.setIataCodigo(Optional.ofNullable(aer.getIataCodigo()).map(String::toUpperCase).orElse(null));
			aer.setIcaoCodigo(Optional.ofNullable(aer.getIcaoCodigo()).map(String::toUpperCase).orElse(null));
			return aer;
		}
	}
	
	@Override
	public Aeronave process(Aeronave item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}