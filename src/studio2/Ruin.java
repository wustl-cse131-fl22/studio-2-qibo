package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
double startAmount = in.nextDouble();
double currentamount;
double winChance = in.nextDouble();
double winLimit = in.nextDouble();
double totalSimulations=in.nextDouble();
double lostcount=0;
int stimulationcount=0;
double ifwin;
boolean didwin = false;
int count=0;
String WINLOSE = null;
for(int i=0;i<totalSimulations;i++) {
	currentamount= startAmount;
	count=0;
	stimulationcount++;
while(currentamount<winLimit && currentamount>0) {
	ifwin = Math.random()*100;
	if(ifwin<winChance) {
		currentamount++;
		count++;
	}else {
		currentamount--;
		count++;
	}
	if(currentamount==0) {
		didwin=false;
		lostcount++;
	}else {
		didwin=true;
	}
	if(didwin) {
		WINLOSE="WIN";
	}else {
		WINLOSE="LOSE";
	}
}

System.out.println("stimulation " + stimulationcount +" "+count+" "+ WINLOSE);
}
double a = (1-(winChance/100))/(winChance/100);

double expected =(Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
double ruinrate = lostcount/totalSimulations*100;
System.out.println("lost: "+lostcount+ " total simulations:"+totalSimulations);
System.out.println("Ruin Rate from Simulation:"+ruinrate+ "%"+" Expected Ruin Rate:"+ expected );

	
	}

}
