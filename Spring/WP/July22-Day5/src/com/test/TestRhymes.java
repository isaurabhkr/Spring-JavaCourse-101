package com.test;

import threads.DisplayRhymes;
import threads.RhymeReader;

public class TestRhymes {
	public static void main(String[] args) {
		DisplayRhymes obj= new DisplayRhymes();
		RhymeReader r1= new RhymeReader("Twinkle,Twinkle,Lil,Star", obj);
		RhymeReader r2= new RhymeReader("Baba,Baba,Black,Sheep", obj);
		}

}
