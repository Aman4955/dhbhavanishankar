package AtoZ;


class cuboid{
	
	public double length;
	public double breadth;
	public double heigth;
}
class applicatoin
{
	public double gtv(cuboid gob[])
	{
		double v_sum=0;
		for(cuboid gob:gob)
		{
			v_sum+= gob.length*gob.breadth*gob.heigth;
		}
			return v_sum;
	}
}

public class Ocp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuboid cb1=new cuboid();
		cb1.length=5;
		cb1.breadth=10;
		cb1.heigth=15;
		
		cuboid cb2=new cuboid();
		cb2.length=2;
		cb2.breadth=4;
		cb2.heigth=6;
		
		cuboid cb3=new cuboid();
		cb3.length=3;
		cb3.breadth=5;
		cb3.heigth=8;
		
		cuboid cb4=new cuboid();
		cb4.length=13;
		cb4.breadth=5;
		cb4.heigth=18;
		
		cuboid c_arr[]=new cuboid[4];
		c_arr[0]=cb1;
		c_arr[1]=cb2;
		c_arr[2]=cb3;
		c_arr[3]=cb4;
		
		applicatoin app=new applicatoin();
		double volume =app.gtv(c_arr);
		System.out.println("the total volume"+volume);


	}

}
