package loops;

public class Movies {
	static String theater ="Thinnappa";
			int ScreenNo;
	   String movieName;
	 int time;

	public Movies(int ScreenNo, String movieName) {
		// TODO Auto-generated constructor stub
		this.ScreenNo=ScreenNo;
		this.movieName=movieName;
	}

	public Movies(int ScreenNo, String movieNmae, int time) {
		// TODO Auto-generated constructor stub
		this.ScreenNo=ScreenNo;
		this.movieName=movieNmae;
		this.time=time;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
   Movies movie1 = new Movies(1,"Arul");
   Movies movie2 = new Movies(2,"aj");
   Movies movie3 = new Movies(3,"bhahupali");
   Movies movie4 = new Movies(4, "billa",10);   
//   movie1.ScreenNo=1;
//   movie1.movieName="Arul";
//   
//   movie2.ScreenNo=2;
//   movie2.movieName="aj";
//   
//   movie3.ScreenNo=3;
//   movie3.movieName="bhagupali";
//   
   System.out.println(movie3.movieName);
   System.out.println(movie2.ScreenNo);
   System.out.println(movie4.time);
	}

}
