package methodOverriding;

// 3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc.
//    Demonstrate polymorphism using them.

public class MovieDriver {

	public static void main(String[] args) {
		
		Movie movie=new Movie();
		Movie romComovie=new RomComMovie();
		Movie thrillerMovie=new ThrillerMovie();
		
		movie.playMovie();
		romComovie.playMovie();
		thrillerMovie.playMovie();
		
		movie.movieType();
		romComovie.movieType();
		thrillerMovie.movieType();

	}

}


class Movie{
	public void playMovie() {
		System.out.println("Movie is playing");
	}
	public void movieType(){
		System.out.println("Movie Type: Normal");
	}
}

class RomComMovie extends Movie{
	public void playMovie() {
		System.out.println("RomComMovie is playing");
	}
	public void movieType(){
		System.out.println("Movie Type: RomCom");
	}
}

class ThrillerMovie extends Movie{
	public void playMovie() {
		System.out.println("Thriller Movie is playing");
	}
	public void movieType(){
		System.out.println("Movie Type: Thrill");
	}
}
