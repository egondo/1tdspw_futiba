package br.com.fiap.app;

import br.com.fiap.modelo.Partida;
import br.com.fiap.modelo.Time;

public class Quadrangular {

	public static void main(String[] args) {

		Time real = new Time("Real Madrid");
		Time arsenal = new Time("Arsenal");
		Time city = new Time("Manchester City");
		Time bayern = new Time("Bayern Munique");
		
		Partida p1 = new Partida(real, city, "Bernabeu", 1, 1);
		Partida p2 = new Partida(bayern, arsenal, "Munich", 1, 0);
		Partida p3 = new Partida(real, bayern, "Bernabeu", 3, 0);
		Partida p4 = new Partida(real, arsenal, "Emirates", 2, 1);
		Partida p5 = new Partida(bayern, city, "Etihad", 2, 3);
		Partida p6 = new Partida(city, arsenal, "Etihad", 3, 1);
		
		//System.out.println(real.getNome() + " " + real.getPontos());
		//System.out.println(arsenal.getNome() + " " + arsenal.getPontos());
		//System.out.println(city.getNome() + " " + city.getPontos());
		//System.out.println(bayern.getNome() + " " + bayern.getPontos());
		
		System.out.println(real);
		System.out.println(arsenal);
		System.out.println(city);
		System.out.println(bayern);
		
	}
}
