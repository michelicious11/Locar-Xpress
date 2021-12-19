package locosys.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;

import locosys.models.Client;
import locosys.models.ContratLocation;
import locosys.vehicules.Vehicules;
import net.proteanit.sql.DbUtils; 

public class ContratLocationController {
	private static String url = "jdbc:sqlite:locosys.db";
	
	public double calculateDuree(LocalDateTime dateHeureDepart, LocalDateTime dateHeureRetour) {
		return 1;
	}
	
	public double calculateMontantBase(int duree) {
		return 1;
	}
	
}
