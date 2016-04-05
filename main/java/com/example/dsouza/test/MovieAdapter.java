package com.example.dsouza.test;




public class MovieAdapter extends BaseAdapter{
    
	List list= new ArrayList();
	
	//constructor
	public MovieAdapter(Context context, int resource){
		super(context, resource);
	}
	
	static class DataHandler{
		
		ImageView i;
		TextView t1;
		TextView t2;
	}
	
	public void add(Object object){
		super(object);
		list.add(object);
	}
	
	public Object getItem(int pos){
		return this.list.get(pos);
	}
	
	public View getView(int pos, View view, ViewGroup parent){
		View row;
		DataHandler handler;
		row = view;
		if(view == null){
			
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.activity_scorecard_dynamic, parent, false);
			
			handler = new DataHandler();
			handler.i = (ImageView)row.findViewById(R.id.movie_poster);
			handler.t1 = (TextView)row.findViewById(R.id.movie_title);
			handler.t2 = (TextView)row.findViewById(R.id.movie_rating);
			row.setHandler(handler);
		}
		else{
			handler = (DataHandler) row.getTag();
		}
			
		MovieDataProvider dataProvider;
		dataProvider= (MovieDataProvider)this.getItem(pos);
		//handler.i.setImageResource();
		handler.t1.setText(dataProvider.getMovieTitles());
		handler.t2.setText(dataProvider.getMovieRatings());
		
		//return super.getView(pos, view, parent);
		return row;
	}
	
    public int getCount(){
		return this.list.size();
	}
	
}
