class coordinate{
	friend double friendDistance(coordinate, coordinate);
	public:
		coordinate(double,double);
		coordinate(coordinate&);
		~coordinate();
		void setdate(double,double);
		double distance(coordinate);
		double get_x();
		double get_y();
	private:
		double x;
		double y;
};

