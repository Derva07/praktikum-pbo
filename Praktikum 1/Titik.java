/**
* Titik.java 22/02/2023
* Nama/NIM 	: Derva Anargya Ghaly/24060121140149 
* Deskripsi : kelas yang berisi atribut dari titik
*/

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	void setAbsis(double x){
		absis = x;
	}
	
	void setOrdinat(double y){
		ordinat = y;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
	
}