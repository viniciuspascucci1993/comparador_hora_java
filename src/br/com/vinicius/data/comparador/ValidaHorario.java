package br.com.vinicius.data.comparador;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ValidaHorario {

	public static void main(String[] args) {
	
		// Pega data atual ( agora )
		Date dataAgora = new Date();
		
		Date dataInicialNull = null;
		Date dataFinalNull = null;
		
		// Setando calendarioInicial ( horas, minutos e segundos )
		Calendar calendarioInicial = Calendar.getInstance();
		calendarioInicial.setTime(new Date());
		calendarioInicial.set(Calendar.HOUR_OF_DAY, 9);
		calendarioInicial.set(Calendar.MINUTE, 0);
		calendarioInicial.set(Calendar.SECOND, 0);
		// Capturando a data Inicial ( 09:00 )
		Date dataInicial = calendarioInicial.getTime();
		
		// Setando calendarioFinal ( horas, minutos e segundos )		
		Calendar calendarioFinal = Calendar.getInstance();
		calendarioFinal.setTime(new Date());
		calendarioFinal.set(Calendar.HOUR_OF_DAY, 16);
		calendarioFinal.set(Calendar.MINUTE, 0);
		calendarioFinal.set(Calendar.SECOND, 0);
		// Capturando a data final ( 16:00 )
		Date dataFinal = calendarioFinal.getTime();
		
		if (dataAgora.after(dataInicial) && dataAgora.before(dataFinal))  {
			
			System.out.println("ABERTURA/FECHAMENTO - DENTRO DO PERIODO DE MOVIMENTAÇÃO DO FUNDO");
			
		} else if(dataInicial.equals(dataInicialNull) && dataFinal.equals(dataFinalNull)){
			
			System.out.println("ABERTURA/FECHAMENTO - MOVIMENTO LIVRE - PERMITIDO QUALQUER HORARIO");
			
		} else {
			
			System.out.println("ABERTURA/FECHAMENTO - FORA DO PERIODO DE MOVIMENTAÇÃO DO FUNDO");
		}
		
		SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
		String dataFormatadaInicial = formato.format(dataInicial);
		String dataFormatadaFinal = formato.format(dataFinal);
		
		System.out.println(dataFormatadaInicial);
		System.out.println(dataFormatadaFinal);
	}

}
