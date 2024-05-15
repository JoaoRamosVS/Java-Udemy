package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		Instant i1 = Instant.now();
		
		LocalDate ld1 = LocalDate.ofInstant(i1, ZoneId.systemDefault());
		
		LocalDateTime ldt1 = LocalDateTime.ofInstant(i1, ZoneId.systemDefault());
		
		System.out.println("Data Hora de londres: " + i1);
		System.out.println("Data da máquina: " + ld1);
		System.out.println("Data hora da máquina: " + ldt1);

		System.out.println();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("GMT0"));
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("Data Hora de londres formatada: " + fmt1.format(i1));
		System.out.println("Data da máquina formatada: " + ld1.format(fmt2));
		System.out.println("Data hora da máquina formatada: " + fmt3.format(ldt1));
		System.out.println("Data Hora de londres formatada e convertida: " + fmt3.format(i1));
	
		LocalDateTime ldt2 = ldt1.minusDays(7);
		Instant i2 = i1.minus(7, ChronoUnit.DAYS);
		
		Duration d1 = Duration.between(ldt2, ldt1);
		
		System.out.println("Duração entre duas datas: " + d1.toDays());
	}

}
