package Main;
import java.util.Random;
public class PulsSubtraction01 {
	static int randoms() {
		Random random = new Random();
		return ((int)random.nextInt(100));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula []formula = new Formula[100];
		int s=0;
		int x,y,w,g;
		for(int i=0;i<50;i++) {
			x=randoms();
			y=randoms();
			g=randoms();
			w=1;
			if(g%2==1)
					w=-1;
			if((x+(y*w))<0 || (x+(y*w)>100)) {
				i--;
				continue;
			}
			for(int j=0;j<i;j++) {
				if(x==formula[j].x && y==formula[j].y && w==formula[j].w) {
					i--;
					continue;
				}
			}
			formula[i] = new Formula(x,y,w);
			System.out.print(++s + " : ");
			System.out.print(x + (w==1?" + ":" - ") + y + " = " + (x+y*w));
			if(s%5==0) 
				System.out.println();
			else
				System.out.print(" ");
		}
	}

}
