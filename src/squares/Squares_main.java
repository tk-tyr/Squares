//y=10.607x+1.075

package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x[] = { 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6,0.7 };
	    double y[] = { 1.1, 2.1, 3.3, 4.1, 5.4, 6.3, 7.5,8.5 };
	    double theta[] = new double[2];
	    
	    Squares_lib slib = new Squares_lib(x, y);

	    for(int i = 0; i < 100; i++){
            theta = slib.getDx();
            System.out.println(i+" : theta[0] = "+theta[0]);
            System.out.println(i+" : theta[1] = "+theta[1]);
            System.out.println(i+" : Objective function = "+slib.getRx());
        }


	}

}
