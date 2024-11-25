package Main;

public class Ex226 {
	public static double first_degree_one_varible(double a, double b) {
		if (a == 0) {
			if (b != 0) {
				System.out.println("No solution");
			}
			else {
				System.out.println("Infinite solutions");	
			}
		}
		else {
			System.out.println("x = " + (-b/a));
		}
		return 0;
	}
	
	public static double first_degree_two_variable(double a11, double a12, double b1, double a21, double a22, double b2) {
		double determinant = a11 * a22 - a21 * a12;
		double D1 = b1 * a22 - b2 * a21;
		double D2 = a11 * b2 - a21 * b1;
		if ((determinant == 0 && D1 != 0) || (determinant == 0 && D2 != 0)) {
			System.out.println("No solution");
		}
		else if (determinant == 0 && D1 == 0 && D2 == 0) {
			System.out.println("Infinite solution");
		}
		else if (determinant != 0) {
			System.out.println("x = " + (D1/determinant));
			System.out.println("y = " + (D2/determinant));
		}
		return 0;
	}
	
    public static double second_degree_one_varible(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("No solution");
        }
        else if (delta == 0) {
            System.out.println("One solution x = " + (- b / (2 * a)));
        }
        else {
            System.out.println("x1 = " + ((- b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((- b - Math.sqrt(delta)) / (2 * a)));
        }
        return 0;
    }

	public static void main(String[] args) {
		first_degree_one_varible(0,0);
		first_degree_two_variable(2, -3, 1, 1, 2, 3);
		second_degree_one_varible(2, 3, 1);
	}

}
