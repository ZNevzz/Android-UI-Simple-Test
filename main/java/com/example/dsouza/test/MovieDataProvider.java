
public class MovieDataProvider{
	
    private String movieRatings;
	private String movieTitles;	
	
	public MovieDataProvider(String movieRatings,String movieTitles){
		
		this.movieRatings=movieRatings;
		this.movieTitles=movieTitles;
	}
	
	public String getMovieRatings(){
		return this.movieRatings;
	}
	
	public void setMovieRatings(String movieRatings){
		this.movieRatings=movieRatings;
	}
		
	public void setMovieTitles(String movieTitles){
		this.movieTitles=movieTitles;
	}
	public String getMovieTitles(){
		return this.movieTitles;
	}
	
    
}
